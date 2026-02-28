package com.mcp.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * MCP Server Application - 支持 STDIO、SSE、Streamable-HTTP、Stateless 四种协议
 *
 * @author 10699
 * @since 2026-02-27
 * @version 1.0
 */
@SpringBootApplication
public class McpServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(McpServerApplication.class, args);
        System.out.println("========================================");
        System.out.println("MCP 服务器已启动！");
        System.out.println("========================================");
    }
}
