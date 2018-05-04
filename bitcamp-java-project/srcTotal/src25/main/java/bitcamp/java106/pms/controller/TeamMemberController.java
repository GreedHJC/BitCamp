// Controller 규칙에 따라 메서드 작성
package bitcamp.java106.pms.sql.controller;

import java.util.Iterator;
import java.util.Scanner;

import bitcamp.java106.pms.sql.annotation.Component;
import bitcamp.java106.pms.sql.dao.MemberDao;
import bitcamp.java106.pms.sql.dao.TeamDao;
import bitcamp.java106.pms.sql.dao.TeamMemberDao;
import bitcamp.java106.pms.sql.domain.Member;
import bitcamp.java106.pms.sql.domain.Team;

@Component("team/member")
public class TeamMemberController implements Controller {
    
    Scanner keyScan;
    TeamDao teamDao;
    MemberDao memberDao;
    TeamMemberDao teamMemberDao;
    
    public TeamMemberController(Scanner scanner, TeamDao teamDao, 
            MemberDao memberDao, TeamMemberDao teamMemberDao) {
        this.keyScan = scanner;
        this.teamDao = teamDao;
        this.memberDao = memberDao;
        this.teamMemberDao = teamMemberDao;
    }
    
    public void service(String menu, String option) {
        if (menu.equals("team/member/add")) {
            this.onTeamMemberAdd(option);
        } else if (menu.equals("team/member/list")) {
            this.onTeamMemberList(option);
        } else if (menu.equals("team/member/delete")) {
            this.onTeamMemberDelete(option);
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
    }

    void onTeamMemberAdd(String teamName) {
        if (teamName == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return; 
        }
        
        Team team = teamDao.get(teamName);
        if (team == null) {
            System.out.printf("%s 팀은 존재하지 않습니다.", teamName);
            return;
        }
        
        System.out.println("[팀 멤버 추가]");
        System.out.print("추가할 멤버의 아이디는? ");
        String memberId = keyScan.nextLine();
        
        Member member = memberDao.get(memberId);
        if (member == null) {
            System.out.printf("%s 회원은 없습니다.", memberId);
            return;
        }
        
        if (teamMemberDao.isExist(teamName, memberId)) {
            System.out.println("이미 등록된 회원입니다.");
            return;
        }
        
        teamMemberDao.addMember(teamName, memberId);
    }

    void onTeamMemberList(String teamName) {
        if (teamName == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return; 
        }
        
        Team team = teamDao.get(teamName);
        if (team == null) {
            System.out.printf("%s 팀은 존재하지 않습니다.", teamName);
            return;
        }

        System.out.println("[팀 멤버 목록]");
        System.out.print("회원들: ");
        
        Iterator<String> iterator = teamMemberDao.getMembers(teamName);
        if (iterator != null) {
            while (iterator.hasNext()) {
                System.out.printf("%s, ", iterator.next());
            }
        }
        System.out.println();
    }

    void onTeamMemberDelete(String teamName) {
        if (teamName == null) {
            System.out.println("팀명을 입력하시기 바랍니다.");
            return; 
        }
        
        Team team = teamDao.get(teamName);
        if (team == null) {
            System.out.printf("%s 팀은 존재하지 않습니다.", teamName);
            return;
        }
        
        System.out.print("삭제할 팀원은? ");
        String memberId = keyScan.nextLine();
        
        if (!teamMemberDao.isExist(teamName, memberId)) {
            System.out.println("이 팀의 회원이 아닙니다.");
            return;
        }

        teamMemberDao.deleteMember(teamName, memberId);
        
        System.out.println("[팀 멤버 삭제]");
        System.out.println("삭제하였습니다.");
    }
}

//ver 23 - @Component 애노테이션을 붙인다.
//ver 18 - ArrayList가 적용된 TeamMemberDao를 사용한다.
//ver 17 - TeamMemberDao 클래스를 사용하여 팀 멤버의 아이디를 관리한다.
//ver 16 - 인스턴스 변수를 직접 사용하는 대신 겟터, 셋터 사용.
// ver 15 - 팀 멤버를 등록, 조회, 삭제할 수 있는 기능 추가. 
// ver 14 - TeamDao를 사용하여 팀 데이터를 관리한다.
// ver 13 - 시작일, 종료일을 문자열로 입력 받아 Date 객체로 변환하여 저장.