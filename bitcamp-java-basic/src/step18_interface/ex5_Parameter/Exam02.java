// 리턴 타입
package step18_interface.ex5_Parameter;

import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;

public class Exam02 {

    public String m1(String name, int age) {return null;}
    public char[] m2() {return null;}
    public ArrayList m3(File file, String name) {return null;}
    public void m4() {}

    public static void main(String[] ok) {
        Class clazz = Exam02.class;

        // 클래스에 정의된 메서드를 모두 가져온다.
        Method[] methods = clazz.getDeclaredMethods();
        for(Method m : methods) {
            System.out.printf("%s:\n", m.getName());

            Class returntype = m.getReturnType();
            System.out.printf("리턴 : %s\n", returntype.getName());
        }
    }

}


