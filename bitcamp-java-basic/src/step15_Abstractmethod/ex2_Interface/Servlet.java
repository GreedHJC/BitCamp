// 인터페이스 문법을 사용하여 호출 규칙 정의
package step15_Abstractmethod.ex2_Interface;

public interface Servlet {
    void init();
    void service();
    void destroy();
    String getServletInfo();
    String getServletConfig();
}
