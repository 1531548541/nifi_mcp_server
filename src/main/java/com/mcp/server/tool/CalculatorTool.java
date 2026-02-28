package com.mcp.server.tool;

import org.springaicommunity.mcp.annotation.McpTool;
import org.springaicommunity.mcp.annotation.McpToolParam;
import org.springframework.stereotype.Component;

/**
 * 计算器工具 - 提供基本数学运算功能
 *
 * @author 10699
 * @since 2026-02-27
 * @version 1.0
 */
@Component
public class CalculatorTool {

    @McpTool(name = "add", description = "Add two numbers together")
    public double add(
            @McpToolParam(description = "First number", required = true) double a,
            @McpToolParam(description = "Second number", required = true) double b) {
        return a + b;
    }

    @McpTool(name = "subtract", description = "Subtract the second number from the first")
    public double subtract(
            @McpToolParam(description = "First number", required = true) double a,
            @McpToolParam(description = "Second number to subtract", required = true) double b) {
        return a - b;
    }

    @McpTool(name = "multiply", description = "Multiply two numbers")
    public double multiply(
            @McpToolParam(description = "First number", required = true) double a,
            @McpToolParam(description = "Second number", required = true) double b) {
        return a * b;
    }

    @McpTool(name = "divide", description = "Divide the first number by the second")
    public double divide(
            @McpToolParam(description = "Dividend", required = true) double a,
            @McpToolParam(description = "Divisor", required = true) double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    @McpTool(name = "power", description = "Calculate the power of a number")
    public double power(
            @McpToolParam(description = "Base number", required = true) double base,
            @McpToolParam(description = "Exponent", required = true) double exponent) {
        return Math.pow(base, exponent);
    }

    @McpTool(name = "sqrt", description = "Calculate the square root of a number")
    public double sqrt(
            @McpToolParam(description = "Number to calculate square root", required = true) double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number");
        }
        return Math.sqrt(number);
    }
}
