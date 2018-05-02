package step11_Inheritance.ex12_Override;

public class Exam04_1 {
    public static void main(String[] args) {
        Member m1 = new Member("홍길동", 20);
        Member m2 = new Member("홍길동", 20);

        // 비록 m1과 m2는 값은 값을 갖고 있지만 인스턴스가 다르다.
        System.out.println(m1==m2);

        // Object로 부터 상속 받은 hashCode()는 인스턴스 마다 고유의 해시값을 리턴한다.
        System.out.printf("%x, %x\n",m1.hashCode(),m2.hashCode());

        // Object로 부터 상속 받은 toString()은 "클래스명@해시값"을 리턴한다.
        System.out.printf("%s, %s\n",m1.toString(),m2.toString());
        
        // Object로 부터 상속 받은 equals()은 인스턴스 주소가 같은지 검사한다.
        System.out.printf("%b\n",m1.equals(m2));

        System.out.println("----------------------------------------------");
        
        String s1 = new String("Hello");
        String s2 = new String ("Hello");
        // 비록 s1과 s2는 값은 문자열을 갖고 있지만 인스턴스가 다르다.
        System.out.println(s1==s2);

        // String클래스는 Object로부터 상속 받은 hashCode()를 오버라이딩 했다.
        //  => 문자열이 같으면 같은 해시ㅏㅄ을 리턴하게 만들었다.
        System.out.printf("%x, %x\n",s1.hashCode(),s2.hashCode());

        // String 클래스는 Object로 부터 상속 받은 toString()을 오버라이딩 했다.
        //  => 스트링  인스턴스에 보관된 문자열을 리턴하도록 만들었다.
        System.out.printf("%s, %s\n",s1.toString(),s2.toString());
        
        // String 클래스는 Object로 부터 상속 받은 equals()를 오버라이딩 했다.
        //  => 문자열이 같은지를 비교하도록 만들었다.     
        System.out.printf("%b\n",s1.equals(s2));

    }
}