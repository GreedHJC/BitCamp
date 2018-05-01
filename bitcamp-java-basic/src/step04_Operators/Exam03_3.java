// 논리 연산자 : && vs &
package step04_Operators;

public class Exam03_3{
    public static void main(String[] args) {
        boolean a = false;
        boolean b = false;
        boolean r = a && (b = true);
        System.out.println(r);
        System.out.printf("a= %b, b=%b, r=%b\n",a,b,r);

        a = false;
        b = false;
        r = a & (b = true);
        System.out.println(r);    
        System.out.printf("a= %b, b=%b, r=%b\n",a,b,r);
        
    }
}
// &&, ||
// - 앞의 피연산자의 값으로 결과를 알 수 있다면 뒤의 명령은 실행하지 않는다.

// &, |
// - 앞의 피연산자의 값으로 결과를 알 수 있을지라도, 뒤에 놓인 명령까지 모두 실행한다.