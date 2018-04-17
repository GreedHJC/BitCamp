// 다형성 - 다형적 변수의 형변환 활용
package step11.ex09_Polymorphism;

public class Exam04 {

    // Sedan과 Truck의 모델명과 cc를 출력하라!

    // 다형적 변수가 없다면?
    // Sedan의 모델명과 cc를 출력하는 메서드와 Truck의 모델명과 cc를 출력하는 메서드를 모두 만들어야 하는 번거러움이 있다.
    public static void printSedan(Sedan sedan) {
        System.out.printf("모델명: %s\n", sedan.model);
        System.out.printf("CC: %d\n", sedan.cc);
        System.out.println("===================================");
    }
    public static void printTruck(Truck truck) {
        System.out.printf("모델명: %s\n", truck.model);
        System.out.printf("CC: %d\n", truck.cc);
        System.out.println("===================================");
    }
    
    // 다형적 변수를 사용하게 되면 동일한 코드를 갖고 있는 위의 메서드를 한개의 메서드로 통합할 수 있다.
    //  => 즉 Sedan 객체와 Truck 객체를 모두 가리킬 수 잇는 레퍼런스를 선언하라!
    //      즉 두 클래스의 상위 클래스의 래퍼런스를 선언하면된다.
    public static void printCar(Car car) {
        System.out.printf("모델명: %s\n", car.model);
        System.out.printf("CC: %d\n", car.cc);
        System.out.println("===================================");
    }
    public static void main(String[] args) {
        Sedan car1 = new Sedan();
        car1.model = "티코";
        car1.cc = 800;
        Truck car2 = new Truck();
        car2.model = "타이탄II";
        car2.cc = 10000;
        
        printSedan(car1);
        
        // pintSedan()의 파라미터는 Sedan 객체의 주소만 받을 수 있다.
        // 그래서 Truck 객체를 전달할 수 없다.
        // 해결책?
        //  => Truck을 출력하는 메서드를 따로 만들어 사용하라!
        printTruck(car2);
        
        
        // 또다른 해결책?
        // Sedan과 Truck을 모두 처리하는 메서드를 만들어 사용하라!
        printCar(car1); // OK! 왜? Sedan은 Car의 일종이다.
        printCar(car2); // OK! 왜? Truck도 Car의 서브 클래스이다.
    }
}
