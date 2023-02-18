# io.inappchat.sdk - Kotlin client library for Socket Server

APIs for Socket Server

## Overview
This API client was generated by the [OpenAPI Generator](https://openapi-generator.tech) project.  By using the [openapi-spec](https://github.com/OAI/OpenAPI-Specification) from a remote server, you can easily generate an API client.

- API version: 1.0.0
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
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://virtserver.swaggerhub.com/RBN/Socket-Server/1.0.0*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ChatApi* | [**allChatHistoryGet**](docs/ChatApi.md#allchathistoryget) | **GET** {version}/tenants/{tenantId}/{eRTCUserId}/chat/history | Load chat history
*ChatApi* | [**chat**](docs/ChatApi.md#chat) | **POST** {version}/tenants/{tenantId}/{eRTCUserId}/chat/ | Chat API
*ChatApi* | [**chatHistoryGet**](docs/ChatApi.md#chathistoryget) | **GET** {version}/tenants/{tenantId}/{eRTCUserId}/chat/{threadId}/history | Load chat history
*ChatApi* | [**chatMultiplePost**](docs/ChatApi.md#chatmultiplepost) | **POST** {version}/tenants/{tenantId}/{eRTCUserId}/chat/multiple | Chat API
*ChatApi* | [**chatReactionPost**](docs/ChatApi.md#chatreactionpost) | **POST** {version}/tenants/{tenantId}/{eRTCUserId}/chat/reaction | Chat Reaction API
*ChatApi* | [**chatSearchPost**](docs/ChatApi.md#chatsearchpost) | **POST** {version}/tenants/{tenantId}/{eRTCUserId}/chat/search | Chat Search API
*ChatApi* | [**clearChatHistory**](docs/ChatApi.md#clearchathistory) | **POST** {version}/tenants/{tenantId}/{eRTCUserId}/chat/{threadId}/history/clear | Load chat history
*ChatApi* | [**deleteChat**](docs/ChatApi.md#deletechat) | **DELETE** {version}/tenants/{tenantId}/{eRTCUserId}/chat/ | Delete Chat API
*ChatApi* | [**e2eEncryptionChat**](docs/ChatApi.md#e2eencryptionchat) | **POST** {version}/tenants/{tenantId}/{eRTCUserId}/chat/e2eEncrypted | e2e Encrypted Chat API
*ChatApi* | [**editChatPut**](docs/ChatApi.md#editchatput) | **PUT** {version}/tenants/{tenantId}/{eRTCUserId}/chat/ | Edit Chat API
*ChatApi* | [**getReplyThreads**](docs/ChatApi.md#getreplythreads) | **GET** {version}/tenants/{tenantId}/{eRTCUserId}/chat/replyThread/history | Load chat history
*ChatReportApi* | [**createChatReportPost**](docs/ChatReportApi.md#createchatreportpost) | **POST** {version}/tenants/{tenantId}/{eRTCUserId}/chatReports | Create Chat Report
*ChatReportApi* | [**deleteChatReportDelete**](docs/ChatReportApi.md#deletechatreportdelete) | **DELETE** {version}/tenants/{tenantId}/{eRTCUserId}/chatReports/{chatReportId} | Delete Chat Report
*ChatReportApi* | [**getChatReportGet**](docs/ChatReportApi.md#getchatreportget) | **GET** {version}/tenants/{tenantId}/{eRTCUserId}/chatReports/{chatReportId} | Get Chat Report Details
*ChatReportApi* | [**getChatReportList**](docs/ChatReportApi.md#getchatreportlist) | **GET** {version}/tenants/{tenantId}/{eRTCUserId}/chatReports | Get Chat Report List
*ChatReportApi* | [**updateChatReportActionPut**](docs/ChatReportApi.md#updatechatreportactionput) | **PUT** {version}/tenants/{tenantId}/{eRTCUserId}/chatReports/{chatReportId}/allowIgnore/{action} | Update Chat Report Action
*ChatReportApi* | [**updateChatReportPut**](docs/ChatReportApi.md#updatechatreportput) | **PUT** {version}/tenants/{tenantId}/{eRTCUserId}/chatReports/{chatReportId} | Update Chat Report
*ChatSettingApi* | [**getChatSettings**](docs/ChatSettingApi.md#getchatsettings) | **GET** {version}/tenants/{tenantId}/{eRTCUserId}/chatSettings | Get chat settings that contains profanity and domain filters
*DraftApi* | [**draftUpdate**](docs/DraftApi.md#draftupdate) | **POST** {version}/tenants/{tenantId}/{eRTCUserId}/draft/ | Draft API
*DraftApi* | [**getDrafts**](docs/DraftApi.md#getdrafts) | **GET** {version}/tenants/{tenantId}/{eRTCUserId}/draft/ | Draft API
*ERTCUserApi* | [**blockUnblockUserPost**](docs/ERTCUserApi.md#blockunblockuserpost) | **POST** {version}/tenants/{tenantId}/user/{eRTCUserId}/blockUnblock/{action} | Update user by eRTC userId
*ERTCUserApi* | [**blockedUsersGet**](docs/ERTCUserApi.md#blockedusersget) | **GET** {version}/tenants/{tenantId}/user/{eRTCUserId}/blockedUsers | Get blocked users
*ERTCUserApi* | [**getChatUserDetailsPost**](docs/ERTCUserApi.md#getchatuserdetailspost) | **POST** {version}/tenants/{tenantId}/user/{eRTCUserId}/chatUserDetails | Get specific details of other chatUsers
*ERTCUserApi* | [**getOrUpdateUserByAppId**](docs/ERTCUserApi.md#getorupdateuserbyappid) | **POST** {version}/tenants/{tenantId}/user/ | Get or Update user by appUserId
*ERTCUserApi* | [**logoutOtherDevices**](docs/ERTCUserApi.md#logoutotherdevices) | **POST** {version}/tenants/{tenantId}/user/{eRTCUserId}/logoutOtherDevices | Logout
*ERTCUserApi* | [**logoutUser**](docs/ERTCUserApi.md#logoutuser) | **POST** {version}/tenants/{tenantId}/user/{eRTCUserId}/logout | Logout
*ERTCUserApi* | [**pendingEventsGet**](docs/ERTCUserApi.md#pendingeventsget) | **GET** {version}/tenants/{tenantId}/user/{eRTCUserId}/pendingEvents | Get pending events for particular device
*ERTCUserApi* | [**refreshAuthToken**](docs/ERTCUserApi.md#refreshauthtoken) | **GET** {version}/tenants/{tenantId}/user/{eRTCUserId}/refreshToken | Refresh auth token
*ERTCUserApi* | [**resetBadgeCount**](docs/ERTCUserApi.md#resetbadgecount) | **GET** {version}/tenants/{tenantId}/user/{eRTCUserId}/resetBadgeCount | reset notification badge count
*ERTCUserApi* | [**updateUserByeRTCUserId**](docs/ERTCUserApi.md#updateuserbyertcuserid) | **POST** {version}/tenants/{tenantId}/user/{eRTCUserId} | Update user by eRTC userId
*FCMApi* | [**fCMValidationPost**](docs/FCMApi.md#fcmvalidationpost) | **POST** {version}/tenants/{tenantId}/fcmValidation | FCM Validation
*G2Api* | [**nFTLoginPOST**](docs/G2Api.md#nftloginpost) | **POST** {version}/tenants/{tenantId}/nft-login | Posion POG NFT based Login
*GroupApi* | [**addParticipantsPost**](docs/GroupApi.md#addparticipantspost) | **POST** {version}/tenants}/{tenantId}/{eRTCUserId}/group/{groupId}/addParticipants | Add participants to group
*GroupApi* | [**createOrUpdateGroupPost**](docs/GroupApi.md#createorupdategrouppost) | **POST** {version}/tenants/{tenantId}/{eRTCUserId}/group | Create or Update group
*GroupApi* | [**deleteGroupProfilePic**](docs/GroupApi.md#deletegroupprofilepic) | **DELETE** {version}/tenants/{tenantId}/{eRTCUserId}/group/{groupId}/removeProfilePic | Remove group profile pic
*GroupApi* | [**getGroupByGroupIdGet**](docs/GroupApi.md#getgroupbygroupidget) | **GET** {version}/tenants/{tenantId}/{eRTCUserId}/group/{groupId} | Get group by groupId
*GroupApi* | [**getGroupByThreadIdGet**](docs/GroupApi.md#getgroupbythreadidget) | **GET** {version}/tenants/{tenantId}/{eRTCUserId}/group/{threadId}/groupByThreadId | Get group by threadId
*GroupApi* | [**makeDismissAdminPost**](docs/GroupApi.md#makedismissadminpost) | **POST** {version}/tenants/{tenantId}/{eRTCUserId}/group/{groupId}/makeDismissAdmin/{action} | Make or Dismiss a group user as admin
*GroupApi* | [**removeParticipantsPost**](docs/GroupApi.md#removeparticipantspost) | **POST** {version}/tenants/{tenantId}/{eRTCUserId}/group/{groupId}/removeParticipants | Delete participants from group
*GroupApi* | [**restrictParticipants**](docs/GroupApi.md#restrictparticipants) | **POST** {version}/tenants}/{tenantId}/{eRTCUserId}/group/{groupId}/restrictParticipants | Ban or mute users
*GroupApi* | [**unrestrictParticipants**](docs/GroupApi.md#unrestrictparticipants) | **POST** {version}/tenants}/{tenantId}/{eRTCUserId}/group/{groupId}/unrestrictParticipants | UnBan or unmute users
*GroupApi* | [**userGroupsFilter**](docs/GroupApi.md#usergroupsfilter) | **GET** {version}/tenants/{tenantId}/{eRTCUserId}/group | Get user groups
*GroupApi* | [**userGroupsGet**](docs/GroupApi.md#usergroupsget) | **GET** {version}/tenants/{tenantId}/{eRTCUserId}/group/userGroups | Get user groups
*GroupInvteApi* | [**versionTenantsTenantIdERTCUserIdGroupGroupIdInvitePost**](docs/GroupInvteApi.md#versiontenantstenantidertcuseridgroupgroupidinvitepost) | **POST** {version}/tenants/{tenantId}/{eRTCUserId}/group/{groupId}/invite | create group invitation
*GroupInvteApi* | [**versionTenantsTenantIdERTCUserIdGroupGroupIdInvitesAcceptPost**](docs/GroupInvteApi.md#versiontenantstenantidertcuseridgroupgroupidinvitesacceptpost) | **POST** {version}/tenants/{tenantId}/{eRTCUserId}/group/{groupId}/invites/accept | accept group invitation
*GroupInvteApi* | [**versionTenantsTenantIdERTCUserIdGroupGroupIdInvitesDismissPost**](docs/GroupInvteApi.md#versiontenantstenantidertcuseridgroupgroupidinvitesdismisspost) | **POST** {version}/tenants/{tenantId}/{eRTCUserId}/group/{groupId}/invites/dismiss | dismiss group invitation
*GroupInvteApi* | [**versionTenantsTenantIdERTCUserIdGroupInvitesGet**](docs/GroupInvteApi.md#versiontenantstenantidertcuseridgroupinvitesget) | **GET** {version}/tenants/{tenantId}/{eRTCUserId}/group/invites | get group invitation
*SearchApi* | [**unifiedSearch**](docs/SearchApi.md#unifiedsearch) | **POST** {version}/tenants/{tenantId}/{eRTCUserId}/search | Unified search API
*ThreadApi* | [**thread**](docs/ThreadApi.md#thread) | **POST** {version}/tenants/{tenantId}/{eRTCUserId}/thread/ | Thread Creation API
*ThreadApi* | [**threadGet**](docs/ThreadApi.md#threadget) | **GET** {version}/tenants/{tenantId}/{eRTCUserId}/thread/{threadId} | Thread Get API
*ThreadApi* | [**threadHistoryGet**](docs/ThreadApi.md#threadhistoryget) | **GET** {version}/tenants/{tenantId}/{eRTCUserId}/thread/history | Load thread history
*ThreadApi* | [**threadHistoryGetV2**](docs/ThreadApi.md#threadhistorygetv2) | **GET** V2/tenants/{tenantId}/{eRTCUserId}/thread/history | Load thread history
*ThreadApi* | [**threadUpdatePost**](docs/ThreadApi.md#threadupdatepost) | **POST** {version}/tenants/{tenantId}/{eRTCUserId}/thread/{threadId} | Thread Update API


<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.inappchat.sdk.models.AddRemoveParticipantsRequest](docs/AddRemoveParticipantsRequest.md)
 - [io.inappchat.sdk.models.AutoDeleteSetting](docs/AutoDeleteSetting.md)
 - [io.inappchat.sdk.models.AvailabilityStatusSubscribe](docs/AvailabilityStatusSubscribe.md)
 - [io.inappchat.sdk.models.BaseChatReplyThreadDataSchema](docs/BaseChatReplyThreadDataSchema.md)
 - [io.inappchat.sdk.models.BaseMsgInReplyThreadData](docs/BaseMsgInReplyThreadData.md)
 - [io.inappchat.sdk.models.BaseMsgResponderSchema](docs/BaseMsgResponderSchema.md)
 - [io.inappchat.sdk.models.BlockUnblockUserPost200Response](docs/BlockUnblockUserPost200Response.md)
 - [io.inappchat.sdk.models.BlockUnblockUserRequest](docs/BlockUnblockUserRequest.md)
 - [io.inappchat.sdk.models.BlockUnblockUserResponse](docs/BlockUnblockUserResponse.md)
 - [io.inappchat.sdk.models.BlockedUsersGet200Response](docs/BlockedUsersGet200Response.md)
 - [io.inappchat.sdk.models.ChannelQueryObj](docs/ChannelQueryObj.md)
 - [io.inappchat.sdk.models.Chat200Response](docs/Chat200Response.md)
 - [io.inappchat.sdk.models.ChatEventSubscribe](docs/ChatEventSubscribe.md)
 - [io.inappchat.sdk.models.ChatHistoryClearSchema](docs/ChatHistoryClearSchema.md)
 - [io.inappchat.sdk.models.ChatHistoryGet200Response](docs/ChatHistoryGet200Response.md)
 - [io.inappchat.sdk.models.ChatHistoryResponseSchema](docs/ChatHistoryResponseSchema.md)
 - [io.inappchat.sdk.models.ChatInHistorySchema](docs/ChatInHistorySchema.md)
 - [io.inappchat.sdk.models.ChatMultiplePost200Response](docs/ChatMultiplePost200Response.md)
 - [io.inappchat.sdk.models.ChatMultiplePost200ResponseResult](docs/ChatMultiplePost200ResponseResult.md)
 - [io.inappchat.sdk.models.ChatMultipleResponseObj](docs/ChatMultipleResponseObj.md)
 - [io.inappchat.sdk.models.ChatObjIndeleteChatRequest](docs/ChatObjIndeleteChatRequest.md)
 - [io.inappchat.sdk.models.ChatObjIndeleteChatResponse](docs/ChatObjIndeleteChatResponse.md)
 - [io.inappchat.sdk.models.ChatReactionObj](docs/ChatReactionObj.md)
 - [io.inappchat.sdk.models.ChatReactionPost200Response](docs/ChatReactionPost200Response.md)
 - [io.inappchat.sdk.models.ChatReactionRequest](docs/ChatReactionRequest.md)
 - [io.inappchat.sdk.models.ChatReportActionSchema](docs/ChatReportActionSchema.md)
 - [io.inappchat.sdk.models.ChatReportCreateRequest](docs/ChatReportCreateRequest.md)
 - [io.inappchat.sdk.models.ChatReportCreateSchema](docs/ChatReportCreateSchema.md)
 - [io.inappchat.sdk.models.ChatReportDeleteSchema](docs/ChatReportDeleteSchema.md)
 - [io.inappchat.sdk.models.ChatReportListSchema](docs/ChatReportListSchema.md)
 - [io.inappchat.sdk.models.ChatReportSchema](docs/ChatReportSchema.md)
 - [io.inappchat.sdk.models.ChatReportSchemaChannelAdminStatus](docs/ChatReportSchemaChannelAdminStatus.md)
 - [io.inappchat.sdk.models.ChatReportSchemaReporterERTCUser](docs/ChatReportSchemaReporterERTCUser.md)
 - [io.inappchat.sdk.models.ChatReportSchemaTenantAdminStatus](docs/ChatReportSchemaTenantAdminStatus.md)
 - [io.inappchat.sdk.models.ChatReportUpdateRequest](docs/ChatReportUpdateRequest.md)
 - [io.inappchat.sdk.models.ChatReportUpdated](docs/ChatReportUpdated.md)
 - [io.inappchat.sdk.models.ChatReportUpdatedEvent](docs/ChatReportUpdatedEvent.md)
 - [io.inappchat.sdk.models.ChatReportUpdatedEventEventData](docs/ChatReportUpdatedEventEventData.md)
 - [io.inappchat.sdk.models.ChatReportUpdatedEventEventDataChatReport](docs/ChatReportUpdatedEventEventDataChatReport.md)
 - [io.inappchat.sdk.models.ChatReportUpdatedEventEventDataChatReportChannelAdminStatus](docs/ChatReportUpdatedEventEventDataChatReportChannelAdminStatus.md)
 - [io.inappchat.sdk.models.ChatReportUpdatedEventEventDataChatReportChat](docs/ChatReportUpdatedEventEventDataChatReportChat.md)
 - [io.inappchat.sdk.models.ChatReportUpdatedEventEventDataChatReportReporterERTCUser](docs/ChatReportUpdatedEventEventDataChatReportReporterERTCUser.md)
 - [io.inappchat.sdk.models.ChatReportUpdatedEventEventDataChatReportTenantAdminStatus](docs/ChatReportUpdatedEventEventDataChatReportTenantAdminStatus.md)
 - [io.inappchat.sdk.models.ChatRequestObj](docs/ChatRequestObj.md)
 - [io.inappchat.sdk.models.ChatResponse](docs/ChatResponse.md)
 - [io.inappchat.sdk.models.ChatSearchPost200Response](docs/ChatSearchPost200Response.md)
 - [io.inappchat.sdk.models.ChatSearchQueryObj](docs/ChatSearchQueryObj.md)
 - [io.inappchat.sdk.models.ChatSearchRequest](docs/ChatSearchRequest.md)
 - [io.inappchat.sdk.models.ChatSearchResponse](docs/ChatSearchResponse.md)
 - [io.inappchat.sdk.models.ChatSearchResultCategoryObj](docs/ChatSearchResultCategoryObj.md)
 - [io.inappchat.sdk.models.ChatSettingsSchema](docs/ChatSettingsSchema.md)
 - [io.inappchat.sdk.models.ChatSettingsSchemaDomainFilterInner](docs/ChatSettingsSchemaDomainFilterInner.md)
 - [io.inappchat.sdk.models.ChatSettingsSchemaProfanityFilterInner](docs/ChatSettingsSchemaProfanityFilterInner.md)
 - [io.inappchat.sdk.models.ChatStatusSchema](docs/ChatStatusSchema.md)
 - [io.inappchat.sdk.models.ChatUserDetailsRequest](docs/ChatUserDetailsRequest.md)
 - [io.inappchat.sdk.models.ChatUserDetailsResponse](docs/ChatUserDetailsResponse.md)
 - [io.inappchat.sdk.models.ChatUserDetailsSchema](docs/ChatUserDetailsSchema.md)
 - [io.inappchat.sdk.models.ChatUserDetailsSchemaStatusDetails](docs/ChatUserDetailsSchemaStatusDetails.md)
 - [io.inappchat.sdk.models.ClearChatHistory200Response](docs/ClearChatHistory200Response.md)
 - [io.inappchat.sdk.models.ContactSchema](docs/ContactSchema.md)
 - [io.inappchat.sdk.models.CreateChatReportPost200Response](docs/CreateChatReportPost200Response.md)
 - [io.inappchat.sdk.models.CreateOrUpdateGroupPost200Response](docs/CreateOrUpdateGroupPost200Response.md)
 - [io.inappchat.sdk.models.DeleteChat200Response](docs/DeleteChat200Response.md)
 - [io.inappchat.sdk.models.DeleteChatReportDelete200Response](docs/DeleteChatReportDelete200Response.md)
 - [io.inappchat.sdk.models.DeleteChatRequestObj](docs/DeleteChatRequestObj.md)
 - [io.inappchat.sdk.models.DeleteChatResponse](docs/DeleteChatResponse.md)
 - [io.inappchat.sdk.models.DeleteGroupProfilePic200Response](docs/DeleteGroupProfilePic200Response.md)
 - [io.inappchat.sdk.models.DraftResponse](docs/DraftResponse.md)
 - [io.inappchat.sdk.models.E2eEncryptedChatRequestObj](docs/E2eEncryptedChatRequestObj.md)
 - [io.inappchat.sdk.models.E2eEncryptedChatRequestObjSenderKeyDetails](docs/E2eEncryptedChatRequestObjSenderKeyDetails.md)
 - [io.inappchat.sdk.models.E2eKeyObj](docs/E2eKeyObj.md)
 - [io.inappchat.sdk.models.E2eKeyObjWithReturnCodee](docs/E2eKeyObjWithReturnCodee.md)
 - [io.inappchat.sdk.models.EditChatPut200Response](docs/EditChatPut200Response.md)
 - [io.inappchat.sdk.models.EditChatRequestObj](docs/EditChatRequestObj.md)
 - [io.inappchat.sdk.models.EditChatResponse](docs/EditChatResponse.md)
 - [io.inappchat.sdk.models.EditChatResponseChat](docs/EditChatResponseChat.md)
 - [io.inappchat.sdk.models.EmailContactSchema](docs/EmailContactSchema.md)
 - [io.inappchat.sdk.models.EncryptedChatObj](docs/EncryptedChatObj.md)
 - [io.inappchat.sdk.models.FcmMqttChatReaction](docs/FcmMqttChatReaction.md)
 - [io.inappchat.sdk.models.FcmMqttChatUpdate](docs/FcmMqttChatUpdate.md)
 - [io.inappchat.sdk.models.FcmMqttgroupUpdated](docs/FcmMqttgroupUpdated.md)
 - [io.inappchat.sdk.models.FcmMqttuserSelfUpdate](docs/FcmMqttuserSelfUpdate.md)
 - [io.inappchat.sdk.models.FcmValidationRequest](docs/FcmValidationRequest.md)
 - [io.inappchat.sdk.models.FollowChatRequest](docs/FollowChatRequest.md)
 - [io.inappchat.sdk.models.ForwardChatSchemaChatReceive](docs/ForwardChatSchemaChatReceive.md)
 - [io.inappchat.sdk.models.ForwardChatSchemaChatRequest](docs/ForwardChatSchemaChatRequest.md)
 - [io.inappchat.sdk.models.FreezeUnfreezeEvent](docs/FreezeUnfreezeEvent.md)
 - [io.inappchat.sdk.models.FreezeUnfreezeEventEventListInner](docs/FreezeUnfreezeEventEventListInner.md)
 - [io.inappchat.sdk.models.GetBlockedUsersResponse](docs/GetBlockedUsersResponse.md)
 - [io.inappchat.sdk.models.GetBlockedUsersResponseBlockedUsersInner](docs/GetBlockedUsersResponseBlockedUsersInner.md)
 - [io.inappchat.sdk.models.GetChatReportGet200Response](docs/GetChatReportGet200Response.md)
 - [io.inappchat.sdk.models.GetChatReportList200Response](docs/GetChatReportList200Response.md)
 - [io.inappchat.sdk.models.GetChatSettings200Response](docs/GetChatSettings200Response.md)
 - [io.inappchat.sdk.models.GetChatUserDetailsPost200Response](docs/GetChatUserDetailsPost200Response.md)
 - [io.inappchat.sdk.models.GetDraftSchema](docs/GetDraftSchema.md)
 - [io.inappchat.sdk.models.GetDrafts200Response](docs/GetDrafts200Response.md)
 - [io.inappchat.sdk.models.GetGroupInvitesByUserResponse](docs/GetGroupInvitesByUserResponse.md)
 - [io.inappchat.sdk.models.GetOrUpdateUserByAppId200Response](docs/GetOrUpdateUserByAppId200Response.md)
 - [io.inappchat.sdk.models.GetOrUpdateUserRequest](docs/GetOrUpdateUserRequest.md)
 - [io.inappchat.sdk.models.GetPendingEventsResponse](docs/GetPendingEventsResponse.md)
 - [io.inappchat.sdk.models.GetPendingEventsResponsePendingEventsInner](docs/GetPendingEventsResponsePendingEventsInner.md)
 - [io.inappchat.sdk.models.GetPendingEventsResponsePendingEventsInnerData](docs/GetPendingEventsResponsePendingEventsInnerData.md)
 - [io.inappchat.sdk.models.GetReplyThreads200Response](docs/GetReplyThreads200Response.md)
 - [io.inappchat.sdk.models.GroupHighLevelDetails](docs/GroupHighLevelDetails.md)
 - [io.inappchat.sdk.models.GroupHighLevelDetailsFreeze](docs/GroupHighLevelDetailsFreeze.md)
 - [io.inappchat.sdk.models.GroupParticipantSchema](docs/GroupParticipantSchema.md)
 - [io.inappchat.sdk.models.GroupRequest](docs/GroupRequest.md)
 - [io.inappchat.sdk.models.GroupSchema](docs/GroupSchema.md)
 - [io.inappchat.sdk.models.GroupUpdateEventChangeData](docs/GroupUpdateEventChangeData.md)
 - [io.inappchat.sdk.models.GroupUpdateEventChangeDataName](docs/GroupUpdateEventChangeDataName.md)
 - [io.inappchat.sdk.models.GroupUpdateEventData](docs/GroupUpdateEventData.md)
 - [io.inappchat.sdk.models.GroupUpdateEventUserDetails](docs/GroupUpdateEventUserDetails.md)
 - [io.inappchat.sdk.models.GroupUpdatedEventItem](docs/GroupUpdatedEventItem.md)
 - [io.inappchat.sdk.models.LastMessageSchema](docs/LastMessageSchema.md)
 - [io.inappchat.sdk.models.LocationSchema](docs/LocationSchema.md)
 - [io.inappchat.sdk.models.LogoutOtherDevices200Response](docs/LogoutOtherDevices200Response.md)
 - [io.inappchat.sdk.models.LogoutOtherDevices200ResponseResult](docs/LogoutOtherDevices200ResponseResult.md)
 - [io.inappchat.sdk.models.LogoutUser200Response](docs/LogoutUser200Response.md)
 - [io.inappchat.sdk.models.LogoutUser200ResponseResult](docs/LogoutUser200ResponseResult.md)
 - [io.inappchat.sdk.models.LogoutUserRequest](docs/LogoutUserRequest.md)
 - [io.inappchat.sdk.models.MakeDismissAdminPostRequest](docs/MakeDismissAdminPostRequest.md)
 - [io.inappchat.sdk.models.MediaSchema](docs/MediaSchema.md)
 - [io.inappchat.sdk.models.MentionSchema](docs/MentionSchema.md)
 - [io.inappchat.sdk.models.MsgReadStatusEventPublish](docs/MsgReadStatusEventPublish.md)
 - [io.inappchat.sdk.models.MsgReadStatusEventSubscribe](docs/MsgReadStatusEventSubscribe.md)
 - [io.inappchat.sdk.models.NFTLoginPOST200Response](docs/NFTLoginPOST200Response.md)
 - [io.inappchat.sdk.models.NFTLoginResponseSchema](docs/NFTLoginResponseSchema.md)
 - [io.inappchat.sdk.models.NotificationSettings](docs/NotificationSettings.md)
 - [io.inappchat.sdk.models.NumberContactSchema](docs/NumberContactSchema.md)
 - [io.inappchat.sdk.models.PendingEventsGet200Response](docs/PendingEventsGet200Response.md)
 - [io.inappchat.sdk.models.ReactionInChatHistorySchema](docs/ReactionInChatHistorySchema.md)
 - [io.inappchat.sdk.models.RefreshAuthToken200Response](docs/RefreshAuthToken200Response.md)
 - [io.inappchat.sdk.models.ReplyThreadHistoryResponseSchema](docs/ReplyThreadHistoryResponseSchema.md)
 - [io.inappchat.sdk.models.ReplyThreadResultSchema](docs/ReplyThreadResultSchema.md)
 - [io.inappchat.sdk.models.ReplyThreadResultSchemaAllOf](docs/ReplyThreadResultSchemaAllOf.md)
 - [io.inappchat.sdk.models.ReplyThreadSchemaChatReceive](docs/ReplyThreadSchemaChatReceive.md)
 - [io.inappchat.sdk.models.ReplyThreadSchemaChatRequest](docs/ReplyThreadSchemaChatRequest.md)
 - [io.inappchat.sdk.models.ReplyThreadSchemaChatResponse](docs/ReplyThreadSchemaChatResponse.md)
 - [io.inappchat.sdk.models.ResetBadgeCount200Response](docs/ResetBadgeCount200Response.md)
 - [io.inappchat.sdk.models.ResetBadgeCount200ResponseResult](docs/ResetBadgeCount200ResponseResult.md)
 - [io.inappchat.sdk.models.RestrictParticipantsRequest](docs/RestrictParticipantsRequest.md)
 - [io.inappchat.sdk.models.SenderInChatEventSubscribe](docs/SenderInChatEventSubscribe.md)
 - [io.inappchat.sdk.models.Thread200Response](docs/Thread200Response.md)
 - [io.inappchat.sdk.models.ThreadHistoryGet200Response](docs/ThreadHistoryGet200Response.md)
 - [io.inappchat.sdk.models.ThreadHistoryGetV2200Response](docs/ThreadHistoryGetV2200Response.md)
 - [io.inappchat.sdk.models.ThreadHistoryResponseSchema](docs/ThreadHistoryResponseSchema.md)
 - [io.inappchat.sdk.models.ThreadHistoryV2ResponseSchema](docs/ThreadHistoryV2ResponseSchema.md)
 - [io.inappchat.sdk.models.ThreadInHistorySchema](docs/ThreadInHistorySchema.md)
 - [io.inappchat.sdk.models.ThreadInHistoryV2Schema](docs/ThreadInHistoryV2Schema.md)
 - [io.inappchat.sdk.models.ThreadMemberInHistorySchema](docs/ThreadMemberInHistorySchema.md)
 - [io.inappchat.sdk.models.ThreadMemberSchema](docs/ThreadMemberSchema.md)
 - [io.inappchat.sdk.models.ThreadObj](docs/ThreadObj.md)
 - [io.inappchat.sdk.models.ThreadObject](docs/ThreadObject.md)
 - [io.inappchat.sdk.models.ThreadObject1](docs/ThreadObject1.md)
 - [io.inappchat.sdk.models.ThreadReplyReplies](docs/ThreadReplyReplies.md)
 - [io.inappchat.sdk.models.ThreadRequest](docs/ThreadRequest.md)
 - [io.inappchat.sdk.models.ThreadResponse](docs/ThreadResponse.md)
 - [io.inappchat.sdk.models.ThreadUpdateRequest](docs/ThreadUpdateRequest.md)
 - [io.inappchat.sdk.models.TokenSchema](docs/TokenSchema.md)
 - [io.inappchat.sdk.models.TypingStatusEventPublish](docs/TypingStatusEventPublish.md)
 - [io.inappchat.sdk.models.TypingStatusEventSubscribe](docs/TypingStatusEventSubscribe.md)
 - [io.inappchat.sdk.models.UnifiedSearch200Response](docs/UnifiedSearch200Response.md)
 - [io.inappchat.sdk.models.UnifiedSearchRequest](docs/UnifiedSearchRequest.md)
 - [io.inappchat.sdk.models.UnifiedSearchResponse](docs/UnifiedSearchResponse.md)
 - [io.inappchat.sdk.models.UnifiedSearchSearchQuery](docs/UnifiedSearchSearchQuery.md)
 - [io.inappchat.sdk.models.UnrestrictParticipantsRequest](docs/UnrestrictParticipantsRequest.md)
 - [io.inappchat.sdk.models.UpdateChatReportActionPut200Response](docs/UpdateChatReportActionPut200Response.md)
 - [io.inappchat.sdk.models.UpdateDraftSchema](docs/UpdateDraftSchema.md)
 - [io.inappchat.sdk.models.UpdateUserRequest](docs/UpdateUserRequest.md)
 - [io.inappchat.sdk.models.UserAuthPayload](docs/UserAuthPayload.md)
 - [io.inappchat.sdk.models.UserAuthPayloadDataVersion2N](docs/UserAuthPayloadDataVersion2N.md)
 - [io.inappchat.sdk.models.UserGroupsFilter200Response](docs/UserGroupsFilter200Response.md)
 - [io.inappchat.sdk.models.UserGroupsResponse](docs/UserGroupsResponse.md)
 - [io.inappchat.sdk.models.UserInThreadHistorySchema](docs/UserInThreadHistorySchema.md)
 - [io.inappchat.sdk.models.UserResponse](docs/UserResponse.md)
 - [io.inappchat.sdk.models.UserSelfUpdateEventData](docs/UserSelfUpdateEventData.md)
 - [io.inappchat.sdk.models.UserSelfUpdateEventItem](docs/UserSelfUpdateEventItem.md)
 - [io.inappchat.sdk.models.VersionTenantsTenantIdERTCUserIdGroupInvitesGet200Response](docs/VersionTenantsTenantIdERTCUserIdGroupInvitesGet200Response.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="sdk_key"></a>
### sdk_key

- **Type**: API key
- **API key parameter name**: sdkkey
- **Location**: HTTP header
