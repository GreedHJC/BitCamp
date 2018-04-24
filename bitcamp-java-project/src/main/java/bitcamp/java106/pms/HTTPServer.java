// HTTP 프로토콜에 따라 요청을 처리할 서버
package bitcamp.java106.pms;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class HTTPServer {
    int port;
    ApplicationContainer applicationContainer;

    public HTTPServer(int port, ApplicationContainer applicationContainer) {
        this.port = port;
        this.applicationContainer = applicationContainer;
    }

    public void execute() throws Exception {
        // 서버 소켓 준비
        ServerSocket serverSocket = new ServerSocket(this.port);
        System.out.println("서버 실행 했음!");

        while (true) {
            Socket socket = serverSocket.accept();

            // 클라이언트 요청을 처리할 코드를 기존의 실행흐름에서 분리하여 생성후 실행을 시작한다.
            System.out.println("클라이언트 요청 처리중...");
            new RequestProcessorThread(socket).start();
        }
    }

    class RequestProcessorThread extends Thread { 
        Socket socket;

        public RequestProcessorThread(Socket socket) {
            this.socket = socket;
        }

        // 기본의 실행 흐름에서 분기되어 독립적으로 실행할 코드를 이 메서드에 두어라!
        @Override
        public void run() {
            PrintWriter out = null;
            Scanner in = null;

            try {
                out = new PrintWriter(socket.getOutputStream());
                in = new Scanner(socket.getInputStream());

                // HTTP 프로토콜에서 요청 정보를 읽는다. 
                boolean firstLine = true;
                String requestURI = null;

                while (true) {
                    String line = in.nextLine();
                    if (line.equals(""))
                        break;

                    if (!firstLine) 
                        continue;

                    // HTTP 요청 프로토콜에서 첫 번째 줄에 있는 요청 URI 정보를 추출한다.
                    requestURI = line.split(" ")[1];
                    firstLine = false;
                }

                // ApplicationContainer에게 실행을 위임한다.
                String result = applicationContainer.execute(requestURI);

                // HTTP 프로토톨에 따라 응답한다.
                out.println("HTTP/1.1 200 OK");
                out.println("Content-Type: text/plain;charset=UTF-8");
                out.println();
                out.println(result);

            } catch (Exception e) {
                out.println("서버 오류!");
                e.printStackTrace(out);
                out.println();
            } finally {
                out.close();
                in.close();
                try {socket.close();} catch (Exception e) {}
            }
        }
    }

}
