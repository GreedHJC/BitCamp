// 문자 변수 - UTF-16(Unicode 2) 코드 값 저장
package step02_Scanner;

public class Exam06_2{
   public static void main(String[] args){
      // 0 ~ 65535 까지의 UTF-16코드 값을 저장하는 2byte 메모리
      char c1, c2;

      c1 = 0x41;  //A 문자의 UTF-16 코드값
      c2 = 65;    // A 문자의 UTF-16 코드값

      // println()은 변수의 타입에 따라 출력을 달리한다.
      // - 변수의 종류가 char이면,
      //    출력할때 10진수로 출력하는 대신 해당 코드의 문자를 찾아 출력한다.
      System.out.println(c1);
      System.out.println(c2);

      char c3;
      
      c3 = '가';
      int a = (int)c3;

      System.out.println(Integer.toHexString(a));
      System.out.println(a);
   }
}