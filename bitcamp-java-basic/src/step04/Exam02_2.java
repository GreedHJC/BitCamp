// 관계 연산자 : 부동 소수점 비교
package step04;


public class Exam02_2 {
    public static void main(String[] args) {
        
        double d1 = 987.6_543;
        double d2 = 1.111_111;
        System.out.println((f1+f2) == 988.7654111 );
        // 결과는 false이다.
        // 이유?
        // - 부동 소수점 값을 연산할 때 IEEE754 명세에 따라 작업을 수행한다. 그 과정에서 값의 왜곡이 발생할 수 있다.
        System.out.println(d1+d2);

        double x = 234.765411;
        double y = 754.0;
        System.out.println(x + y);


        double EPSILON = 0.00001;
        System.out.println(Math.abs((d1 + d2)-(x + y)) < EPSILON );
    }
}