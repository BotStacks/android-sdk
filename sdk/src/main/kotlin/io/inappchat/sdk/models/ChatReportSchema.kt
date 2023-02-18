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

import io.inappchat.sdk.models.ChatReportSchemaChannelAdminStatus
import io.inappchat.sdk.models.ChatReportSchemaReporterERTCUser
import io.inappchat.sdk.models.ChatReportSchemaTenantAdminStatus
import io.inappchat.sdk.models.ChatResponse

import com.squareup.moshi.Json

/**
 * 
 *
 * @param chatReportId Chat Report ID
 * @param tenantId Tenant Id
 * @param category Category of chat Report
 * @param reason detailed reason for raising chat report
 * @param channelAdminStatus 
 * @param tenantAdminStatus 
 * @param reporterERTCUser 
 * @param chat 
 */


data class ChatReportSchema (

    /* Chat Report ID */
    @Json(name = "chatReportId")
    val chatReportId: kotlin.String? = null,

    /* Tenant Id */
    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    /* Category of chat Report */
    @Json(name = "category")
    val category: kotlin.String? = null,

    /* detailed reason for raising chat report */
    @Json(name = "reason")
    val reason: kotlin.String? = null,

    @Json(name = "channelAdminStatus")
    val channelAdminStatus: ChatReportSchemaChannelAdminStatus? = null,

    @Json(name = "tenantAdminStatus")
    val tenantAdminStatus: ChatReportSchemaTenantAdminStatus? = null,

    @Json(name = "reporterERTCUser")
    val reporterERTCUser: ChatReportSchemaReporterERTCUser? = null,

    @Json(name = "chat")
    val chat: ChatResponse? = null

)
