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
 * @param enabled Enabled or not
 * @param deleteAfterMiliSeconds SHould be deleted after this many miliseconds
 */


data class AutoDeleteSettings (

    /* Enabled or not */
    @Json(name = "enabled")
    val enabled: kotlin.Boolean? = null,

    /* SHould be deleted after this many miliseconds */
    @Json(name = "deleteAfterMiliSeconds")
    val deleteAfterMiliSeconds: java.math.BigDecimal? = null

)
