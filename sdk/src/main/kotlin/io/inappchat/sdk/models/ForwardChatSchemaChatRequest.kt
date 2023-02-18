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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param originalMsgUniqueId msgUniqueId of original chat
 * @param isForwarded to indicate if message is forwarded one or not.
 */


data class ForwardChatSchemaChatRequest (

    /* msgUniqueId of original chat */
    @Json(name = "originalMsgUniqueId")
    val originalMsgUniqueId: kotlin.String? = null,

    /* to indicate if message is forwarded one or not. */
    @Json(name = "isForwarded")
    val isForwarded: kotlin.Boolean? = null

)

