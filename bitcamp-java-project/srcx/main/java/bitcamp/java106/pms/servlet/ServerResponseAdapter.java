package bitcamp.java106.pms.servlet;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import bitcamp.java106.pms.server.ServerResponse;

// 새규칙에 따라 기존에 만든 클래스를 사용할 수 있도록 중간에서 중계해주는 역할 - Adapter
//  => 이런 방식으로 설계하는 것을 "Adapter 패턴" 이라 부른다.
//  => 즉, 기존에 만든 클래스를 새 기술이나 새 구조에서도 재사용할 수 있돌고 해주는 설계 기법이
public class ServerResponseAdapter extends ServerResponse {
    HttpServletResponse response;
    
    public ServerResponseAdapter(HttpServletResponse response) {
        super(null);
        this.response = response;
    }
    
    // 상속 받은 메서드를 현재 클래스의 역할에 맞게끔 재정의하기 - 오버라이딩(overriding)
    @Override
    public PrintWriter getWriter()  {
        try {
            return response.getWriter();    
        } catch (Exception e) {
            return null;
        }
        
    }
    
    
    
    

}
