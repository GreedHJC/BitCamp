// 흐름 제어문 - for 반복문
package step05_FlowControl;

import java.util.Scanner;

public class Exam04_1 {
    public static void main(String[] args) {
       // for(변수선언 및 초기화; 조건, 증감문) 문장
       // for(변수선언 및 초기화; 조건, 증감문) {문장1, 문장2, ...}
       
       // for문의 전형적인 예
       for(int i = 1; i<=5; i++){           //순서 int i -> 조건검사 ->문장-> 증감문 -> 조건검사 ->문장-> 증감문 ->조건검사 ->문장-> 증감문 ->
           System.out.println(i);
       }
       System.out.println("-----------------------------------------");

       for(int i = 1; i<=5;){
           System.out.println(i);
           i++;
       }

        System.out.println("-----------------------------------------");
        int i =1;
        for(; i<=5;){
            System.out.println(i);
            i++;
        }
       System.out.println("-----------------------------------------");
        int j =1;
       for(; ;){
            if(j>5)
                break;
           System.out.println(j);
           j++;
       }
        
       

    }
}
