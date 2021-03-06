//페이지 컨트롤러에 의존객체 주입하기 III - @Autowired
package bitcamp.mvc.web;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import bitcamp.mvc.dao.BoardDao;

@Controller 
@RequestMapping("/exam02_3")
public class Exam02_3 {
    
    @Autowired //==> 이것도 좋지만.... 제약조건을 강화하기 위해 생성자를 통해 주입하는 방식을 사용 
    BoardDao boardDao;
    
    // ServletContext를 주입 받을 때에도 인스턴스 변수로 주입한다.
    @Autowired
    ServletContext servletContext;
    
    @RequestMapping("m1")
    @ResponseBody
    public String m1() {
        return this.servletContext.getContextPath();//servletContext 경로 알아내기
    }
}
