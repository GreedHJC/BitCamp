// Controller 규칙에 따라 메서드 작성
package bitcamp.java106.pms.sql.controller.task;

import java.io.PrintWriter;

import bitcamp.java106.pms.sql.annotation.Component;
import bitcamp.java106.pms.sql.controller.Controller;
import bitcamp.java106.pms.sql.dao.TaskDao;
import bitcamp.java106.pms.sql.dao.TeamDao;
import bitcamp.java106.pms.sql.domain.Task;
import bitcamp.java106.pms.sql.domain.Team;
import bitcamp.java106.pms.sql.server.ServerRequest;
import bitcamp.java106.pms.sql.server.ServerResponse;

@Component("/task/delete")
public class TaskDeleteController implements Controller {
    
    TeamDao teamDao;
    TaskDao taskDao;
    
    public TaskDeleteController(TeamDao teamDao, TaskDao taskDao) {
        this.teamDao = teamDao;
        this.taskDao = taskDao;
    }
    
    @Override
    public void service(ServerRequest request, ServerResponse response) {
        PrintWriter out = response.getWriter();
        String teamName = request.getParameter("teamName");
        Team team = teamDao.get(teamName);
        if (team == null) {
            out.printf("'%s' 팀은 존재하지 않습니다.\n", teamName);
            return;
        }
        int taskNo = Integer.parseInt(request.getParameter("no"));
        Task task = taskDao.get(taskNo);
        if (task == null) {
            out.printf("'%s'팀의 %d번 작업을 찾을 수 없습니다.\n",
                    teamName, taskNo);
            return;
        }
        taskDao.delete(taskNo);
        out.println("삭제하였습니다.");
    }
}

//ver 28 - 네트워크 버전으로 변경
//ver 26 - TaskController에서 delete() 메서드를 추출하여 클래스로 정의.
//ver 23 - @Component 애노테이션을 붙인다.
//ver 22 - TaskDao 변경 사항에 맞춰 이 클래스를 변경한다.
//ver 18 - ArrayList가 적용된 TaskDao를 사용한다.
//ver 17 - 클래스 생성
