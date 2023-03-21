/*
 * Copyright (c) 2023.
 */

package io.inappchat.sdk.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.inappchat.sdk.R
import io.inappchat.sdk.actions.block
import io.inappchat.sdk.models.AvailabilityStatus
import io.inappchat.sdk.state.User
import io.inappchat.sdk.ui.IAC.colors
import io.inappchat.sdk.ui.IAC.fonts
import io.inappchat.sdk.ui.InAppChatContext
import io.inappchat.sdk.ui.views.*
import io.inappchat.sdk.utils.IPreviews
import io.inappchat.sdk.utils.genU
import io.inappchat.sdk.utils.timeAgo

@Composable
fun ProfileView(user: User, back: () -> Unit, openChat: (User) -> Unit) {
  val scrollState = rememberScrollState()
  Column(
    modifier = Modifier
      .verticalScroll(scrollState)
      .fillMaxSize(1f)
  ) {
    Header(title = user.usernameFb, icon = { Avatar(url = user.avatar) }, back = back)
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxWidth()) {
      Avatar(url = user.avatar, 150.0)
      Space()
      Text(text = user.displayNameFb, iac = fonts.headline, color = colors.text)
      Box(
        modifier = Modifier
          .padding(12.dp, 5.dp)
          .radius(30.dp)
          .background(colors.softBackground),
        contentAlignment = Alignment.Center
      ) {
        Text(
          text = if (user.status == AvailabilityStatus.online) "Online" else user.lastSeen?.timeAgo()
            ?: "",
          iac = fonts.body,
          color = if (user.status == AvailabilityStatus.online) colors.primary else colors.caption
        )
      }

      if (user.isCurrent) {
        Divider(color = colors.softBackground)
        SimpleRow(
          icon = R.drawable.paper_plane_tilt_fill,
          text = "Send a Chat",
          iconPrimary = true
        ) {
          openChat(user)
        }
      }
      Row(Modifier.padding(top = 8.dp, start = 8.dp)) {
        Text("Shared Media", iac = fonts.body, color = colors.text)
      }
      val listState = rememberLazyListState()
      LazyRow(state = listState, modifier = Modifier.padding(start = 16.dp)) {
        itemsIndexed(user.sharedMedia.items, key = { index, item -> item.id }) { index, item ->
          MessageContent(message = item)
        }
      }
      Space(24f)
      Divider(color = colors.caption)
      if (!user.isCurrent) {
        SimpleRow(
          icon = if (user.blocked) R.drawable.lock_simple_open_fill else R.drawable.lock_fill,
          text = if (user.blocked) "Unblock ${user.usernameFb}" else "Block ${user.usernameFb}",
          iconPrimary = user.blocked,
          destructive = !user.blocked
        ) {
          user.block()
        }
      }
      GrowSpacer()
    }
  }
}

@IPreviews
@Composable
fun ProfileViewPreview() {
  InAppChatContext {
    ProfileView(user = genU(), back = { /*TODO*/ }, openChat = {})
  }
}