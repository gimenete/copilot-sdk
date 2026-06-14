/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

// AUTO-GENERATED FILE - DO NOT EDIT
// Generated from: session-events.schema.json

package com.github.copilot.generated;

import javax.annotation.processing.Generated;

/**
 * How the pending OAuth request was completed
 *
 * @since 1.0.0
 */
@javax.annotation.processing.Generated("copilot-sdk-codegen")
public enum McpOauthCompletedOutcome {
    /** The {@code token} variant. */
    TOKEN("token"),
    /** The {@code cancelled} variant. */
    CANCELLED("cancelled"),
    /** The {@code timeout} variant. */
    TIMEOUT("timeout");

    private final String value;
    McpOauthCompletedOutcome(String value) { this.value = value; }
    @com.fasterxml.jackson.annotation.JsonValue
    public String getValue() { return value; }
    @com.fasterxml.jackson.annotation.JsonCreator
    public static McpOauthCompletedOutcome fromValue(String value) {
        for (McpOauthCompletedOutcome v : values()) {
            if (v.value.equals(value)) return v;
        }
        throw new IllegalArgumentException("Unknown McpOauthCompletedOutcome value: " + value);
    }
}
