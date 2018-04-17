// 메서드 : Call by value, Call by reference
package step06_Method;


public class Exam03_1 {

    static void swap(int a, int b){
        
        System.out.printf("swap(): a = %d, b = %d\n", a,b);
        int temp = a;
        a = b;
        b = temp;
        System.out.printf("swap(): a = %d, b = %d\n", a,b);
    }
    
    // swap() 호출할 때, a변수의 값과 b변수의 값을 넘긴다.
    // -> 그래서 'call by value'라 부른다.
    // -> 비록 swap()에서 a와 b라는 이름의 변수가 있지만 이 변수는 main()에 있는 변수와 다른 변수이다.
    public static void main(String[] args) {
        int a = 100, b = 200;
        swap(a,b);
        System.out.printf("main(): a = %d, b = %d\n", a,b);

    }
}
// call by value
//  => 자바에서는 primitive data type인 경우 메서드를 호출할 때 값을 넘긴다.
//  => 자바에서는 primitive data type에 대해서 메모리 주소를 넘기는 방법이 없다.
