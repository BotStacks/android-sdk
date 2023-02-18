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

import io.inappchat.sdk.models.UnifiedSearchResponse

import com.squareup.moshi.Json

/**
 * 
 *
 * @param success Success/failure
 * @param message Message string
 * @param result 
 * @param errorCode Error code. E00000 is success case
 */


data class UnifiedSearch200Response (

    /* Success/failure */
    @Json(name = "success")
    val success: kotlin.Boolean? = null,

    /* Message string */
    @Json(name = "message")
    val message: kotlin.String? = null,

    @Json(name = "result")
    val result: UnifiedSearchResponse? = null,

    /* Error code. E00000 is success case */
    @Json(name = "errorCode")
    val errorCode: kotlin.String? = null

)

