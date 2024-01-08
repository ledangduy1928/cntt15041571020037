//Họ và tên: Lê Đăng Duy
//MSV: 1571020037
//Lớp:CNTT15-04
package com.mycompany.mavenproject1;
import java.net.InetAddress;

public class GetIP {
    public static void main (String[] arg){
        try{
            // lấy địa chỉ của trang web
            InetAddress inet = InetAddress.getByName("www.facebook.com");
            //in ra địa chỉ IP
            System.out.println("Dia chi IP cua trang web youtube.com : " + inet.getHostAddress());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
