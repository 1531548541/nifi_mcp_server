package com.mcp.server.tool;

import org.springaicommunity.mcp.annotation.McpTool;
import org.springaicommunity.mcp.annotation.McpToolParam;
import org.springframework.stereotype.Component;

/**
 * 字符串处理工具 - 提供字符串操作功能
 *
 * @author 10699
 * @since 2026-02-27
 * @version 1.0
 */
@Component
public class StringTool {

    @McpTool(name = "toUpperCase", description = "Convert string to uppercase")
    public String toUpperCase(
            @McpToolParam(description = "Input string", required = true) String input) {
        return input.toUpperCase();
    }

    @McpTool(name = "toLowerCase", description = "Convert string to lowercase")
    public String toLowerCase(
            @McpToolParam(description = "Input string", required = true) String input) {
        return input.toLowerCase();
    }

    @McpTool(name = "length", description = "Get the length of a string")
    public int length(
            @McpToolParam(description = "Input string", required = true) String input) {
        return input.length();
    }

    @McpTool(name = "reverse", description = "Reverse a string")
    public String reverse(
            @McpToolParam(description = "Input string to reverse", required = true) String input) {
        return new StringBuilder(input).reverse().toString();
    }

    @McpTool(name = "contains", description = "Check if a string contains a substring")
    public boolean contains(
            @McpToolParam(description = "Input string", required = true) String input,
            @McpToolParam(description = "Substring to search for", required = true) String substring) {
        return input.contains(substring);
    }

    @McpTool(name = "replace", description = "Replace all occurrences of a substring")
    public String replace(
            @McpToolParam(description = "Input string", required = true) String input,
            @McpToolParam(description = "Substring to replace", required = true) String target,
            @McpToolParam(description = "Replacement string", required = true) String replacement) {
        return input.replace(target, replacement);
    }

    @McpTool(name = "trim", description = "Trim whitespace from both ends of a string")
    public String trim(
            @McpToolParam(description = "Input string", required = true) String input) {
        return input.trim();
    }

    @McpTool(name = "split", description = "Split a string by delimiter and return array")
    public String[] split(
            @McpToolParam(description = "Input string", required = true) String input,
            @McpToolParam(description = "Delimiter to split by", required = true) String delimiter) {
        return input.split(delimiter);
    }
}
