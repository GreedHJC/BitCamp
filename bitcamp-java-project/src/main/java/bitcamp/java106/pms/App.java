package bitcamp.java106.pms;

public class App {
    public static void main(String[] args) {

        java.io.InputStream keyboard = System.in;
        java.util.Scanner sc = new java.util.Scanner(keyboard);
        String[] nArr = new String[5];
        String[] gArr = {"팀명", "팀설명", "최대인원", "시작일", "종료일"};    
        for(int i=0; i<5; i++){
            System.out.println(gArr[i] + "을 입력하시오.");
            nArr[i] = sc.nextLine();
        }
        System.out.println("------------------------------------");
        System.out.println("팀명 :"+ nArr[0]); 
        System.out.println("설명 :"+ nArr[1]);
        System.out.println("최대인원 :"+ nArr[2]);        
        System.out.println("일자 :"+ nArr[3] +" ~ "+nArr[4]);
    }
}