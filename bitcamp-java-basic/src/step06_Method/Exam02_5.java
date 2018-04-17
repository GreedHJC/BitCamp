// 메서드 : 가변 파라미터
package step06_Method;


public class Exam02_5 {

    // 5) 메서드 : 가변 파라미터
    // [리턴타입] 메서드명(타입...변수)
    // => 0개 이상의 값을 받을 때 선언하는 방식
    // => 내부적으로 배열처럼 사용한다.

    // 다음은 hello()를 호출할 때 String 값을 0개 이상 전달할 수 있다.
    static void hello(String... names){
        for(int i=0; i<names.length; i++){
            System.out.printf("%s 님 반갑습니다\n", names[i]);
        }
    }

        public static void main(String[] args) {
        hello();
        System.out.println("---------------------------------");
        
        hello("홍길동");    // 이 경우 names 배열의 개수는 1이다.
        System.out.println("----------------------------------");

        hello("홍길동", "임꺽정", "유관순");    // 이 경우 names 배열의 개수는 3이다.
        System.out.println("----------------------------------");

        String[] arr = {"김구","안중근","윤봉길","유관순"};
        hello(arr);    // 가변 파라미터 자리에 배열을 직접 넣어도 된다.
        System.out.println("----------------------------------");
        // hello("홍길동", 20, "오호란");    // 컴파일 오류
    }
}
