// 흐름 제어문 - for 반복문과 컬렉션(colletion)
package step05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exam04_3 {
    public static void main(String[] args) {
        // 배열은 같은 타입의 값을 보관할 수 있지만, 컬렉션은 다른 타입의 값을 보관할 수 있다.
        // 배열은 크기가 고정되지만, 컬렉션은 크기가 가변적이다.
        
        ArrayList list = new ArrayList();
        list.add("홍길동");
        list.add(3.14f);
        list.add(true);
        list.add(365);
        
        for(int i= 0; i< names.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println("-----------------------------------------------");

        // 배열의 청므부터 끝까지 값을 꺼내는 것이라면 다음의 for 문법을 사용하라! 아주 편하다!
        // for (값을 저장할 변수선언 : 배열주소) 문장;

        // for 문에 컬렉션도 for문을 적용할 수 있다.
        // for(변수 선언 : 컬렉션객체) 문장
        for(Object value : list)
            System.out.println(value);
    }

}
