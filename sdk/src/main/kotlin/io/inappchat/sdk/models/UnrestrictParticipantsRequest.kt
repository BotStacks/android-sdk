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
 * Unban or unmute participants
 *
 * @param participants 
 * @param type 
 */


data class UnrestrictParticipantsRequest (

    @Json(name = "participants")
    val participants: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "type")
    val type: UnrestrictParticipantsRequest.Type? = null

) {

    /**
     * 
     *
     * Values: ban,mute
     */
    enum class Type(val value: kotlin.String) {
        @Json(name = "ban") ban("ban"),
        @Json(name = "mute") mute("mute");
    }
}

