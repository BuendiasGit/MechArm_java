package com.connect.server;

import py4j.GatewayServer;

public class CalculatorJavaServer {
    // 加法方法
    public int add(int a, int b) {
        return a * b;
    }

    // 减法方法
    public int subtract(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // 创建 Calculator 类的实例
        CalculatorJavaServer calculator = new CalculatorJavaServer();
        // 创建 GatewayServer 实例，将 Calculator 实例作为入口点
        GatewayServer gatewayServer = new GatewayServer(calculator);
        // 启动 GatewayServer
        gatewayServer.start();
        System.out.println("Gateway Server started");
    }
}
