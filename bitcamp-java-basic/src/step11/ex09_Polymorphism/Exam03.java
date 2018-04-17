// 다형성 - 다형적 변수와 형변환
package step11.ex09_Polymorphism;

public class Exam03 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        
        v1.model = "티코";
        v1.copacity = 5;
        
        // v1 변수에는 Vehicle 객체가 들어있다.
        // 그런데 그 주소가 Sedan 객체의 주소라고 속이고 컴파일을 시도하면, 컴파일러는 그러거나 하고 그냥 통과시킨다.
        // 문제는 실행 할 때 들통난다.
        Sedan s = (Sedan)v1;    // JVM이 형변환을 처리할 때 진짜 Sedan 객체가 맞는지 검사한다. 따라서 실행 오류 발생!
        s.cc = 1980;       
        s.valve = 16;      
        s.sunroof = true;  
        s.auto = true;     
        
        System.out.printf("%s, %d, %d, %d, %b, %b\n", v1.model, v1.copacity, s.cc, s.valve, s.sunroof, s.auto);
        
        // 각각의 변수에 대해서 일일이 형변환해서 사용하기가 불편한가?
        //  => 그냥 레퍼런스를 형변환 해서 사용하라!
        
    }
}
