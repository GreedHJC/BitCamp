package bitcamp.java106.pms;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import bitcamp.java106.pms.GroupDescription;
import bitcamp.java106.pms.MemberDescription;
import bitcamp.java106.pms.Management;

public class App {
    public static void main(String[] args) {
        String[][] question = { {"팀명? ", "설명? ", "최대인원? ", "시작일? ", "종료일? " }, {"아이디? ", "이메일? ", "암호? "}};
        Scanner sc = new Scanner(System.in);
        Management manage = new Management();
        
        String command = "";

        while( !command.equals("quit") ) {
            System.out.print("명령> ");
            command = sc.nextLine();
            String[] sub;

            if(command.toLowerCase().equals("help")) {
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : member/list");
                System.out.println("회원 상세조회 명령 : member/view 아이디");
                System.out.println("종료 : quit\n");
                continue;
            } else if(command.indexOf("/") > -1)
                sub = command.split("/");
            else {
                System.out.println("명령어가 올바르지 않습니다.\n");
                continue;
            }

            String[] sub2;

            if(sub[1].indexOf(" ") > -1) // view가 해당
                sub2 = sub[1].split(" ");
            else {
                sub2 = new String[2];
                sub2[0] = sub[1];
            } // add, list가 해당

            if(sub[0].equals("team") || sub[0].equals("member")) {
                switch(sub2[0]) {
                    case "add" :
                        if(sub[0].equals("team"))
                            manage.addData(sc, question[0], true );
                        else
                            manage.addData(sc, question[1], false );
                        break;
                    case "list" :
                        manage.getData();
                        break;
                    case "view" :
                        manage.findData(sub2[1]);
                        break;
                    default :
                        System.out.println("명령어가 올바르지 않습니다.\n");
                }
            } else if(sub[0].equals("quit"))
                break;
            else
                System.out.println("명령어가 올바르지 않습니다.\n");
        }
        System.out.println("안녕히가세요!");
    }
}