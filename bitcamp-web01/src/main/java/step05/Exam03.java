// 파일 업로드 - 멀티파트 파라미터 값 추출하기 II
package step05;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/step05/exam03")
public class Exam03 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(
            HttpServletRequest request, 
            HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/plain;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);

        try {
            Map<String,List<FileItem>> paramMap = upload.parseParameterMap(request);
            
                    out.printf("name=%s\n", paramMap.get("name").get(0).getString("UTF-8"));
                    out.printf("age=%s\n", paramMap.get("age").get(0).getString());
                    FileItem photo = paramMap.get("photo").get(0);
                    out.printf("photo=%s\n", photo.getName());
                    
                    // 업로드 파일을 저장한다.
                    ServletContext appEnvInfo = request.getServletContext();
                    String savedPath = appEnvInfo.getRealPath("/");
                    out.println(savedPath);
                    photo.write(new File(savedPath + "/" + photo.getName()));
                    
        } catch (Exception e) {
            out.println("멀티파트 데이터 분석 중 오류 발생.");
        }

        //out.printf("이름=%s\n", name);
        //out.printf("나이=%s\n", age);
        //out.printf("사진=%s\n", photo);
        
        
    }
}







