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

import io.inappchat.sdk.models.NotificationSettings

import com.squareup.moshi.Json

/**
 * 
 *
 * @param eRTCUserId eRTC user Id of member
 * @param appUserId appUserId of member
 * @param notificationSettings 
 */


data class ThreadMemberInHistorySchema (

    /* eRTC user Id of member */
    @Json(name = "eRTCUserId")
    val eRTCUserId: kotlin.String? = null,

    /* appUserId of member */
    @Json(name = "appUserId")
    val appUserId: kotlin.String? = null,

    @Json(name = "notificationSettings")
    val notificationSettings: NotificationSettings? = null

)

