package com.connect.client;

import py4j.GatewayServer;

public class Client {
    public static void main(String[] args) {
        GatewayServer gatewayServer = new GatewayServer(new Client());
        gatewayServer.start();
        System.out.println("Java Gateway Server Started");
    }

}