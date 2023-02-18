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

import io.inappchat.sdk.models.GroupSchema

import com.squareup.moshi.Json

/**
 * 
 *
 * @param success Success/failure
 * @param msg Message string
 * @param result 
 * @param errorCode Error code. E00000 is success case
 */


data class DeleteGroupProfilePic200Response (

    /* Success/failure */
    @Json(name = "success")
    val success: kotlin.Boolean? = null,

    /* Message string */
    @Json(name = "msg")
    val msg: kotlin.String? = null,

    @Json(name = "result")
    val result: GroupSchema? = null,

    /* Error code. E00000 is success case */
    @Json(name = "errorCode")
    val errorCode: kotlin.String? = null

)

