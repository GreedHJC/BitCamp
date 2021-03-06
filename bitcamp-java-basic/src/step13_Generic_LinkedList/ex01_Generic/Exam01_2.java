// 제네릭(Generic) - 사용 후
package step13_Generic_LinkedList.ex01_Generic;

import java.util.ArrayList;

public class Exam01_2 {
    public static void main(String[] args) {
        // Generic
        // 특징 1 : 다루는 타입을 제한할 수 있다.
        //  => 즉, ArrayList가 어떤 종류(타입,클래스)의 객체를 저장할 것인지 지정할 수 있다.
        //      지정된 타입 외에 다른 타입은 저장할 수 없다.
        //  => 방법
        //      클래스명 옆에 다루고자 하는 타입의 이름을 지정한다.
        //      클래스명<타입명>
        //
        ArrayList<Member> list = new ArrayList<Member>();
        list.add(new Member("홍길동",20));
//        list.add(new String("Hello"));
//        list.add(new Integer(100));
//        list.add(new HashSet());
        
        // 특징 2 : 제레릭을 지정하면 그와 관련된 메서드의 타입 정보가 자동으로 바뀐다.
        Member member = list.get(0);
        System.out.println(member.name);
        System.out.println(member.age);
        
        // 만약 제네릭이라는 문법이 없다면?
        // 1) 값을 꺼낼 때 마다 형변환을 해야 한다.
        // 2) 형변환하기 싫다면 값의 종류별로 ArrayList를 만들어야 한다.
        
        // 제네릭 문법이 존재하므로,
        // 1) 한 개의 클래스로 여러 타입의 객체를 다룰 수 있다.
    
    }
    
}
