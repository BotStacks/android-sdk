/*
 * Copyright (c) 2023.
 */

package io.inappchat.app

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.inappchat.sdk.InAppChatActivity
import io.inappchat.sdk.ui.InAppChatContext
import io.inappchat.sdk.ui.InAppChatRoutes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this, InAppChatActivity::class.java))
        setContent {
            val navController = rememberNavController()
            MaterialTheme {
                InAppChatContext {
                    NavHost(navController = navController, startDestination = "splash") {
                        composable("splash") {
                            Splash(openChat = {
                                navController.navigate("chats") {
                                    popUpTo("splash") {
                                        inclusive = true
                                    }
                                }
                            }, openLogin = {
                                navController.navigate("login") {
                                    popUpTo("splash") {
                                        inclusive = true
                                    }
                                }
                            })
                        }
                        InAppChatRoutes(navController = navController, navGraphBuilder = this)
                    }
                }
            }
        }
    }
}
