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
import io.inappchat.sdk.models.TokenSchema

import com.squareup.moshi.Json

/**
 * 
 *
 * @param eRTCUserId ERTCID of User
 * @param appUserId User ID i.e. abc@def.com
 * @param tenantId Tenant ID
 * @param name Name of user
 * @param e2eEncryptionKeys List of e2e public keys of user on different devices. ONLY APPLICABLE IF E2E EENCRYPTION IS ENABLED FOR TENANT
 * @param token 
 */


data class UserResponse (

    /* ERTCID of User */
    @Json(name = "eRTCUserId")
    val eRTCUserId: kotlin.String? = null,

    /* User ID i.e. abc@def.com */
    @Json(name = "appUserId")
    val appUserId: kotlin.String? = null,

    /* Tenant ID */
    @Json(name = "tenantId")
    val tenantId: kotlin.String? = null,

    /* Name of user */
    @Json(name = "name")
    val name: kotlin.String? = null,

    /* List of e2e public keys of user on different devices. ONLY APPLICABLE IF E2E EENCRYPTION IS ENABLED FOR TENANT */
    @Json(name = "e2eEncryptionKeys")
    val e2eEncryptionKeys: kotlin.collections.List<E2eKeyObj>? = null,

    @Json(name = "token")
    val token: TokenSchema? = null

)

