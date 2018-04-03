package cn.org.rapid_framework.generator;


import org.h2.tools.Server;

import java.sql.SQLException;

public class main {

    private static Server server;

    public static void start() {
        try {
            System.out.println("正在启动h2...");
            server = Server.createTcpServer(
                    new String[]{"-tcp", "-tcpAllowOthers", "-tcpPort",
                            "8043"}).start();
            System.out.println("启动成功：" + server.getStatus());
        } catch (SQLException e) {
            System.out.println("启动h2出错：" + e.toString());
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        start();
    }
}
