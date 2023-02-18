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
 * @param chats List of deleted chats
 */


data class DeleteChatResponse (

    /* List of deleted chats */
    @Json(name = "chats")
    val chats: kotlin.collections.List<ChatObjIndeleteChatResponse>? = null

)

