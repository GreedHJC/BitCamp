package step05.assignment;

import java.util.Scanner;



public class Test01{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("밑변 길이? ");
        int len = sc.nextInt();
        int count = 1;
        while(count <=len){
            int starCnt = 1;
            while(starCnt <= count){
                System.out.print("*");
                starCnt++;
            }
            System.out.println();
            count++;
        }
            
    }
}