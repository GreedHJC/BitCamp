// 게시물 관리 - 목록 + PreparedStatement 사용
package step25.ex3_EncapsulationDAO;

import java.util.List;

public class Exam01_list {

    public static void main(String[] args) throws Exception {
        BoardDao boardDao = new BoardDao();

        try {
            List<Board> list = boardDao.list();

            for(Board board :list) {
                System.out.printf("%d,%s,%s\n", 
                        board.getNo(),board.getTitle(), board.getRegisteredDate());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
