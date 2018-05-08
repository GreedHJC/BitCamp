package bitcamp.java106.step11;

import org.springframework.stereotype.Component;

//@Component
//=> 스프링 IoC 컨테이너는 이 애노테이션이 붙은 클래스에 대해 객체를 자동 생성한다.
//문법:
//  @Component(value="객체이름")
//  @Component("객체이름")
//만약 다음과 같이 객체 이름을 생략하면 클래스 이름을 객체 이름으로 사용한다.
//  예) bitcamp.java106.step09.Engine => "engine"
@Component()
public class Engine {
    String maker;
    int valve;
    int cylinder;
    
    public Engine() {
        System.out.println("Engine()");
    }
    
    @Override
    public String toString() {
        return "Engine [maker=" + maker + ", valve=" + valve + ", cylinder=" + cylinder + "]";
    }
    public String getMaker() {
        return maker;
    }
    public void setMaker(String maker) {
        this.maker = maker;
    }
    public int getValve() {
        return valve;
    }
    public void setValve(int valve) {
        this.valve = valve;
    }
    public int getCylinder() {
        return cylinder;
    }
    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }
    
    
}
