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
 * Status values
 *
 * @param availabilityStatus Availability status i.e. online/away/invisible/dnd
 * @param blockedStatus blocked status i.e. blocked. if this field does not, means unblocked
 */


data class ChatUserDetailsSchemaStatusDetails (

    /* Availability status i.e. online/away/invisible/dnd */
    @Json(name = "availabilityStatus")
    val availabilityStatus: kotlin.String? = null,

    /* blocked status i.e. blocked. if this field does not, means unblocked */
    @Json(name = "blockedStatus")
    val blockedStatus: kotlin.String? = null

)
