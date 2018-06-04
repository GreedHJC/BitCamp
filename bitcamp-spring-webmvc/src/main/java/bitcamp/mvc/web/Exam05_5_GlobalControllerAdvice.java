package bitcamp.mvc.web;

import java.beans.PropertyEditorSupport;
import java.sql.Date;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

// 모든 페이지 컨트롤러에 대해 조언을 수행하는 클래스 정의
//  => 다음 애노테이션을 붙이면 프론트 컨트롤러는 페이지 컨트롤러를 실행하기 전에 먼저 이 클래스를 살펴 볼 것이다.
@ControllerAdvice
public class Exam05_5_GlobalControllerAdvice {

    // 글로벌 컨트롤러 어드바이스 객체에 따로 Binder 관련 기능을 초기화시키는 메서드를 정의해 두었기 때문에
    // 다음 메서드를 이 컨트롤러에 등록하지 않아도 된다.
    @InitBinder 
    public void initBinder(WebDataBinder binder) {
        System.out.println("Exam05_5_GlobalControllerAdvice.initBinder()");
        binder.registerCustomEditor(
                java.sql.Date.class,                
                new PropertyEditorSupport() {       
                    @Override
                    public void setAsText(String text) throws IllegalArgumentException {
                        this.setValue(Date.valueOf(text));

                    }
                });   
    }
}
