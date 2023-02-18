/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package io.inappchat.sdk.models

import io.inappchat.sdk.models.ChatObjIndeleteChatResponse

import com.squareup.moshi.Json

/**
 * 
 *
 * @param eRTCUserId User unique Identifier
 * @param chats List of deleted chats
 * @param msgUniqueId Chat unique Identifier
 * @param updateType Type of update. eg. delete/edit
 * @param threadId Thread unique identifier
 * @param tenantId Tenant unique identifier
 * @param msgCorrelationId Client generated unique identifier used to trace message delivery till receiver.
 * @param deleteType in case of delete updateType, it specifies sub-type of delete such as self/everyone
 */


data class FcmMqttChatUpdate (

    /* User unique Identifier */
    @Json(name = "eRTCUserId")
    val eRTCUserId: kotlin.String? = null,

    /* List of deleted chats */
    @Json(name = "chats")
    val chats: kotlin.collections.List<ChatObjIndeleteChatResponse>? = null,

    /* Chat unique Identifier */
    @Json(name = "msgUniqueId")
    val msgUniqueId: kotlin.String? = null,

    /* Type of update. eg. delete/edit */
    @Json(name = "updateType")
    val updateType: kotlin.String? = null,

    /* Thread unique identifier */
    @Json(name = "threadId")
    val threadId: kotlin.String? = null,

    /* Tenant unique identifier */
    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    /* Client generated unique identifier used to trace message delivery till receiver. */
    @Json(name = "msgCorrelationId")
    val msgCorrelationId: kotlin.String? = null,

    /* in case of delete updateType, it specifies sub-type of delete such as self/everyone */
    @Json(name = "deleteType")
    val deleteType: kotlin.String? = null

)

