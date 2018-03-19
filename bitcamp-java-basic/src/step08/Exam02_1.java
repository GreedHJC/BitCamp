//클래스 변수와 인스턴스 변수 응용
package step08;

public class Exam02_1 {
    static class A{
        // 1) 클래스 메서드
        // => static 붙은 메서드이다.
        // => 클래스 이름으로 호출할 수 있다.
        // => "스태틱 메서드" 라고도 부른다.
        static void m1() {
            System.out.println("A.m1()");
        }
        
        // 2) 인스턴스 메서드
        //  => static이 붙지않은 메서드이다.
        //  => 인스턴스 주소가 있어야만 호출할 수 있다.
        //  =>
        void m2() {
            System.out.println("A.m2()");
        }
    }
    
    public static void main(String[] args) {
        // 클래스 메서드 호출
        // 문법) 클래스명.메서드명();
        A.m1();
        
        // => 인스턴스 메서드는 클래스 이름으로 호출할 수 없다.
//        A.m2();     // 컴파일 오류!
        
        A obj1 = new A();
//        obj1.m1();  // OK! 그런데 이렇게 하지말라! 물론 "클래스 메서드"를 인스턴스 주소를 사용하여 호출 가능하지만,
//                      다른 개발자가 그냥 "인스턴스 메서드"인 줄 착각 할 수 있기 때문에 이렇게 호출하지 말기를 권고한다.
        obj1.m2();  // OK! 인스턴스 메서드를 반드시 인스턴스 주소를 사용하여 호출해야 한다
        
//        A obj2 = null;
//        obj2.m2();  // 컴파일은 OK 그러나 실행은 오류 !!! 왜??? obj2 변수에 들어있는 주소가 무효하기 때문이다.
    }
}