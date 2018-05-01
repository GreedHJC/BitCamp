// 추상 클래스 - 정의
package step15_Abstractmethod.ex1_AbstractClass;

// 클래스 앞에 abstract를 붙인다.
// 추상 클래스의 목적
//  => 서브 클래스의 
//  => 직접 사용하지 않는다.
public abstract class A2 {
    // 메서드 앞에 abstract를 붙인다.
    public abstract void m1();

    //  => 추상 메서드는 구현할 수 없다.
//    public abstract void m2() {}    // 컴파일 오류!!
}
