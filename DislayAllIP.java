//Họ và tên: Lê Đăng Duy
//MSV: 1571020037
//Lớp:CNTT15-04
package com.mycompany.mavenproject1;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;


public class DislayAllIP {
    public static void main (String[] arg){
        try{
            //lấy tất cả interface của máy
            Enumeration <NetworkInterface> netInterfaces = NetworkInterface.getNetworkInterfaces();
            while (netInterfaces.hasMoreElements()){
                NetworkInterface networkInterface = netInterfaces.nextElement();
                Enumeration<InetAddress> inetAddress= networkInterface.getInetAddresses();
                while (inetAddress.hasMoreElements()){
                    InetAddress address = inetAddress.nextElement();
                    System.out.println("Interface: " + networkInterface.getName() + "; dia chi ip: " + address.getHostAddress());
                }
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
