// 사용자 정의 데이터 타입 - 인스턴스 메서드
package step07_Instance;


public class ExamY_3 {
    public static void main(String[] args) {
        // 계산 결과를 개별적으로 관리하고 싶은가?
        // 그렇다면  
        // 클래스 변수는 오직 한개만 존재하기 때문에 여러개의 작업을 분리하여 진행 할 수 없다.
        
        // 다음 두개의 식을 분리하여 계산해보자
        // 2+3+-1*7/3 = ?
        // 3*2+7/4-5 0 ?
        // 연산자 우선순위를 고려하지 않고 순서대로 계산!
        
        // Calculator2에서는 계산 결과를 저장하는 변수가 한개여서 식 1과 식2를 동시에 계산할수 없다.
        Calculator2.plus(2);
        Calculator2.plus(3);
        Calculator2.minus(1);
        Calculator2.multiple(7);
        Calculator2.divide(3);
        
        
        
        System.out.println(Calculator2.result);
    }
}

