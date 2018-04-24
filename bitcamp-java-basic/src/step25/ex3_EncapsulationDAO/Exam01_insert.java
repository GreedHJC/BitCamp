// 게시판 관리 - 등록 + PreparedStatement 사용
package step25.ex3_EncapsulationDAO;

import java.util.Scanner;

public class Exam01_insert {

    public static void main(String[] args) throws Exception {
        Scanner keyScan = new Scanner(System.in);
        // 사용자로부터 제목, 내용을 입력 받는다.
        Board board = new Board();
        
        System.out.print("제목? ");
        String title = keyScan.nextLine();
        
        System.out.print("내용? ");
        String content = keyScan.nextLine();
        
        try {
            BoardDao boardDao = new BoardDao();
            int count = boardDao.insert(board);
            System.out.printf("%d 개 입력 성공!", count);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        keyScan.close();
    }
}







