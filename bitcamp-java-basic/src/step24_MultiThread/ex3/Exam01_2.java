// Thread를 상속 받기 - 익명 클래스로 구현하기
package step24_MultiThread.ex3;

public class Exam01_2 {

    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                // 별도로 분리해서 병행으로 실행할 코드를 두는 곳!
                for (int i = 0; i < 1000; i++) {
                    System.out.println("===> " + i);
                }
            }
        }.start();              // 생성자와 객체 생성
        
        // "main" 스레드는 MyThread와 상관없이 병행하여 실행한다.
        for (int i = 0; i < 1000; i++) {
            System.out.println(">>>> " + i);
        }

    }

}
