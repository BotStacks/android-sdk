# ai.botstacks.sdk - Kotlin client library for InAppChat

APIs for InAppChat

## Overview

This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project. By
using the [openapi-spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can
easily generate an API client.

- API version: 3.0.0
- Package version:
- Build package: org.openapitools.codegen.languages.KotlinClientCodegen

## Requires

* Kotlin 1.7.21
* Gradle 7.5

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI
  definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android
  targets.

<a name="documentation-for-api-endpoints"></a>

## Documentation for API Endpoints

All URIs are relative to *https://chat.inappchat.io/v3*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthApi* | [**changePassword**](docs/AuthApi.md#changepassword) | **POST** auth/change-password | Change Password
*AuthApi* | [**login**](docs/AuthApi.md#login) | **POST** auth/login | Login to InAppChat as a user on your Application.
*AuthApi* | [**logout**](docs/AuthApi.md#logout) | **POST** logout | Logout
*AuthApi* | [**logoutOtherDevices**](docs/AuthApi.md#logoutotherdevices) | **POST** logoutOtherDevices | Logout
*AuthApi* | [**nftLogin**](docs/AuthApi.md#nftlogin) | **POST** auth/nft/login | signup and login with NFT
*AuthApi* | [**resetPassword**](docs/AuthApi.md#resetpassword) | **POST** auth/reset-password | Forgot Password
*ChatApi* | [**deleteChatHistory**](docs/ChatApi.md#deletechathistory) | **DELETE** chat/{tid}/messages | Load chat history
*ChatApi* | [**deleteMessage**](docs/ChatApi.md#deletemessage) | **DELETE** message/{mid} | Delete Message API
*ChatApi* | [**getFavorites**](docs/ChatApi.md#getfavorites) | **GET** favorites |
*ChatApi* | [**getMessage**](docs/ChatApi.md#getmessage) | **GET** message/{mid} |
*ChatApi* | [**getMessages**](docs/ChatApi.md#getmessages) | **GET** chat/{tid}/messages | Load chat history
*ChatApi* | [**getReplies**](docs/ChatApi.md#getreplies) | **GET** message/{mid}/replies |
*ChatApi* | [**getReplyChats**](docs/ChatApi.md#getreplychats) | **GET** reply-chats | List reply chats
*ChatApi* | [**react**](docs/ChatApi.md#react) | **PUT** message/{mid}/reactions/{emoji} | Chat Reaction API
*ChatApi* | [**sendMessage**](docs/ChatApi.md#sendmessage) | **POST** message | Send a chat message
*ChatApi* | [**unreact**](docs/ChatApi.md#unreact) | **DELETE** message/{mid}/reactions/{emoji} |
*ChatApi* | [**updateMessage**](docs/ChatApi.md#updatemessage) | **PUT** message/{mid} | Edit Message API
*ChatReportApi* | [**approveChatReport**](docs/ChatReportApi.md#approvechatreport) | **PUT** reports/{chatReportId}/approve |
*ChatReportApi* | [**createChatReport**](docs/ChatReportApi.md#createchatreport) | **POST** message/{mid}/report |
*ChatReportApi* | [**deleteChatReportDelete**](docs/ChatReportApi.md#deletechatreportdelete) | **DELETE** reports/{chatReportId} | Delete Chat Report
*ChatReportApi* | [**getChatReport**](docs/ChatReportApi.md#getchatreport) | **GET** reports/{chatReportId} | Get Chat Report Details
*ChatReportApi* | [**getChatReportList**](docs/ChatReportApi.md#getchatreportlist) | **GET** reports | Get Chat Report List
*ChatReportApi* | [**ignoreChatReport**](docs/ChatReportApi.md#ignorechatreport) | **PUT** reports/{chatReportId}/ignore |
*ChatReportApi* | [**updateChatReport**](docs/ChatReportApi.md#updatechatreport) | **PUT** reports/{chatReportId} |
*ChatSettingApi* | [**getSettings**](docs/ChatSettingApi.md#getsettings) | **GET** settings | Get chat settings that contains profanity and domain filters
*DefaultApi* | [**getUserMessages**](docs/DefaultApi.md#getusermessages) | **GET** user/{uid}/messages |
*DefaultApi* | [**stub**](docs/DefaultApi.md#stub) | **GET** stub |
*DraftApi* | [**getDrafts**](docs/DraftApi.md#getdrafts) | **GET** draft | Draft API
*DraftApi* | [**updateDraft**](docs/DraftApi.md#updatedraft) | **POST** draft | Draft API
*FCMApi* | [**fCMValidationPost**](docs/FCMApi.md#fcmvalidationpost) | **POST** fcmValidation | FCM Validation
*ChatApi* | [**acceptChatInvite**](docs/ChatApi.md#acceptchatinvite) | **POST** chat/{gid}/invites/accept | accept chat invitation
*ChatApi* | [**addParticipant**](docs/ChatApi.md#addparticipant) | **PUT** chat/{gid}/participants/{uid} | Add participant to chat
*ChatApi* | [**createChat**](docs/ChatApi.md#createchat) | **POST** chats | Create or Update chat
*ChatApi* | [**deleteChat**](docs/ChatApi.md#deletechat) | **DELETE** chat/{gid} |
*ChatApi* | [**dismissChatInvite**](docs/ChatApi.md#dismisschatinvite) | **POST** chat/{gid}/invites/dismiss | dismiss chat invitation
*ChatApi* | [**getChat**](docs/ChatApi.md#getchat) | **GET** chat/{gid} | Get chat by chatId
*ChatApi* | [**getChats**](docs/ChatApi.md#getchats) | **GET** chats | Get user chats
*ChatApi* | [**getInvites**](docs/ChatApi.md#getinvites) | **GET** chat/invites | get chat invitation
*ChatApi* | [**chatAddAdmin**](docs/ChatApi.md#chataddadmin) | **PUT** chat/{gid}/admin/{uid} | Make a user an admin
*ChatApi* | [**chatDismissAdmin**](docs/ChatApi.md#chatdismissadmin) | **DELETE** chat/{gid}/admin/{uid} | Dismiss a chat admin
*ChatApi* | [**inviteUser**](docs/ChatApi.md#inviteuser) | **POST** chat/{gid}/invite | create chat invitation
*ChatApi* | [**moderateChat**](docs/ChatApi.md#moderatechat) | **POST** chat/{gid}/moderate |
*ChatApi* | [**removeChatImage**](docs/ChatApi.md#removechatimage) | **DELETE** chat/{gid}/image | Remove chat profile pic
*ChatApi* | [**removeParticipant**](docs/ChatApi.md#removeparticipant) | **DELETE** chat/{gid}/participants/{uid} | Remove participant from chat
*ChatApi* | [**updateChat**](docs/ChatApi.md#updatechat) | **PUT** chat/{gid} |
*SearchApi* | [**search**](docs/SearchApi.md#search) | **POST** search | Unified search API
*ChatApi* | [**createChat**](docs/ChatApi.md#createchat) | **POST** user/{uid}/chat | Chat Creation API
*ChatApi* | [**getChatChat**](docs/ChatApi.md#getchatchat) | **GET** chat/{gid}/chat |
*ChatApi* | [**getChat**](docs/ChatApi.md#getchat) | **GET** chat/{tid} | Chat Get API
*ChatApi* | [**getChats**](docs/ChatApi.md#getchats) | **GET** chats | Load chat history
*ChatApi* | [**updateChat**](docs/ChatApi.md#updatechat) | **PUT** chat/{tid} | Chat Update API
*UserApi* | [**blockUser**](docs/UserApi.md#blockuser) | **PUT** blocks/{uid} | Block a user
*UserApi* | [**deleteUserAvatar**](docs/UserApi.md#deleteuseravatar) | **DELETE** users/{uid}/avatar |
*UserApi* | [**getBlockedUsers**](docs/UserApi.md#getblockedusers) | **GET** blocks | Get blocked users
*UserApi* | [**getPendingEvents**](docs/UserApi.md#getpendingevents) | **GET** events |
*UserApi* | [**getUser**](docs/UserApi.md#getuser) | **GET** user/{uid} |
*UserApi* | [**getUsers**](docs/UserApi.md#getusers) | **GET** users |
*UserApi* | [**me**](docs/UserApi.md#me) | **GET** me |
*UserApi* | [**refreshAuthToken**](docs/UserApi.md#refreshauthtoken) | **GET** token/refresh | Refresh auth token
*UserApi* | [**resetBadgeCount**](docs/UserApi.md#resetbadgecount) | **GET** resetBadgeCount | reset notification badge count
*UserApi* | [**syncContacts**](docs/UserApi.md#synccontacts) | **POST** contacts/sync | Sync Contacts
*UserApi* | [**unblockUser**](docs/UserApi.md#unblockuser) | **DELETE** blocks/{uid} | Unblock a user
*UserApi* | [**updateMe**](docs/UserApi.md#updateme) | **POST** me |

<a name="documentation-for-models"></a>

## Documentation for Models

- [ai.botstacks.sdk.models.APIChat](docs/APIChat.md)
- [ai.botstacks.sdk.models.APIMessage](docs/APIMessage.md)
- [ai.botstacks.sdk.models.APIChat](docs/APIChat.md)
- [ai.botstacks.sdk.models.APIUser](docs/APIUser.md)
- [ai.botstacks.sdk.models.Auth](docs/Auth.md)
- [ai.botstacks.sdk.models.AutoDeleteSettings](docs/AutoDeleteSettings.md)
- [ai.botstacks.sdk.models.AvailabilityEvent](docs/AvailabilityEvent.md)
- [ai.botstacks.sdk.models.OnlineStatus](docs/OnlineStatus.md)
- [ai.botstacks.sdk.models.ChannelQuery](docs/ChannelQuery.md)
- [ai.botstacks.sdk.models.ChatReportEvent](docs/ChatReportEvent.md)
- [ai.botstacks.sdk.models.ChatReportEventEvent](docs/ChatReportEventEvent.md)
- [ai.botstacks.sdk.models.ChatReportEventEventEventData](docs/ChatReportEventEventEventData.md)
- [ai.botstacks.sdk.models.ChatSettings](docs/ChatSettings.md)
- [ai.botstacks.sdk.models.ChatSettingsDomainFilterInner](docs/ChatSettingsDomainFilterInner.md)
- [ai.botstacks.sdk.models.ChatSettingsProfanityFilterInner](docs/ChatSettingsProfanityFilterInner.md)
- [ai.botstacks.sdk.models.ChatStatus](docs/ChatStatus.md)
- [ai.botstacks.sdk.models.ChatStatusKeyListInner](docs/ChatStatusKeyListInner.md)
- [ai.botstacks.sdk.models.Contact](docs/Contact.md)
- [ai.botstacks.sdk.models.CreateChatReport](docs/CreateChatReport.md)
- [ai.botstacks.sdk.models.Email](docs/Email.md)
- [ai.botstacks.sdk.models.EncryptedMessage](docs/EncryptedMessage.md)
- [ai.botstacks.sdk.models.EncryptionKey](docs/EncryptionKey.md)
- [ai.botstacks.sdk.models.Event](docs/Event.md)
- [ai.botstacks.sdk.models.EventMessage](docs/EventMessage.md)
- [ai.botstacks.sdk.models.FCMValidationInput](docs/FCMValidationInput.md)
- [ai.botstacks.sdk.models.Forward](docs/Forward.md)
- [ai.botstacks.sdk.models.ChatUpdatEventChangeData](docs/ChatUpdatEventChangeData.md)
- [ai.botstacks.sdk.models.ChatUpdatEventChangeDataChatId](docs/ChatUpdatEventChangeDataChatId.md)
- [ai.botstacks.sdk.models.ChatUpdatEventChangeDataChatType](docs/ChatUpdatEventChangeDataChatType.md)
- [ai.botstacks.sdk.models.ChatUpdatEventChangeDataName](docs/ChatUpdatEventChangeDataName.md)
- [ai.botstacks.sdk.models.ChatUpdateEvent](docs/ChatUpdateEvent.md)
- [ai.botstacks.sdk.models.ChatUpdateEventData](docs/ChatUpdateEventData.md)
- [ai.botstacks.sdk.models.ChatUpdateEventItem](docs/ChatUpdateEventItem.md)
- [ai.botstacks.sdk.models.Invite](docs/Invite.md)
- [ai.botstacks.sdk.models.Location](docs/Location.md)
- [ai.botstacks.sdk.models.LoginInput](docs/LoginInput.md)
- [ai.botstacks.sdk.models.LoginPasswordInput](docs/LoginPasswordInput.md)
- [ai.botstacks.sdk.models.Media](docs/Media.md)
- [ai.botstacks.sdk.models.Mention](docs/Mention.md)
- [ai.botstacks.sdk.models.MessageResponse](docs/MessageResponse.md)
- [ai.botstacks.sdk.models.MessageStatus](docs/MessageStatus.md)
- [ai.botstacks.sdk.models.MessageType](docs/MessageType.md)
- [ai.botstacks.sdk.models.ModerateChatInput](docs/ModerateChatInput.md)
- [ai.botstacks.sdk.models.MsgReadEvent](docs/MsgReadEvent.md)
- [ai.botstacks.sdk.models.NFTLoginInput](docs/NFTLoginInput.md)
- [ai.botstacks.sdk.models.NewMessageEvent](docs/NewMessageEvent.md)
- [ai.botstacks.sdk.models.NotificationSettings](docs/NotificationSettings.md)
- [ai.botstacks.sdk.models.Participant](docs/Participant.md)
- [ai.botstacks.sdk.models.PhoneNumber](docs/PhoneNumber.md)
- [ai.botstacks.sdk.models.Reaction](docs/Reaction.md)
- [ai.botstacks.sdk.models.ReactionEvent](docs/ReactionEvent.md)
- [ai.botstacks.sdk.models.ReceiverReturnCode](docs/ReceiverReturnCode.md)
- [ai.botstacks.sdk.models.Reply](docs/Reply.md)
- [ai.botstacks.sdk.models.Report](docs/Report.md)
- [ai.botstacks.sdk.models.ReportCategory](docs/ReportCategory.md)
- [ai.botstacks.sdk.models.ReportChannelAdminStatus](docs/ReportChannelAdminStatus.md)
- [ai.botstacks.sdk.models.ReportStatus](docs/ReportStatus.md)
- [ai.botstacks.sdk.models.ReportTenantAdminStatus](docs/ReportTenantAdminStatus.md)
- [ai.botstacks.sdk.models.ResetPasswordInput](docs/ResetPasswordInput.md)
- [ai.botstacks.sdk.models.ReturnCode](docs/ReturnCode.md)
- [ai.botstacks.sdk.models.SearchInput](docs/SearchInput.md)
- [ai.botstacks.sdk.models.SearchQuery](docs/SearchQuery.md)
- [ai.botstacks.sdk.models.SearchResults](docs/SearchResults.md)
- [ai.botstacks.sdk.models.SelfUpdateItem](docs/SelfUpdateItem.md)
- [ai.botstacks.sdk.models.SenderKeyDetails](docs/SenderKeyDetails.md)
- [ai.botstacks.sdk.models.SenderReturnCode](docs/SenderReturnCode.md)
- [ai.botstacks.sdk.models.Stub](docs/Stub.md)
- [ai.botstacks.sdk.models.SyncContactsInput](docs/SyncContactsInput.md)
- [ai.botstacks.sdk.models.TenantUpdateEvent](docs/TenantUpdateEvent.md)
- [ai.botstacks.sdk.models.Token](docs/Token.md)
- [ai.botstacks.sdk.models.TypingEvent](docs/TypingEvent.md)
- [ai.botstacks.sdk.models.UpdateChatInput](docs/UpdateChatInput.md)
- [ai.botstacks.sdk.models.UpdateMessageEvent](docs/UpdateMessageEvent.md)
- [ai.botstacks.sdk.models.UpdateMessageInput](docs/UpdateMessageInput.md)
- [ai.botstacks.sdk.models.UpdateChatInput](docs/UpdateChatInput.md)
- [ai.botstacks.sdk.models.UpdateUserInput](docs/UpdateUserInput.md)
- [ai.botstacks.sdk.models.UserSelfUpdateEvent](docs/UserSelfUpdateEvent.md)
- [ai.botstacks.sdk.models.UserSelfUpdateEventData](docs/UserSelfUpdateEventData.md)

<a name="documentation-for-authorization"></a>

## Documentation for Authorization

<a name="ApiKeyAuth"></a>

### ApiKeyAuth

- **Type**: API key
- **API key parameter name**: X-API-Key
- **Location**: HTTP header

<a name="BearerAuth"></a>

### BearerAuth

- **Type**: HTTP basic authentication

<a name="DeviceId"></a>

### DeviceId

- **Type**: API key
- **API key parameter name**: X-Device-ID
- **Location**: HTTP header

