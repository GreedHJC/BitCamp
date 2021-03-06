// Connectionless 클라이언트 - 연결 없이 데이터 송신 
package step23_Socket.ex6;

import java.io.PrintStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ConnectionlessClient {
    public static void main(String[] args) throws Exception {
        // ㅇ ㅣ프로그램 실행 방법
        //  > java -cp bin step23.ex6.ConnectionlessClient [서버주소] [메시지]
        
        // Connectionless 방식을 통신을 수행할 소켓 생성
        DatagramSocket socket = new DatagramSocket();
        
        // 데이터 받을 상태편 주소
        String receiver = args[0];
        int port = 8888;
        
        // 보낼 데이터를 바이트 배열로 준비
        byte[] bytes = args[1].getBytes("UTF-8");
        
        // 보낼 데이터를 패킷에 담는다.
        //  => 패킷 = 데이터 + 받는이 주소 + 포트번호
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getByName(receiver),port);
                
        // 데이터 전송
        socket.send(packet);
        System.out.println("데이터 전송 완료!");
        
        // 자원해제
        socket.close();
        System.out.println("서버와 연결 끊음!");
        
        // 상대편이 네트웍에 연결되었는지 따지지 않고 무조건 데이터를 보낸다.
        // 만약 상대편이 연결되어 있지 않다면, 보낸 데이터는 그 쪽 네트워크에서 버려진다.
        //  => 데이터 송수신을 보장하지 않는다.
    }
}





