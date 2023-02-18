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

import io.inappchat.sdk.models.ContactSchema
import io.inappchat.sdk.models.E2eEncryptedChatRequestObjSenderKeyDetails
import io.inappchat.sdk.models.EncryptedChatObj
import io.inappchat.sdk.models.ForwardChatSchemaChatReceive
import io.inappchat.sdk.models.LocationSchema
import io.inappchat.sdk.models.MediaSchema
import io.inappchat.sdk.models.ReplyThreadSchemaChatReceive
import io.inappchat.sdk.models.SenderInChatEventSubscribe
import io.inappchat.sdk.models.ThreadObj

import com.squareup.moshi.Json

/**
 * 
 *
 * @param msgUniqueId Unique identified of chat object generated by server
 * @param tenantId Tenant Id
 * @param message message text. it can be present for any msgType value
 * @param msgType message type. it can be text/image/audio/video/gif/file/contact/location
 * @param contact 
 * @param location 
 * @param media 
 * @param gify gify URL
 * @param sendereRTCUserId 
 * @param createdAt Chat object creation epoch time in miliseconds
 * @param thread 
 * @param senderKeyDetails 
 * @param encryptedChat 
 * @param replyThreadFeatureData 
 * @param forwardChatFeatureData 
 * @param isSilent If notification to be silent or not
 * @param msgCorrelationId Client generated unique identifier used to trace message delivery till receiver.
 * @param senderTimeStampMs epoch timestamp (in ms) of message creation generated on sender device
 * @param customData JSON object which can be used for customer specific data which is not supported in InAppChat chat model. eg. { \"abc\" : \"def\" }
 */


data class ChatEventSubscribe (

    /* Unique identified of chat object generated by server */
    @Json(name = "msgUniqueId")
    val msgUniqueId: kotlin.String? = null,

    /* Tenant Id */
    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    /* message text. it can be present for any msgType value */
    @Json(name = "message")
    val message: kotlin.String? = null,

    /* message type. it can be text/image/audio/video/gif/file/contact/location */
    @Json(name = "msgType")
    val msgType: kotlin.String? = null,

    @Json(name = "contact")
    val contact: ContactSchema? = null,

    @Json(name = "location")
    val location: LocationSchema? = null,

    @Json(name = "media")
    val media: MediaSchema? = null,

    /* gify URL */
    @Json(name = "gify")
    val gify: kotlin.String? = null,

    @Json(name = "sendereRTCUserId")
    val sendereRTCUserId: SenderInChatEventSubscribe? = null,

    /* Chat object creation epoch time in miliseconds */
    @Json(name = "createdAt")
    val createdAt: kotlin.String? = null,

    @Json(name = "thread")
    val thread: ThreadObj? = null,

    @Json(name = "senderKeyDetails")
    val senderKeyDetails: E2eEncryptedChatRequestObjSenderKeyDetails? = null,

    @Json(name = "encryptedChat")
    val encryptedChat: EncryptedChatObj? = null,

    @Json(name = "replyThreadFeatureData")
    val replyThreadFeatureData: ReplyThreadSchemaChatReceive? = null,

    @Json(name = "forwardChatFeatureData")
    val forwardChatFeatureData: ForwardChatSchemaChatReceive? = null,

    /* If notification to be silent or not */
    @Json(name = "isSilent")
    val isSilent: kotlin.Boolean? = null,

    /* Client generated unique identifier used to trace message delivery till receiver. */
    @Json(name = "msgCorrelationId")
    val msgCorrelationId: kotlin.String? = null,

    /* epoch timestamp (in ms) of message creation generated on sender device */
    @Json(name = "senderTimeStampMs")
    val senderTimeStampMs: java.math.BigDecimal? = null,

    /* JSON object which can be used for customer specific data which is not supported in InAppChat chat model. eg. { \"abc\" : \"def\" } */
    @Json(name = "customData")
    val customData: kotlin.Any? = null

)
