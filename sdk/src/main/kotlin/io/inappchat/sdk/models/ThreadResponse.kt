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

import io.inappchat.sdk.models.E2eKeyObj
import io.inappchat.sdk.models.ThreadMemberSchema

import com.squareup.moshi.Json

/**
 * 
 *
 * @param recipientAppUserId App user Id of receiver
 * @param threadId Thread ID
 * @param threadType Type of thread - single/group
 * @param tenantId Tenant ID
 * @param createdAt Therad object creation time
 * @param participants array of read timestamps
 * @param e2eEncryptionKeys List of e2e public keys of user on different devices. ONLY APPLICABLE IF E2E EENCRYPTION IS ENABLED FOR TENANT
 */


data class ThreadResponse (

    /* App user Id of receiver */
    @Json(name = "recipientAppUserId")
    val recipientAppUserId: kotlin.String? = null,

    /* Thread ID */
    @Json(name = "threadId")
    val threadId: kotlin.String? = null,

    /* Type of thread - single/group */
    @Json(name = "threadType")
    val threadType: kotlin.String? = null,

    /* Tenant ID */
    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    /* Therad object creation time */
    @Json(name = "createdAt")
    val createdAt: java.math.BigDecimal? = null,

    /* array of read timestamps */
    @Json(name = "participants")
    val participants: kotlin.collections.List<ThreadMemberSchema>? = null,

    /* List of e2e public keys of user on different devices. ONLY APPLICABLE IF E2E EENCRYPTION IS ENABLED FOR TENANT */
    @Json(name = "e2eEncryptionKeys")
    val e2eEncryptionKeys: kotlin.collections.List<E2eKeyObj>? = null

)
