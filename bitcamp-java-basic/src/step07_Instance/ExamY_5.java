// 사용자 정의 데이터 타입 - 인스턴스 변수와 인스턴스 메서드
package step07_Instance;


public class ExamY_5 {
    public static void main(String[] args) {
                
        // 계산 결과를 개별적으로 관리하고 싶은가?
        // 그렇다면  개별적으로 관리할 변수를 인스턴스 변수로 선언하라!!
        // 다음 두개의 식을 분리하여 계산해보자
        // 2+3+-1*7/3 = ?
        // 3*2+7/4-5 0 ?
        // 연산자 우선순위를 고려하지 않고 순서대로 계산!
        
        // 두 개의 식의 계산 결과를 따로 관리하기 위해서는 result 변수를 개별적으로 생성해야한다.
        
        Calculator4 c1 = new Calculator4(); //식 1의 계산 결과를 보관할 메모리준비
        Calculator4 c2 = new Calculator4(); //식 1의 계산 결과를 보관할 메모리준비
        
        // 계산을 수행할 때 계산 결과를 보관할 메모리를 전달하라!!
        // => 인스턴스 메서드를 사용하면 파라미터로 메모리 주소를 전달할 필요가 없다.
        c1.plus(2);
        c2.plus(3);
       
        c1.plus(3);
        c2.multiple(2);
        
        c1.minus(1);
        c2.plus(7);
        
        c1.multiple(7);
        c2.divide(4);
        
        c1.divide(3);
        c2.minus(5);

        
        //  식 1의 계산결과는 c1 인스턴스의 result에 들어있고, 식2의 계산결과는 c2 인스턴스 result에 들어있다.
        System.out.println(c1.result);
        System.out.println(c2.result);

    }
}

