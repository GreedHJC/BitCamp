// ServletRequestEvent : 요청이 들어오고 응답이 완료되었을 때 발생하는 이벤트 처리
package step09.ex2;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Listener3 implements ServletRequestAttributeListener{

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        System.out.println("Listener3.attributeAdded()");
        // ServletRequestAttributeEvent 객체에 값을 저장할 때 호출된다.
        System.out.printf("%s=%s 저장\n",srae.getName(), srae.getValue());
    }
    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        System.out.println("Listener3.attributeReplaced()");
        // ServletRequestAttributeEvent 객체에 값을 변경할 때 호출된다.
        System.out.printf("%s=%s(%s) 변경\n",srae.getName(), srae.getServletRequest().getAttribute(srae.getName()), srae.getValue());
    }
        


    
    
}
