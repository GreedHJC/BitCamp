// 클래스 - 레퍼런스 배열 - 사용 전
package step03_Package_instance_reference_import;

public class Exam02_1{
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
        // Score 래퍼런스 준비
        Score s1, s2, s3;

        s1 =  new Score();
        s2 = new Score();
        s3 = new Score();
        
        //레퍼런스를 이용하여 인스턴스에 접근한 다음에 항목에 값을 넣는다.
        s1.name = "홍길동"; // s에 저장된 주소로 찾아가서 name 항목에 값 저장
        s2.name = "임꺽정";
        s3.name = "유관순";

        // 레퍼런스
        System.out.printf("이름 : %s\n", s1.name);
        
        System.out.printf("이름 : %s\n", s2.name);
        System.out.printf("이름 : %s\n", s3.name);
    }
}
