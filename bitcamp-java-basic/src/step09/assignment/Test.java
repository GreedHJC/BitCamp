package step09.assignment;

import java.util.Calendar;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("년, 월, 일? (예 2018 3 21)");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR, year);
        c.set(Calendar.MONTH, month -1);
        c.set(Calendar.DATE, day);
        String[] week = {" ","일","월", "화", "수", "목", "금", "토"};

        System.out.printf("요일 :  %s요일\n", week[c.get(Calendar.DAY_OF_WEEK)]);
        System.out.printf("주차 :  %d주차\n", c.get(Calendar.WEEK_OF_MONTH));
        System.out.printf("일차 :  %d일차\n", c.get(Calendar.DAY_OF_YEAR));
        
//        
//        String input = sc.nextLine();
//        String[] arr = input.split(" ");
//        String[] week = {"일요일","월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
//        for(int i=0; i< 7; i++) {
//            if(Integer.parseInt(arr[2])/ == i) {
//                System.out.printf("요일 : %s",week[i]);
//            }
//        }
        
        
    }
}
