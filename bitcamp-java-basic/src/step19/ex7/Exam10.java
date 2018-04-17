// IoC 컨테이너 만들기 - 객체를 저장할 때 클래스 이름으로 저장하기, 클래스이름으로 객체 꺼내기.
package step19.ex7;

// => 인스턴스 생성 확인!
public class Exam10 {
    int value;
    
    public Exam10() {
        this.value = 200;
    }

    public void print() {
        System.out.printf("vlaue = %d \n", this.value);
    }
    public static void main(String[] args) throws Exception {
        ApplicationContext8 appContext = new ApplicationContext8("step19.ex7");
        Exam10 obj = (Exam10) appContext.getBean("step19.ex7.Exam10");
        obj.print();
        
    }
}

// 빈(bean)?
//  => 인스턴스(instance), 객체(object)와 같은 의미로 사용한다.
//  => 다만 자바 문법에서 정한 나름의 규칙에 따라 만든 클래스의 인스턴스를 얘기한다.
//  => 그러나 현업에서는 인스턴스 또는 객체와 같은 의미로 사용한다.
//  => bean = instance = object 

// 빈 컨테이너 (Bean container)?
//  => 위의 ApplicationContext8과 같이 인스턴스를 생성하고 보관하고 필요할 때 리턴해주는 그런 역할을 하는 객체를 말한다.
//  => 컨테이너라는 단어에는 '생성-실행-소멸' 즉 생명주기(lifecycle)를 관리하는 것을 말한다.
//  => 대표적인 라이브러리가 "스프링 IoC 컨테이너" 이다.

// IoC 컨테이너(Inversion of Control 컨테이너)??
//  => IoC 컨테이너 = 빈 컨테이너 + 의존 객체 자동 주입(Dependancy Injection)




