// 애노테이션 확인
package step20_Annotation.ex05;

public class Exam02 {

    public static void main(String[] args) {
        // 클래스 정보 객체로부터 애노테이션 정보 추출
        Class clazz = MyClass2.class;
        MyAnnotation2 obj = (MyAnnotation2)clazz.getAnnotation(MyAnnotation2.class);
        System.out.println(obj.v1()[0]);
        System.out.println(obj.v2()[0]);
        System.out.println(obj.v3()[0]);
    }
}
