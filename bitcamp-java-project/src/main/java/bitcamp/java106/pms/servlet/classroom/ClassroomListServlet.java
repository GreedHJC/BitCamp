package bitcamp.java106.pms.servlet.classroom;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import bitcamp.java106.pms.dao.ClassroomDao;
import bitcamp.java106.pms.domain.Classroom;
import bitcamp.java106.pms.support.WebApplicationContextUtils;

@SuppressWarnings("serial")
@WebServlet("/classroom/list")
public class ClassroomListServlet extends HttpServlet {

    ClassroomDao classroomDao;

    @Override
    public void init() throws ServletException {
        ApplicationContext iocContainer = 
                WebApplicationContextUtils.getWebApplicationContext(
                        this.getServletContext()); 
        classroomDao = iocContainer.getBean(ClassroomDao.class);
    }

    @Override
    protected void doGet(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {

        try {
            List<Classroom> list = classroomDao.selectList();

            // JSP가 게시물 목록을 사용할 수 있도록 ServletRequest 보관소에 저장한다.
            request.setAttribute("list", list);

            // include 한다면, 이 서블릿에서 콘텐트 타입을 지정해야 한다.
            response.setContentType("text/html;charset=UTF-8");

            // JSP를 실행한다. 실행 완료 후 이 서블릿으로 되돌아 온다.
            request.getRequestDispatcher("/classroom/list.jsp").include(request, response);
        } catch (Exception e) {
            RequestDispatcher 요청배달자 = request.getRequestDispatcher("/error");
            request.setAttribute("error", e);
            request.setAttribute("title", "강의 목록조회 실패!");
            // 다른 서블릿으로 실행을 위임할 때,
            // 이전까지 버퍼로 출력한 데이터는 버린다.
            요청배달자.forward(request, response);
        }
    }
}

//ver 39 - forward 적용
//ver 37 - 컨트롤러를 서블릿으로 변경
//ver 31 - JDBC API가 적용된 DAO 사용
//ver 28 - 네트워크 버전으로 변경
//ver 26 - ClassroomController에서 list() 메서드를 추출하여 클래스로 정의.

