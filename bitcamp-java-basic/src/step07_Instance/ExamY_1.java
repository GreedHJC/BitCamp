// 클래스 용도  - 관리 소스코드를 관리하기 쉽게 관련된 기능을 묶을 때 사용
package step07_Instance;

// 사용자 정의 데이터 타입
// => 학생 데이터를 담을 새로운 구조의 메모리를 설계한다.
class Student {
    String name;
    int age;
    String email;
    float weight;
    float height;
    String tel;
}

public class ExamY_1 {
    public static void main(String[] args) {
        int result = 0;


        // 2 + 3 - 1 * 7 /3 = ?
        // => 연산자 우선 순위를 고려하지 않고 순서대로 계산하라.
        result = Calculator.plus(2, 3);
        System.out.println();
        result = Calculator.minus(result, 1);
        result = Calculator.multiple(result, 7);
        result = Calculator.divide(result, 3);

        System.out.printf("result = %d \n", result);
    }
}

// 클래스 문법의 용도?
// 1) 사용자 정의 데이터 타입 만들 때
//    - 즉 새로운 구조의 메모리를 설계할 때 사용한다.
// 2) 메서드를 묶을 때
//    - 서로 관련된 기능을 관리하기 쉽게 묶고 싶을 때 사용한다.