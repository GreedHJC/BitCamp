// 변수의 범위 - 종류
package step02_Scanner;

public class Exam11_1 {
    int a ; //인스턴스 변수
    static int b;   //클래스 변수

    public static void main(String[] args) {
    
        int c; //로컬 변수
    }
}
// 인스턴스 변수(instance variable)
// - new 명령을 사용하여 인스턴스를 준비할때 생성되는 변수

// 클래스 변수 (class variable = static variable)
// - 클래스가 로딩할 때 생성되는 변수

// 로컬 변수 (local variable)
// - 블록을 실행할때 생성되는 변수
// - 로컬 변수 중에서 메서드의 아규먼트를 받는 변수를 '파라미터(parameter)'라 부른다.
// 예 ) 위의 코드에서 main()의 args 변수가 파라미터이다