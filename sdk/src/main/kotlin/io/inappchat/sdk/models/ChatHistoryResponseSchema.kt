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

import io.inappchat.sdk.models.ChatInHistorySchema

import com.squareup.moshi.Json

/**
 * 
 *
 * @param total Total Chats in history under particular threadId.
 * @param baseMessage 
 * @param chats List of history conversations
 */


data class ChatHistoryResponseSchema (

    /* Total Chats in history under particular threadId. */
    @Json(name = "total")
    val total: java.math.BigDecimal? = null,

    @Json(name = "baseMessage")
    val baseMessage: ChatInHistorySchema? = null,

    /* List of history conversations */
    @Json(name = "chats")
    val chats: kotlin.collections.List<ChatInHistorySchema>? = null

)
