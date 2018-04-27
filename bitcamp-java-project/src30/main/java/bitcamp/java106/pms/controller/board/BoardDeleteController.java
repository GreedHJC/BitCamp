package bitcamp.java106.pms.sql.controller.board;

import java.io.PrintWriter;

import bitcamp.java106.pms.sql.annotation.Component;
import bitcamp.java106.pms.sql.controller.Controller;
import bitcamp.java106.pms.sql.dao.BoardDao;
import bitcamp.java106.pms.sql.domain.Board;
import bitcamp.java106.pms.sql.server.ServerRequest;
import bitcamp.java106.pms.sql.server.ServerResponse;

@Component("/board/delete")
public class BoardDeleteController implements Controller {
    BoardDao boardDao;
    
    public BoardDeleteController(BoardDao boardDao) {
        this.boardDao = boardDao;
    }
    
    @Override
    public void service(ServerRequest request, ServerResponse response) {
        PrintWriter out = response.getWriter();
        int no = Integer.parseInt(request.getParameter("no"));
        
        Board board = boardDao.get(no);
        
        if (board == null) {
            out.println("유효하지 않은 게시물 번호입니다.");
        } else {
            boardDao.delete(no);
            out.println("삭제하였습니다.");
        }
    }
    
}

//ver 28 - 네트워크 버전으로 변경
//ver 26 - BoardController에서 delete() 메서드를 추출하여 클래스로 정의. 
