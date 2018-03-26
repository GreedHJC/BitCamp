package bitcamp.java106.pms.controller;

import java.sql.Date;
import java.util.Scanner;

import bitcamp.java106.pms.dao.MemberDao;
import bitcamp.java106.pms.dao.TaskDao;
import bitcamp.java106.pms.dao.TeamDao;
import bitcamp.java106.pms.domain.Member;
import bitcamp.java106.pms.domain.Team;

public class TaskController {
    
    Scanner keyScan;
    TeamDao teamDao;
    MemberDao memberDao;
    
    public TaskController(Scanner scanner, TeamDao teamDao, MemberDao memberDao) {
        this.keyScan = scanner;
        this.teamDao = teamDao;
        this.memberDao = memberDao;
    }

    public void service(String menu, String option) {
        if (menu.equals("task/add")) {
            this.onTaskAdd();
        } else {
            System.out.println("명령어가 올바르지 않습니다.");
        }
        
        void onTaskAdd(String teamName) {
            if (teamName == null) {
                System.out.println("팀명을 입력하시기 바랍니다.");
                return; 
            }
            
            Team team = TaskDao.get(teamName);
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
            
            if (team.isExist(memberId)) {
                System.out.println("이미 등록된 회원입니다.");
                return;
            }
            
            team.addMember(member);
        }
}
