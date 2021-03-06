// 상속 - 추상 메서드
package step11_Inheritance.ex18_AbstractMathod;

// Car 클래스의 start()와 shutdown()은 서브 클래스에서 그대로 받아 사용해도 된다.
// 그러나 run() 메서드는 서브 클래스마다 자신의 특징에 맞줘 재정의해야 한다.
// 그렇다면 굳이 수퍼클래스에서 run()메서드를 구현할 필요가  없지 않는가??
// run 처럼 서브 클래스에서 무조건 재정의
public class Exam01 {

    public static void main(String[] args) {
        // => 그럼에도 다음과 같이 Car 클래스를 사용하는 것을 막을 수 없다.
        // => 이런 경우를 방지하기 위해 
        //    즉 Car 클래스의 경우처럼 서브클래스에 공통 기능을 상속해주는 용도로 만든 클래스를
        //    직접 사용하지 못하도록 막기위해 만든 문법이 
        //    "추상클래스(abstract)"이다.
        // => 그런데 추상 클래스로 선언하는 순간 다음 코드는 컴파일 오류가 발생한다.
        
//        Car c = new Car(); // 컴파일 오류!
        
        // generalization 과정에서 정의한 수퍼 클래스에 대해 
        // 직접 사용하지 못하도록 보통 추상클래스로 선언한다.
    }

}





