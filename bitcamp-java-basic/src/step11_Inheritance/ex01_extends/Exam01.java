// 상속 - 사용전

package step11_Inheritance.ex01_extends;

public class Exam01 {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.maker = "비트자동차";
        c1.model = "티코";
        c1.capacity = 5;
        
        Car c2 = new Car("비트자동차", "소나타", 5);
    }
}
