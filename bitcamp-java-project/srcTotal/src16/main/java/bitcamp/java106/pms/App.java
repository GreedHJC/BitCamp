package bitcamp.java106.pms.sql;

import java.util.Scanner;

import bitcamp.java106.pms.sql.controller.BoardController;
import bitcamp.java106.pms.sql.controller.MemberController;
import bitcamp.java106.pms.sql.controller.TeamController;
import bitcamp.java106.pms.sql.controller.TeamMemberController;
import bitcamp.java106.pms.sql.dao.MemberDao;
import bitcamp.java106.pms.sql.dao.TeamDao;
import bitcamp.java106.pms.sql.util.Console;

public class App {
    static Scanner keyScan = new Scanner(System.in);
    public static String option = null; 
    
    static void onQuit() {
        System.out.println("안녕히 가세요!");
    }

    static void onHelp() {
        System.out.println("[도움말]");
        System.out.println("팀 등록 명령 : team/add");
        System.out.println("팀 조회 명령 : team/list");
        System.out.println("팀 상세조회 명령 : team/view 팀명");
        System.out.println("회원 등록 명령 : member/add");
        System.out.println("회원 조회 명령 : member/list");
        System.out.println("회원 상세조회 명령 : member/view 아이디");
        System.out.println("종료 : quit");
    }

    public static void main(String[] args) {
        // 클래스를 사용하기 전에 필수 값을 설정한다.
        
        TeamDao teamDao = new TeamDao();
        MemberDao memberDao = new MemberDao();
        
        TeamController teamController = new TeamController(keyScan, teamDao);
        TeamMemberController teamMemberController = new TeamMemberController(keyScan, teamDao, memberDao);
        MemberController memberController = new MemberController(keyScan, memberDao);
        BoardController boardController = new BoardController(keyScan);
        
        Console.keyScan = keyScan;

        while (true) {
            String[] arr = Console.prompt();

            String menu = arr[0];
            if (arr.length == 2) {
                option = arr[1];
            } else {
                option = null;
            }

            if (menu.equals("quit")) {
                onQuit();
                break;
            } else if (menu.equals("help")) {
                onHelp();
            } else if (menu.startsWith("team/member/")) {
                teamMemberController.service(menu, option);
            } else if (menu.startsWith("team/")) {
                teamController.service(menu, option);
            } else if (menu.startsWith("member/")) {
                memberController.service(menu, option);
            } else if (menu.startsWith("board/")) {
                boardController.service(menu, option);
            } else {
                System.out.println("명령어가 올바르지 않습니다.");
            }

            System.out.println(); 
        }
    }
}

// ver 15 - TeamDao와 MemberDao 객체 생성. 
//          팀 멤버를 다루는 메뉴 추가.