// 서블릿 실행 
package step09.ex2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/step09/ex2/exam01")
public class Exam01 extends HttpServlet {
    @Override
    protected void doGet(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {
        
        // 파라미터로부터 받은 값을 ServletRequest에 저장해보자!
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        
        request.setAttribute("이름", name);
        request.setAttribute("나이", age);
        System.out.println("-----------------------------------");
        
        request.setAttribute("이름", "우하하하");
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("  <meta charset='UTF-8'>");
        out.println("  <title>include</title>");
        
        RequestDispatcher 요청배달자 = request.getRequestDispatcher("/step08/ex3/common");
        요청배달자.include(request, response);
        
        out.println("</head>");
        out.println("<body>");
        
        요청배달자 = request.getRequestDispatcher("/step08/ex3/header");
        요청배달자.include(request, response);
        
        out.printf("<h1>%s 님 반갑습니다.</h1>\n", name);
        
        요청배달자 = request.getRequestDispatcher("/step08/ex3/footer");
        요청배달자.include(request, response);
        
        out.println("</body>");
        out.println("</html>");
        

    }
}







