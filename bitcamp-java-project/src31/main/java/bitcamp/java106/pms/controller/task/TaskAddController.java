// Controller 규칙에 따라 메서드 작성
package bitcamp.java106.pms.sql.controller.task;

import java.io.PrintWriter;
import java.sql.Date;

import bitcamp.java106.pms.sql.annotation.Component;
import bitcamp.java106.pms.sql.controller.Controller;
import bitcamp.java106.pms.sql.dao.MemberDao;
import bitcamp.java106.pms.sql.dao.TaskDao;
import bitcamp.java106.pms.sql.dao.TeamDao;
import bitcamp.java106.pms.sql.dao.TeamMemberDao;
import bitcamp.java106.pms.sql.domain.Member;
import bitcamp.java106.pms.sql.domain.Task;
import bitcamp.java106.pms.sql.domain.Team;
import bitcamp.java106.pms.sql.server.ServerRequest;
import bitcamp.java106.pms.sql.server.ServerResponse;

@Component("/task/add")
public class TaskAddController implements Controller {
    
    TeamDao teamDao;
    TaskDao taskDao;
    MemberDao memberDao;
    TeamMemberDao teamMemberDao;
    
    public TaskAddController(TeamDao teamDao, 
            TaskDao taskDao, TeamMemberDao teamMemberDao, MemberDao memberDao) {
        this.teamDao = teamDao;
        this.taskDao = taskDao;
        this.teamMemberDao = teamMemberDao;
        this.memberDao = memberDao;
    }
    
    @Override
    public void service(ServerRequest request, ServerResponse response) {
        PrintWriter out = response.getWriter();
        Task task = new Task();
        task.setTitle(request.getParameter("title"));
        task.setStartDate(Date.valueOf(request.getParameter("startDate")));
        task.setEndDate(Date.valueOf(request.getParameter("endDate")));
        task.setTeam(new Team().setName(request.getParameter("teamName")));
        task.setWorker(new Member().setId(request.getParameter("memberId")));
        
        try {
            Team team = teamDao.selectOne(task.getTeam().getName());
            if (team == null) {
                out.printf("'%s' 팀은 존재하지 않습니다.\n", task.getTeam().getName());
                return;
            }
            
            Member member = memberDao.selectOne(task.getWorker().getId());
            if (member == null) {
                out.printf("'%s' 회원은 존재하지 않습니다.\n", task.getWorker().getId());
                return;
            }
            
            taskDao.insert(task);
            out.println("등록 성공!");
        } catch (Exception e) {
            out.println("등록 실패!");
            e.printStackTrace(out);
        }
    }

}

//ver 31 - JDBC API가 적용된 DAO 사용
//ver 28 - 네트워크 버전으로 변경
//ver 26 - TaskController에서 add() 메서드를 추출하여 클래스로 정의.
//ver 23 - @Component 애노테이션을 붙인다.
//ver 22 - TaskDao 변경 사항에 맞춰 이 클래스를 변경한다.
//ver 18 - ArrayList가 적용된 TaskDao를 사용한다.
//ver 17 - 클래스 생성