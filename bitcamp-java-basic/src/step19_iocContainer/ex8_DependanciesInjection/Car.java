package step19_iocContainer.ex8_DependanciesInjection;

public class Car {
    Engine engine;
    
    public Car() {
        System.out.println("===> Car()");
        this.engine = new Engine();
    }
    
    public void move() {
        this.engine.run();
    }
}
