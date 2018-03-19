//정수 변수 
package step02;

public class Exam04_1{
   public static void main(String[] args) {
      byte b;
      // 정수 리터럴은 기본이 4바이트 메모리를 차지한다.
      // 그런데 byte 메모리에 저장할 수 있는 값이라면 허락한다.
      b = -128;
      System.out.println(b);
      b = 127;
      System.out.println(b);
      int a = 345;
      short s;
      // 4바이트 정수 리터럴을 short 메모리에(2byte)에 저장 할 수 있다면, 허락한다.
      s = -32768;
      System.out.println(s);
      s = 32767;
      System.out.println(s);

      int i;
      // 만약 2바이트 범위를 벗어난다면 컴파일 오류 발생
      // 인트에 롱값을 못넣음.
      i = -2147483648;
      System.out.println(i);
      i = 2147483647;
      System.out.println(i);
      
      long l ; 
      l = -9223372036854775808L;
      System.out.println(l);
      l = 9223372036854775807L;
      System.out.println(l);

      byte b2;
      b2 = 100;
      b2 = (byte) 100L;
      // 4바이트 정수 리터럴에 대해서만 byte나 short 메모리에 유요한 값을
      

   }
}