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

import io.inappchat.sdk.models.BaseChatReplyThreadDataSchema

import com.squareup.moshi.Json

/**
 * 
 *
 * @param msgUniqueId msgUniqueId of base chat
 * @param replyThreadData 
 */


data class BaseMsgInReplyThreadData (

    /* msgUniqueId of base chat */
    @Json(name = "msgUniqueId")
    val msgUniqueId: kotlin.String? = null,

    @Json(name = "replyThreadData")
    val replyThreadData: BaseChatReplyThreadDataSchema? = null

)
