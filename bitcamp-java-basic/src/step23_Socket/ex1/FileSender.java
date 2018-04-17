package step23_Socket.ex1;

import java.io.DataInputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;


public class FileSender {
    public static void main(String[] args) throws Exception {
        System.out.println("서버 실행");
        
        ServerSocket serverSocker = new ServerSocket(8888);
        Socket socket = serverSocker.accept();
        System.out.println("클라이언트 연결됨.");
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        DataInputStream in = new DataInputStream(socket.getInputStream());
        
        System.out.println("데이터 수신중....");
        
        long filesize = in.readLong();
        String filename = in.readUTF();
        
        in.close();
        out.close();
        socket.close();
        serverSocker.close();
    }
}

