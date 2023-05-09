package com.g2minus.chatapp

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.util.Log
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.core.content.ContextCompat.startActivity
import io.inappchat.sdk.InAppChat
import io.inappchat.sdk.utils.Monitoring
import io.inappchat.sdk.utils.bg
import io.inappchat.sdk.utils.op
import kotlinx.coroutines.launch


@Stable
class AppState {

    var loading by mutableStateOf(true)
    var loggedIn by mutableStateOf(false)
    var ethAccounts = mutableListOf<String>()
    var tokens = mutableListOf<Token>()
    var didLoadTokens by mutableStateOf(false)
    var username by mutableStateOf<String?>(null)
    var signature by mutableStateOf<String?>(null)
    var token by mutableStateOf<Token?>(null)

    lateinit var uriString: String

    var wc: WalletConnect? = null

    fun load(app: App) =
        op({
            bg {
                InAppChat.load()
            }
            if (!InAppChat.shared.isUserLoggedIn) {
                wc = WalletConnect(app)
                uriString = wc!!.connect()
            }
            loggedIn = InAppChat.shared.isUserLoggedIn
            loading = false
        })

    fun login(cb: () -> Unit) {
        val token = this.token ?: return
        op({
            bg {
                InAppChat.shared.nftLogin(
                    contract = "0x41112a2e8626330752a8f9353462edd4771a48a2",
                    address = token.account,
                    tokenID = token.id,
                    signature = signature!!,
                    profilePicture = token.image,
                    username = username
                )
            }
            cb()
        })
    }

    fun getSignature(openDeeplink: (Uri) -> Unit) {
        val token = this.token ?: return
        op({
            val sig = bg {
                wc?.sign("InAppChat NFT Login", token.account, openDeeplink)
            }
            if (sig != null) {
                signature = sig
            }
        })
    }

    fun didConnect(accounts: List<String>) {
        op({
            didLoadTokens = false
            ethAccounts.addAll(accounts)
            val result = bg {
                var first = true
                accounts.map { account ->
                    if (!first)
                        Thread.sleep(1000)
                    first = false
                    Etherscan.getTokens(account)
                }
            }.flatten()
            tokens.addAll(result)
            didLoadTokens = true
        })
    }

    fun getSignature(activity: Activity) {
        val token = this.token ?: return
        try {
            InAppChat.shared.scope.launch {
                signature = bg {
                    wc?.sign(
                        "Login to G2Minus with Poison Pog ${token.id} and username $username",
                        token.account
                    ) {
                        activity.startActivity(Intent(Intent.ACTION_VIEW, it))
                    }
                }
            }
        } catch (err: Error) {
            Log.v("InAppChat", "Error " + err.stackTraceToString())
        }
    }
}

val appState = AppState()