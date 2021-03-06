// 캡슐화(Encapsulation) - 필요한 이유
package step11_Inheritance.ex13_Encapsulation;

public class Exam01_1 {
    // 
    static class Coustomer{
        String name;
        int age;
        int weight;
        int height;        
    }
    
    public static void main(String[] args) {
        Coustomer c1 = new Coustomer();
        c1.name = "홍길동";
        c1.age = 300;
        c1.weight = 100;
        c1.height = -50;
        
        // 위의 코드의 문제점을 분석!
        //  => 각각의 값이 인스턴스 변수에 들어갈 수 있는 값이기 때문에 컴파일 오류는 발생하지 않는다.
        //  => 그러나 , "환자" 데이터로서 유효한 값은 아니다!
        //  => 위의 데이터는 거의 괴물 데이터라 볼 수 있다.
        //      즉, 환자를 추상화시킨 목적을 상실한 것이다.
        //      즉, 추상화가 무너진 것이다.
        //  => Customer는 환자 데이터를 다루기 위해서 만든 클래스이지, 괴물이나 비과학적 데이터를 다루기 위해서 만든 클래스가 아니다.
        //      즉 유효하지 않는 데이터를 넣게 되면 클래스에서 정의한 이유를 상실하게 된다.
        //  이를 방지하기 위해서 만든 문법이 "캡슐화(encapsulation)"이다.
        
        // 캡슐화?
        //  => 인스턴스 변수에 추상화 목적에 맞는 유효한 값만 넣을 수 있도록 외부 접근을 제한하는 문법이다.
        //  => 제한 범위
        //      Private     : 클래스 내부에서만 접근 가능
        //      (default)   : 클래스 내부 + 같은 패키지
        //      protected   : 클래스 내부 + 같은 패키지 + 자식 클래스
        //      public      : 모든 클래스
    }
}
