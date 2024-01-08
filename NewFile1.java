//Họ và tên: Lê Đăng Duy
//MSV: 1571020037
//Lớp:CNTT15-04
package com.mycompany.mavenproject1;
import java.net.InetAddress;

public class NewFile1 {
    public static void main(String[] arg){
        try{
            // lấy 1 trang web bất kì kiểm tra kết nối Internet
            InetAddress inet = InetAddress.getByName("www.facebook.com");
            //thử kết nối
            boolean isKN = inet.isReachable(5000);
            if (isKN){
                System.out.println("Ket noi internet");
            }
            else{
                System.out.println("khong the ket noi internet");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
