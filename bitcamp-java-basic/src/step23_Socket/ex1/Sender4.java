// 파일 보내기
package step23_Socket.ex1;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.Socket;
import java.util.Scanner;

public class Sender4 {

    public static void main(String[] args) throws Exception {
        File file = new File("temp/test.png");
        
        FileInputStream fileIn = new FileInputStream(file);
        
        System.out.println("서버에 연결 중...");
        Socket socket = new Socket("192.168.0.73", 8888);
        System.out.println("서버에 연결 완료!");
        
        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        System.out.println("서버에 데이터 송신 중...");
        //1) 파일 크기 보내기
        out.writeLong(file.length());
        
        //2) 파일 이름 보내기
        out.writeUTF(file.getName());
        
        //3) 파일 데이터 보내기
        int b;
        while ((b = fileIn.read()) != -1) {
            out.write(b);
        } 
        System.out.println("서버에 데이터 송신 완료!");
        
        //4) 서버의 응답받기
        String response = in.nextLine();
        System.out.println(response);

        in.close();
        out.close();
        socket.close();
        fileIn.close();
    }

}





