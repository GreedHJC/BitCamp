package step13_Generic_LinkedList.ex01_Generic;

public class Member {
    // 사용자 정의 데이터 타입 
    String name;
    int age;
    public Member(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "Member [name=" + name + ", age=" + age + "]";
    }


}
