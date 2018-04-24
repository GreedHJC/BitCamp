// Runnable 인터페이스 구현 + Thread - 익명 클래스로 구현하기
package step24_MultiThread.ex3;

public class Exam02_2 {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                // 별도로 분리해서 병행으로 실행할 코드를 두는 곳!
                for (int i = 0; i < 1000; i++) {
                    System.out.println("===> " + i);
                }
            }
        }).start();
        
        // "main" 스레드는 MyThread와 상관없이 병행하여 실행한다.
        for (int i = 0; i < 1000; i++) {
            System.out.println(">>>> " + i);
        }

    }

}
