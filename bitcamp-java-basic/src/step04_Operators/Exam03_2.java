// 논리 연산자 : &, |
package step04_Operators;

public class Exam03_2{
    public static void main(String[] args) {
        //AND 연산자
        // - 두개의 논리 값이 모두 true일때 결과 값이 true가 된다.
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);

        System.out.println("-----------------------------");
        // OR 연산자
        // - 두개의 논리 값중 하나 라도 true일때 결과 값이 true가 된다.
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false | false);

     
        
    }
}