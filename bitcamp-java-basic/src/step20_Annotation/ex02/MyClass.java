// 애노테이션 사용 
//  => @애노테이션 이름(프로퍼티명= 값, 프로퍼티명 = 값, ....)
package step20_Annotation.ex02;

@MyAnnotation(value="값") // 유지정책 => SOURCE
@MyAnnotation2(value="값") // 유지정책 => CLASS 
@MyAnnotation3(value="값") // 유지정책 => RUNTIME
public class MyClass {
    
    
}
