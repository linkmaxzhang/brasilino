package com.max.client.raspberry.utils;

import java.net.InetAddress;
import java.util.Properties;

public class SysInfo {

    public static String getSysInfo() {
        try {
            InetAddress addr = InetAddress.getLocalHost();
            String ip = addr.getHostAddress().toString();
            String hostName = addr.getHostName().toString();
            Properties props = System.getProperties();
            return "本机IP:" + ip
                    + "\n"
                    + "主机名:"
                    + hostName
                    + "\n"
                    + "操作系统:"
                    + props.getProperty("os.name")
                    + "\n"
                    + "系统版本:"
                    + props.getProperty("os.version")
                    + "\n"
                    + "用户名:"
                    + props.getProperty("user.name")
                    + "\n"
                    + "用户主目录:"
                    + props.getProperty("user.home");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }


}
