// Connection-Oriented 서버 -연결 후 데이터 송수신
package step23_Socket.ex6;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

// 연결지향(Connection Oriented)
//  => 연결 후 데이터를 송수신 하기 때문에 데이터 송수신에 대한 신뢰를 보장한다.
//  => TCP 통신 방법이 전형적인 예이다.
//      예) FTP, Telnet, STMP, POP3, HTTP
//      
public class ConnectionOrientedServer {
    public static void main(String[] args) throws Exception {
        System.out.println("서버 실행 중...");
        
        ServerSocket ss = new ServerSocket(8888);
        
        Socket socket = ss.accept();
        System.out.println("클라이언트가 연결되었음!");
        
        Scanner in = new Scanner(socket.getInputStream());
        PrintStream out = new PrintStream(socket.getOutputStream());

        
        String str = in.nextLine(); // 데이터 수신
        System.out.println("데이터 수신 완료!");
        
        out.println(str);           // 데이터 송신
        System.out.println("데이터 송신 완료!");

        in.close();
        out.close();
        socket.close();
        System.out.println("클라이언트 연결 끊기!");
        ss.close();
    }
} 





