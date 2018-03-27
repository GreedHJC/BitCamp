package bitcamp.java106.pms.domain;

import java.sql.Date;

public class Task {
    public static final int READY = 0;
    public static final int WORKING = 1;
    public static final int COMPLETE = 9;
    
    private int no;
   
    private int state;
    private String title;
    private Date startDate;
    private Date endDate;
    private Member worker;
    private Team team;

    
    @Override
    public String toString() {
        return "Task [state=" + state + ", title=" + title + ", startDate=" + startDate + ", endDate=" + endDate
                + ", worker=" + worker + ", team=" + team + "]";
    }
    public Task(Team team) {
        this.team = team;
    }
    public Task(Team team, String title, Date startDate, Date endDate) {
        this.team =team;
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.state = READY;
    }
    
    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {  //0: 작업대기, 1: 작업중 , : 9완료)
        this.startDate = startDate;
    }
    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
    public Member getWorker() {
        return worker;
    }
    public void setWorker(Member worker) {
        this.worker = worker;
    }
    public Team getTeam() {
        return team;
    }
    public void setTeam(Team team) {
        this.team = team;
    } 
    public int getNo() {
        return no;
    }
    public void setNo(int no) {
        this.no = no;
    }


}


// ver 17 - 사용자 정의 데이터 타입 생성