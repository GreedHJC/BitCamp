// 흐름 제어문 - for 반복문의 초기화 변수
package step05_FlowControl;

import java.util.Scanner;

public class Exam04_3 {
    public static void main(String[] args) {
       String[] names = {"홍길동","임꺽정","유관순","윤봉길", "안중근"};

        for(int i= 0; i< names.length; i++){
            System.out.println(names[i]);
        }
        System.out.println("-----------------------------------------------");

        // 배열의 청므부터 끝까지 값을 꺼내는 것이라면 다음의 for 문법을 사용하라! 아주 편하다!
        // for (값을 저장할 변수선언 : 배열주소) 문장;

        for(String name : names)
            System.out.println(name);

        // 위의 방식으로 for문을 사용할 경우 변수 선언을 바깥에 들 수 없다.
        // Stirng name2;                    //컴파일 에러 !
        // for(name2 : names)               //컴파일 에러 !
        //     System.out.println(name);    //컴파일 에러 !


    }

}
