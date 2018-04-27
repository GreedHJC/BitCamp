// String - mutable vs immutable 객체
package step10_String_Warpper;

public class Exam01_3 {
    public static void main(String[] args) {
        
        // String 객체는 immutable 객체이다.
        // 즉, 한 번 객체에 값을 담으면 변경할 수 없다.
        
        String s1 = new String ("Hello");
        
        // String 클래스에서 제공하는 어떤 메서드를 호출하든지 간에 원래의 데이터를 변경하지 않는다.
        // 다만 새로운 Strung 객체를 만들 뿐이다.
        String s2 = s1.replace('l', 'x');
        System.out.printf("%s :  %s\n",s1, s2);
        
        String s3 = s1.concat(", world !");
        System.out.printf("%s : %s\n",s1 ,s3);

        // StringBuffer는 mutavle 객체이다.
        // 원래의 문자열ㅇ ㄹ 변경하고 싶을 때 사용하는 클래스이다.
        
        StringBuffer buf = new StringBuffer("Hlloe");
        buf.replace(2, 4, "xx");        // 원본을 바꾼다.
        System.out.println(buf);
       
        // 주의사항
        // StringBuffer의 내용물을 비교할대 equals() 사용해봐야 소용없다.
        // ==> 연산자와 같은 결과를 출력한다.
        StringBuffer b1 = new StringBuffer("Hello");
        StringBuffer b2 = new StringBuffer("Hello");
        if(b1.equals(b2)) {
            System.out.println("같다");
        }else {
            System.out.println("다르다.");
        }
        
        // StringBUffer의 내용물을 비교할 때 equals.
        if(b1.toString().equals(b2.toString())) {
            System.out.println(" 같다.");
        }else {
            System.out.println(" 다르다");
        }
    }
}