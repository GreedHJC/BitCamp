package bitcamp.java106.pms;

import java.io.InputStream;
import java.util.Scanner;
import bitcamp.java106.pms.domain.Team;;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        // String[] mArr = {"팀명", "팀설명", "최대인원", "시작일", "종료일"};
        Team[] team = new Team[5];    
 
        for(int i=0; i<team.length-1; i++) {
            team[i] = new Team();
            System.out.print("팀명? ");
            team[i].name = sc.nextLine();
            System.out.print("설명? ");
            team[i].desc = sc.nextLine();
            System.out.print("최대인원? ");
            team[i].max = sc.nextInt();
            System.out.print("시작일? ");
            team[i].sData = sc.nextLine();
            System.out.print("종료일? ");
            team[i].eData = sc.nextLine();

            count++;
            if(i==(team.length-1)){
                break;
            }
            System.out.print("계속 입력하시겠습니까?(Y/N) ");
            String a =  sc.next();
            if(a.toLowerCase().equals("y")){
                    continue;
            }else if(a.toLowerCase().equals("n")){
                break;
            }else{
                System.out.println("잘못 입력하셨습니다. 다시입력하십시오.");
                System.out.print("계속 입력하시겠습니까?(Y/N)");
                a =  sc.next();
            }   
        }
            System.out.println("------------------------------------");
            for(int i =0; i < count; i++){
                System.out.printf("%s, %d명, %s ~ %s\n",team[i].name, team[i].max,
                                    team[i].sData, team[i].eData);
            }
      
    }
}



    // public static void main(String[] args) {

    //     java.io.InputStream keyboard = System.in;
    //     java.util.Scanner sc = new java.util.Scanner(keyboard);
    //     String[] nArr = new String[5];
    //     String[] gArr = {"팀명", "팀설명", "최대인원", "시작일", "종료일"};    
    //     for(int i=0; i<5; i++){
    //         System.out.println(gArr[i] + "을 입력하시오.");
    //         nArr[i] = sc.nextLine();
    //     }
    //     System.out.println("------------------------------------");
    //     System.out.println("팀명 :"+ nArr[0]); 
    //     System.out.println("설명 :"+ nArr[1]);
    //     System.out.println("최대인원 :"+ nArr[2]);        
    //     System.out.println("일자 :"+ nArr[3] +" ~ "+nArr[4]);
    // }
