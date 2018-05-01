// 비트 이동 연산자 : 응용 I
package step04_Operators;

public class Exam04_4{
    public static void main(String[] args) {

        int i = 0x27a130ff;

        // i 변수에 들어있는 값을 1바이트씩 잘라서 16진수로 출력하라.
        // 00100111_10100001_00110000_11111111;
        int a = i >> 24;            // 00000000_00000000_00000000_00100111;
        int b = (i >> 16) & 0xff;   // 00000000_00000000_00100111_10100001;    
        int c = (i >> 8) & 0xff;    
        int d = i & 0xff;


        System.out.println(Integer.toHexString(a));
        System.out.println(Integer.toHexString(b));
        System.out.println(Integer.toHexString(c));
        System.out.println(Integer.toHexString(d));


        System.out.println(0xff);
    }
}
