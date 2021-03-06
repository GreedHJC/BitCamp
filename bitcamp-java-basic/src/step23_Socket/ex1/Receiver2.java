// 서버 + 키보드 입력 결합
package step23_Socket.ex1;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.server.ServerCloneException;
import java.util.Scanner;

public class Receiver2 {
    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);

        ServerSocket serverSocker = new ServerSocket(8888);
        Socket socket = serverSocker.accept();
        
        PrintStream out = new PrintStream(socket.getOutputStream());
        Scanner in = new Scanner(socket.getInputStream());
        
        // 클라이언트가 보낸 문자열을 수신한다.
        String str = in.nextLine();
        System.out.println(str);
        
        // 키보드 입력을 받아서 클라이언트로 송신한다.
        System.out.print("입력> ");
        str = keyScan.nextLine();
        out.println(str);
        
        
        in.close();
        out.close();
        socket.close();
        serverSocker.close();
        keyScan.close();
    }
}
