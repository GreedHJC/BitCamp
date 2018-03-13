// 논리 연산자 : &&, ||, !(not), ^(XOR)
package step04;

public class Exam03_1 {
    public static void main(String[] args) {
        //AND 연산자
        // - 두개의 논리 값이 모두 true일때 결과 값이 true가 된다.
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("-----------------------------");
        // OR 연산자
        // - 두개의 논리 값중 하나 라도 true일때 결과 값이 true가 된다.
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("-----------------------------");
        // NOT 연산자
        // - true는 false, false 는 true로 바꾼다.
        System.out.println(!true);
        System.out.println(!false);
        
        System.out.println("-----------------------------");
        // exclusive-OR 연산자
        // - 배타적 비교 연산자라 부르며 두개의 값이 다를때 true이다.
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

    }
}