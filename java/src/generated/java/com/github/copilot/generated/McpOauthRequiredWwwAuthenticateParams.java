/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: session-events.schema.json

package com.github.copilot.generated;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.processing.Generated;

/**
 * Parsed parameters from the WWW-Authenticate header that the SDK host uses for RFC 9728 protected-resource metadata discovery.
 *
 * @since 1.0.0
 */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public record McpOauthRequiredWwwAuthenticateParams(
    /** Parsed resource_metadata URL from the WWW-Authenticate header */
    @JsonProperty("resourceMetadataUrl") String resourceMetadataUrl,
    /** Parsed OAuth scope from the WWW-Authenticate header, if present */
    @JsonProperty("scope") String scope,
    /** Parsed OAuth error from the WWW-Authenticate header, if present */
    @JsonProperty("error") String error
) {
}
