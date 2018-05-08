package bitcamp.java106.step10;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration      // AppConfig02 클래스가 스프링 설정 정보를 갖고 있는 클래스임을 선포한다.
                    // 그러면 AnnotationConfigApplicationContext에서 이 클래스를 찾아 적절한 작업을 수행할 것이다.
public class AppConfig02 {
    @Bean
    public Car getCar() {
        Car c = new Car(null);
        c.setMaker("비트자동차");
        c.setModel("티코");
        c.setCc(890);
        c.setAuto(true);
        return c;
    }
    @Bean("car")
    public Car getCar2() {
        Car c = new Car(null);
        c.setMaker("비트자동차");
        c.setModel("티코");
        c.setCc(890);
        c.setAuto(true);
        return c;
    }
    // 실무에서는 스프링 설정 용으로 사용하는 클래스에서 객체를 리턴하는 메서드의 이름을 객체 이름과 같게 짓는다.
    // => 어떤 값을 리턴할 때는 getXxx()라는 이름으로 메서드를 만드는데, 
    //    이처럼 객체이름으로 사용할 수 있도록 메서드를 만드는 경우도 있으니 당황하지 말라!
    @Bean
    public Car car2() {
        Car c = new Car(null);
        c.setMaker("비트자동차");
        c.setModel("티코");
        c.setCc(890);
        c.setAuto(true);
        return c;
    }
    
    public Car car3() {
        Car c = new Car(null);
        c.setMaker("비트자동차");
        c.setModel("티코");
        c.setCc(890);
        c.setAuto(true);
        return c;
    }
}
