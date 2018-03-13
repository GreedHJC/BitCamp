package step05.assignment;

import java.util.Scanner;




public class Test03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("밑변 길이? ");
        int len = sc.nextInt();
        int starLen = 1;
        
        while(starLen <= len){
            int spaceCnt = 1;
            int spaceLen = (len - starLen)/2;
            while(spaceCnt++ <= spaceLen){
                System.out.print(" ");
            }
            int starCnt = 1;

            while(starCnt++ <= starLen){
                System.out.print("*");
            }
            System.out.println();
            starLen +=2;
            
        }
        
    }
}
