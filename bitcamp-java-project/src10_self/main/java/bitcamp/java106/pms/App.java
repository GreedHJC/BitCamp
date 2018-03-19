package bitcamp.java106.pms;

import java.util.Scanner;
import bitcamp.java106.pms.domain.Board;

// ver 0.2 - member 메뉴를 처리하는 코드를 관련 클래스인 MemberController로 보낸다.
// ver 0.1 - team 메뉴를 처리하는 코드를 TeamController로 보낸다.
public class App {
    
    static Scanner sc = new Scanner(System.in);
    static String option = null;

    static Board[] boards = new Board[1000];
    static int boardIndex = 0;

    static int getBoardIndex(String name){
        int i;
        for(i = 0; i < boardIndex; i++){
            if(teams[i]==null) continue;
            if(option.equals(Integer.toString(boards[i].count))){
                board = boards[i];
                return i;
            }
        }
    }
    static String[] prompt(){
        System.out.print("명령 > ");
        return sc.nextLine().toLowerCase().split(" ");
    }
    static void onQuit() {
        System.out.println("안녕히 가세요!");
    }
    static void onHelp(){

        System.out.println("               [도움말]");
            System.out.println("===========================================");
            System.out.println("| 게시판 등록 명령 : board/add            |");
            System.out.println("| 게시판 목록 명령 : board/list           |");
            System.out.println("| 게시글 조회 명령 : board/view 글제목     |");
            System.out.println("| 게시글 변경 명령 : board/update 글번호   |");
            System.out.println("| 게시글 삭제 명령 : board/delete 글번호   |");
            System.out.println("| 종료 : quit                            |");
            System.out.println("===========================================");

    }
    static void onBoardAdd(){
        Board board = new Board();
        System.out.println("[게시글 등록]");
        System.out.printf("제목 ? ");
        board.title = sc.nextLine();
        System.out.printf("내용 ? ");
        board.text = sc.nextLine();
        System.out.printf("등록일 ? ");
        board.day = sc.nextLine();
        board.count = boardIndex;
        boards[boardIndex++] = board;
    }
    static void onBoardlist(){
        int i ;
        for(i = 0; i < boardIndex; i++){
            if(boards[i] == null){
                continue;
            }
            System.out.printf("%d, %s, %s\n",boards[i].count,boards[i].title, boards[i].day);
        }
    }
    static void onBoardview(){
        System.out.println("[게시글 조회]");
        if(option == null){
            System.out.println("게시글 번호를 입력하시오.");
            System.out.println();
            return;
        }
        Board board = null;
        int i = getBoardIndex(option);
        
        if(board == i){
            System.out.println("해당 하는 게시글이 없습니다.");
        }else{
            System.out.printf("제목 : %s \n", board.title);
            System.out.printf("내용 : %s \n", board.text);
            System.out.printf("등록일 : %s \n", board.day);
        }
    }
    static void onBoardupdate(){
        System.out.println("[게시글 변경]");
                if(option == null){
                    System.out.println("변경할 게시글 번호를 입력하시오.");
                    return;
                }
                Board board = null;
                int i;
                for(i = 0; i < boardIndex; i++){
                    if(option.equals(Integer.toString(boards[i].count))){
                        board = boards[i];
                        break;
                    }
                }
                if(board == null){
                    System.out.println("변경할 게시글이 없습니다.");
                }else{
                    Board upBoard = new Board();
                    System.out.printf("제목(%s) : ", board.title);
                    upBoard.title = sc.nextLine();
                    System.out.printf("내용(%s) : ", board.text);
                    upBoard.text = sc.nextLine();
                    upBoard.day = board.day;
                    boards[i] = upBoard;
                }
    }
    static void onBoardDelete(){
        System.out.println("[게시글 삭제]");
        if(option == null){
            System.out.println("삭제할 게시글 번호를 입력하시오.");
            return;
        }
        Board board = new Board();
        int i ;
        for(i = 0; i < boardIndex; i++){
            if(option.equals(Integer.toString(boards[i].count))){
                board = boards[i];
                break;
            }
        }
        if(board == null){
            System.out.println("삭제할 게시글이 없습니다.");
        }else{
            System.out.println("정말 삭제 하시겠습니까?(y/N)");
            String input = sc.nextLine().toLowerCase();
            if(input.equals("y")){
                boards[i] = null;
                System.out.println("삭제 하였습니다.");
            }
        }
    }
    
    public static void main(String[] args) {
        while(true){
            String[] arr = prompt();

            String menu = arr[0];
            if(arr.length ==2){
                option = arr[1];
            }else {
                option = null;
            }

            if(menu.equals("quit")){
                onQuit();
                break;
            }else if(menu.equals("help")){
                onHelp();
            }else if(menu.equals("board/add")){
               onBoardAdd();
            }else if(menu.equals("board/list")){
                onBoardlist();
            }else if(menu.equals("board/view")){
                onBoardview();
                   
            }else if(menu.equals("board/update")){
                onBoardupdate();
                
            }else if(menu.equals("board/delete")){
               onBoardDelete();
            }

        }   
    }
}