package com.mcp.server.tool;

import org.springaicommunity.mcp.annotation.McpTool;
import org.springaicommunity.mcp.annotation.McpToolParam;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 日期时间工具 - 提供日期时间相关功能
 *
 * @author 10699
 * @since 2026-02-27
 * @version 1.0
 */
@Component
public class DateTimeTool {

    @McpTool(name = "getCurrentDateTime", description = "Get the current date and time")
    public String getCurrentDateTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }

    @McpTool(name = "getCurrentDate", description = "Get the current date")
    public String getCurrentDate() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }

    @McpTool(name = "getCurrentTime", description = "Get the current time")
    public String getCurrentTime() {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    @McpTool(name = "formatDate", description = "Format a date string to a specific format")
    public String formatDate(
            @McpToolParam(description = "Date string in yyyy-MM-dd format", required = true) String dateStr,
            @McpToolParam(description = "Target format pattern (e.g., dd/MM/yyyy)", required = true) String pattern) {
        try {
            LocalDateTime dateTime = LocalDateTime.parse(dateStr + " 00:00:00", 
                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return dateTime.format(DateTimeFormatter.ofPattern(pattern));
        } catch (Exception e) {
            return "Error: Invalid date format. Please use yyyy-MM-dd format.";
        }
    }

    @McpTool(name = "getDayOfWeek", description = "Get the day of week for a given date")
    public String getDayOfWeek(
            @McpToolParam(description = "Date string in yyyy-MM-dd format", required = true) String dateStr) {
        try {
            LocalDateTime dateTime = LocalDateTime.parse(dateStr + " 00:00:00", 
                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            return dateTime.getDayOfWeek().toString();
        } catch (Exception e) {
            return "Error: Invalid date format. Please use yyyy-MM-dd format.";
        }
    }
}
