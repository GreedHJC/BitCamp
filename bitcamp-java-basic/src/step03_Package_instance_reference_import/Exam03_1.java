// 레퍼런스와 인스턴스 - 가비지
package step03_Package_instance_reference_import;

public class Exam03_1 {
    public static void main(String[] args) {
        // 여러 개의 인스턴스 주소를 저장하기

        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }
        // Score 래퍼런스 선언
        Score s1;

        // 인스턴스를 만들어 그 주소를 레퍼런스에 저장한다.
        s1 = new Score();
        
        // 새 인스턴스를 만들어 s1에 주소를 저장한다.
        s1 = new Score();

        // 그러면 기존에 들어 있던 주소는 잃어버린다.
        // 주소를 잃어버려 사용할 수 없는 메모리를 "가비지(garbage)"라 부른다. 가비지는 가비지 컬렉터에 의해 메모리에 해제된다.
        // 가비지 컬렉터의 실행 
        // - 메모리 부족할떄, CPU가 한가할때
        // - System.gc()를 호출하여 가비지 실행을 요청할때, 바로 실행하는 것이 아니라 빠른 시간 내에 실행할 것을 종용하는 것이다.
        // 아무래도 원래의 시간보다는 앞 당겨 청소를 하게 될 것이다.
        
        
        System.out.printf("이름 : %s\n", s1.name);
        
//        System.out.printf("이름 : %s\n", s2.name);
//        System.out.printf("이름 : %s\n", s3.name);
    }
}
