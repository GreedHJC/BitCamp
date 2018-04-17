// 인스턴스 메서드와 클래스 메서드의 활용 - wrapper 클래스( 기본형 타입이 아닌 객체가 필요한 곳에 사용 될필요가 있을때 사용하는것 )
package step09_Class;

public class Exam02_2 {

    public static void main(String[] args) throws Exception{
        Integer i1 =  new Integer(100);
        Integer i2 =  new Integer(200);
        Integer i3 =  new Integer(300);
        
        // 인스턴스 메서드 사용
        System.out.println(i2.compareTo(i1));
        System.out.println(i2.compareTo(i3));
    
        int v1 = i2.intValue();
        
        System.out.println(v1);
        
        // 스테틱 메서드 = 클래스 메서드 사용
        int v2 = Integer.parseInt("1280");              //문자열을 인트형으로 변환
        
        String s1 = Integer.toBinaryString(77);         //숫자를 바이트 형식으로 변환
        String s2 = Integer.toOctalString(77);               //숫자를 8진수 형식으로 변환
        String s3 = Integer.toHexString(77);                    // 숫자를 16진수 형식으로 변환
        System.out.printf("77 : %s, %s, %s \n", s1, s2, s3);
        
        Integer x1 = Integer.valueOf("270");        //문자열에 있는 수를 10진수로 간주한다.
        Integer x2 = Integer.valueOf("44",16);        //10진수 숫자를 16진수로 표현한다.
        System.out.printf("%d, %d \n ", x1, x2);
        
        float f = Float.parseFloat("3.14f");
        boolean b = Boolean.parseBoolean("true");
        System.out.printf("%f, %b\n ", f, b);
    }
}