![Maven Central](https://img.shields.io/maven-central/v/io.inappchat/sdk) ![GitHub issues](https://img.shields.io/github/issues/inappchat/android-example)

![BotStacks Android](https://github.com/BotStacks/android-sdk/assets/106978117/3e59f00e-2bf2-4212-9f42-7275b0a0d05f)

# BotStacks Android SDK

> Delightful chat for your Android apps

Try the demo, download [BotStacks Android](https://play.google.com/store/apps/details?id=io.inappchat.sample)

&nbsp;

# 📃 Table of Contents

- [Overview](https://github.com/BotStacks/android-sdk#-overview)
- [Installation](https://github.com/BotStacks/android-sdk#-installation)
- [Getting Started](https://github.com/BotStacks/android-sdk#-getting-started)
- [Theming](https://github.com/BotStacks/android-sdk#-theming)

&nbsp;

# ✨ Overview

This SDK integrates a fully serviced chat experience on the [BotStacks](https://botstacks.ai) platform.

&nbsp;

# ⚙ Installation

Add `jitpack.io` to your repositories in your `settings.gradle`

```gradle
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url "https://jitpack.io" }
    }
}
```

&nbsp;

Add `io.inappchat:sdk:1.0.1` to your dependencies

```gradle

dependencies {
    implementation 'io.inappchat:sdk:1.0.1'
}

```

&nbsp;

# 🚀 Getting Started

The minimum it takes to add InAppChat is four lines of code.
This repo is also an example app using the Android SDK.

Feel free to clone it and view the source.

&nbsp;

### Step 1: Initialize the SDK

In your Application class, call InAppChat.setup with your API key. Create an account at [BotStacks.ai](https://Botstacks.ai) to get your own API key.

If you don't have an Application class, [create one](https://guides.codepath.com/android/Understanding-the-Android-Application-Class).

```kotlin
InAppChat.setup(apiKey)
```

&nbsp;

## Step 2: Render the UI

The InAppChat UI Kit uses Jetpack Compose.
You can add it to any `NavHost` by rendering inside an `InAppChatContext` and adding the `InAppChatRoutes`.
Navigate to InAppChat by calling `navController.navigate("chats")`

```kotlin
InAppChatContext {
    NavHost(navController = navController, startDestination = "splash") {
        val openChat = {
            navController.navigate("chats")
        }
        composable("splash") {
            Splash(openChat = openChat, openLogin = {
                navController.navigate("login")
            })
        }
        composable("login") {
            Login(openChat)
        }
        InAppChatRoutes(navController = navController, navGraphBuilder = this)
    }
}
```

&nbsp;

## Step 3: Push Notifications (Firebase Cloud Messaging)

For push notifications via FCM, just pass your push token to InAppChat

```kotlin
InAppChat.registerFCMToken(it)
```

&nbsp;

## Step 4: Giphy Support

If you'd like Giphy support in your chats, add the Giphy UI SDK to the your application.

```kotlin
Giphy.configure(this, getString(R.string.giphy))
```

&nbsp;

# 🖍 Theming

You can theme your InAppChat UI kit by passing in a theme to `InAppChatContext`. The theme supports fonts, colors and things like bubble border radius and image sizes. Provide a `Theme` to InAppChatUI

```kotlin
val customTheme = remember {
    makeTheme(this)
}
InAppChatContext(theme) {
    // App Content
}
```

&nbsp;

## Colors, Fonts and Assets

You can provide your own color themes to the theme object with a wide array of parameters. The UI kit uses both a light and a dark theme so provide both, as well as Fonts and Assets. Here's an example makeTheme function that customizes fonts, colors and assets used by the SDK

```kotlin
fun makeTheme(context: Context): Theme {
    val primary = Color(0xFF92C748)
    val fontName = GoogleFont("Nunito")

    val provider = GoogleFont.Provider(
            providerAuthority = "com.google.android.gms.fonts",
            providerPackage = "com.google.android.gms",
            certificates = array.com_google_android_gms_fonts_certs
    )
    val fontFamily = FontFamily(
            Font(googleFont = fontName, fontProvider = provider)
    )
    val app = { size: TextUnit, weight: FontWeight ->
        FontStyle(size, weight, fontFamily)
    }

    return Theme().apply {
        light = Colors(
                true,
                primary = primary,
                senderBubble = Color(0xFFC0D99E),
                senderUsername = primary
        )
        dark = Colors(
                false,
                primary = primary,
                senderBubble = Color(0xFFC0D99E),
                senderText = Color(0xFF202127),
                senderUsername = primary
        )
        fonts = Fonts(
                title = app(22.sp, FontWeight.ExtraBold),
                title2 = app(20.sp, FontWeight.SemiBold),
                title3 = app(15.sp, FontWeight.SemiBold),
                headline = app(13.sp, FontWeight.Bold),
                body = app(14.sp, FontWeight.Normal),
                caption = app(12.sp, FontWeight.Normal)
        )
        assets = Assets(
                drawable.pp_icon,
                emptyChannels = EmptyScreenConfig(
                        drawable.empty_channels,
                        "You haven't joined any channels yet"
                ),
                emptyChat = EmptyScreenConfig(
                        drawable.empty_chat,
                        "Your friends are ***dying*** to see you"
                ),
                emptyChats = EmptyScreenConfig(
                        drawable.empty_threads,
                        "You haven't added to any chats yet"
                ),
                emptyAllChannels = EmptyScreenConfig(
                        drawable.empty_all_channels,
                        "It's dead in here"
                )

        )
    }
}
```

&nbsp;

# 🙋‍♂️ Help

If you don't understand something in the documentation, you are experiencing problems, or you just need a gentle nudge in the right direction, please join our [Discord server](https://discord.com/invite/5kwyQCz3zZ)

---

**All Content Copyright © 2023 BotStacks**
