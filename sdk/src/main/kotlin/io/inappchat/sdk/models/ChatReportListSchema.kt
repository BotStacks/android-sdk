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

import io.inappchat.sdk.models.ChatReportSchema

import com.squareup.moshi.Json

/**
 * 
 *
 * @param total total count of chat reports
 * @param chatReports List of chat reports
 */


data class ChatReportListSchema (

    /* total count of chat reports */
    @Json(name = "total")
    val total: java.math.BigDecimal? = null,

    /* List of chat reports */
    @Json(name = "chatReports")
    val chatReports: kotlin.collections.List<ChatReportSchema>? = null

)

