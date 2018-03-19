package step06.assignment;

import java.util.Scanner;



public class Test02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.print("밑변 길이? ");
        // int len = sc.nextInt();
        // int count = 1;
        // while(count <=len){
        //     int starCnt = 1;
        //     while(starCnt <= count){
        //         System.out.print("*");
        //         starCnt++;
        //         if(count == starCnt){
        //             while(starCnt <= 1){
        //                 System.out.println("*");
        //                 starCnt--;
        //             }
        //         }
        //     }
        //     System.out.println();
        //     count++;
        // }
            
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
        count =len-1;
        while(count >= 1){
            int starCnt = 1;
            while(starCnt <= count){
                System.out.print("*");
                starCnt++;
            }
            System.out.println();
            count--;
        }
    }
}
