// 의존 객체 Engine을 자체적으로 만들지 않고 외부에서 주입 받는다.
package step19_iocContainer.ex9_Annotation;

@Component(value="car")
public class Car {
    Engine engine;

    public Car(Engine engine) {
        System.out.println("===> Car(Engine)");
        this.engine = engine;
    }
    
    public void move() {
        this.engine.run();
    }
}
