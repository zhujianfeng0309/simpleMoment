package com.webpackge.common.util;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

/**
 * Created by Administrator on 2019/7/11.
 */
public class InetAddressUtil {

    public static InetAddress getLocalInetAddress()  {
        InetAddress inetAddress= null;
        try {
            Enumeration<?> networkInterfaces = (Enumeration<?>)NetworkInterface.getNetworkInterfaces();
            while(networkInterfaces.hasMoreElements()){
                NetworkInterface ni = (NetworkInterface)networkInterfaces.nextElement();
                if(!ni.getName().equals("ech0")){
                    continue;
                }
                Enumeration<?> e2 = ni.getInetAddresses();
                while(e2.hasMoreElements()){
                    InetAddress ia = (InetAddress)e2.nextElement();
                    if(ia instanceof Inet6Address){
                        continue;
                    }
                    inetAddress = ia;
                }
                break;
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
        return inetAddress;

    }

    public static String getLocalIP(){
        String ip = "";
        InetAddress localInetAddress = getLocalInetAddress();
        if(null != localInetAddress){
            ip = localInetAddress.getHostAddress();

        }
        return ip;
    }

}
