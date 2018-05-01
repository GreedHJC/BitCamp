// 메서드 정보 추출
package step18_interface.ex3_ExtractMathodinformation;

import java.lang.reflect.Method;

public class Exam01 {
    public static void m1() {}      // 퍼스
    public void m2() {}             //퍼
    protected void m3() {}          //프로
    void m4() {}                    //보이
    private void m5() {}            //프보
    
    public static void main(String[] args) {
        Class clazz = Exam01.class;

        // 클래스에서 메서드 정보를 추출하기
        // => 해당 클래스에 선언된 public 메서드 + 상속 받은 public 메서드 
        Method[] list = clazz.getMethods();
        
        for (Method m : list) {
            System.out.println(m.getName());
        }
    }

}


