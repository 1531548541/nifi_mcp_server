package com.mcp.server.tool;

import org.springaicommunity.mcp.annotation.McpTool;
import org.springaicommunity.mcp.annotation.McpToolParam;
import org.springframework.stereotype.Component;

/**
 * 回显工具 - 将输入消息原样返回
 *
 * @author 10699
 * @since 2026-02-27
 * @version 1.0
 */
@Component
public class EchoTool {

    @McpTool(name = "echo", description = "Echo the input message back to the caller")
    public String echo(
            @McpToolParam(description = "The message to echo back", required = true) String message) {
        return message;
    }

    @McpTool(name = "echoWithPrefix", description = "Echo the input message with a prefix")
    public String echoWithPrefix(
            @McpToolParam(description = "The message to echo", required = true) String message,
            @McpToolParam(description = "The prefix to add", required = true) String prefix) {
        return prefix + ": " + message;
    }
}
