package step03.assignment;

import java.io.InputStream;
import java.util.Scanner;

public class Test01_1{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Score 메모리(인스턴스)의 주소를 저장할 변수 : 레퍼런스 준비
        step03.Score s1;
        // 입력 값을 저장할 Score 메모리를 준비한다.
        s1 = new step03.Score();



        System.out.println("입력 : ");
        s1.name = sc.next();

            
    }
}
