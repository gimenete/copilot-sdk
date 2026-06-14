/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Microsoft Corporation. All rights reserved.
 *--------------------------------------------------------------------------------------------*/

package com.github.copilot.rpc;

import com.github.copilot.generated.McpOauthRequiredStaticClientConfig;
import com.github.copilot.generated.McpOauthRequiredWwwAuthenticateParams;

/**
 * MCP OAuth request that the SDK host can satisfy with a host-acquired token.
 *
 * @since 1.0.0
 */
public record McpAuthRequest(
        String sessionId,
        String requestId,
        String serverName,
        String serverUrl,
        McpOauthRequiredWwwAuthenticateParams wwwAuthenticateParams,
        McpOauthRequiredStaticClientConfig staticClientConfig) {
}
