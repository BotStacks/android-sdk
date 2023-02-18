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
 * user object
 *
 * @param appUserId appUserId of user
 * @param eRTCUserId eRTC user ID of user
 * @param tenantId Project tenant ID
 */


data class GetBlockedUsersResponseBlockedUsersInner (

    /* appUserId of user */
    @Json(name = "appUserId")
    val appUserId: kotlin.String? = null,

    /* eRTC user ID of user */
    @Json(name = "eRTCUserId")
    val eRTCUserId: kotlin.String? = null,

    /* Project tenant ID */
    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null

)
