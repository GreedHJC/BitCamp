// 관계 연산자 : < , <=, >, >=, ==, !=
package step04_Operators;

public class Exam02_1 {
    public static void main(String[] args) {
        //비교 연산결과는 true 또는 false이다.
        // 즉 boolean 값이다.
        int a = 10;
        int b = 20;
        boolean r1 = a < b; // true
        // int r2 = a < b; //컴파일 오류

        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a == b);
        System.out.println(a != b);

        double f1 = 987.6_543;
        double f2 = 1.111_111;
        System.out.println((f1+f2) == 988.7654111 );
    }
}