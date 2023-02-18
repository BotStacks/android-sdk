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

import io.inappchat.sdk.models.ReplyThreadSchemaChatRequest

import com.squareup.moshi.Json

/**
 * 
 *
 * @param tenantId Unique identified tenant
 * @param msgUniqueId Unique identified of chat object generated by server
 * @param sendereRTCUserId Sender eRTCUserId of message
 * @param deviceId Device Id
 * @param threadId Unique identified Thread
 * @param eRTCUserId User's eRTCUserId who pubblished this topic
 * @param msgStatusEvent Message status event type : delivered/seen
 * @param timeStamp Message status event time stamp
 * @param replyThreadFeatureData 
 * @param msgCorrelationId Client generated unique identifier used to trace message delivery till receiver.
 */


data class MsgReadStatusEventPublish (

    /* Unique identified tenant */
    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    /* Unique identified of chat object generated by server */
    @Json(name = "msgUniqueId")
    val msgUniqueId: kotlin.String? = null,

    /* Sender eRTCUserId of message */
    @Json(name = "sendereRTCUserId")
    val sendereRTCUserId: kotlin.String? = null,

    /* Device Id */
    @Json(name = "deviceId")
    val deviceId: kotlin.String? = null,

    /* Unique identified Thread */
    @Json(name = "threadId")
    val threadId: kotlin.String? = null,

    /* User's eRTCUserId who pubblished this topic */
    @Json(name = "eRTCUserId")
    val eRTCUserId: kotlin.String? = null,

    /* Message status event type : delivered/seen */
    @Json(name = "msgStatusEvent")
    val msgStatusEvent: kotlin.String? = null,

    /* Message status event time stamp */
    @Json(name = "timeStamp")
    val timeStamp: java.math.BigDecimal? = null,

    @Json(name = "replyThreadFeatureData")
    val replyThreadFeatureData: ReplyThreadSchemaChatRequest? = null,

    /* Client generated unique identifier used to trace message delivery till receiver. */
    @Json(name = "msgCorrelationId")
    val msgCorrelationId: kotlin.String? = null

)
