// 애노테이션 프로퍼티 - 일반 프로퍼티
package step20_Annotation.ex04;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation2 {
    String tel(); 
}







