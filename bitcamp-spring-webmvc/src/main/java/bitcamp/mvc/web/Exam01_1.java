//@Controller와 @RequestMapping
package bitcamp.mvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // 페이지 컨트롤러를 가리킬 때 보통 이 애노테이션을 붙인다.
@RequestMapping("/exam01_1/m1") // 요청핸들러와 url을 연결할 때 이 애노테이션을 붙인다.
public class Exam01_1 {
    
    @RequestMapping // 위에서 지정한 url 요청을 처리할 메서드를 지정한다.
    @ResponseBody // 해당 메서드의 리턴값은 클라이언트에게 콘텐츠임을 지정한다.
    public String m1() {
        return "Exam01_1.m1()";
    }
    
    //다음과같이 RequestMapping이 붙은 메서드를 또 정의하면
    //'exam01/m1'에 대해 어떤 메서드를 호출할 지 결정할 수 없기 때문에 실행 오류 발생
    /*
    @RequestMapping 
    @ResponseBody 
    public String m2() {
        return "Exam01.m1()";
    }*/
    
    
}
