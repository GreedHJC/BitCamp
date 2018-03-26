package bitcamp.java106.pms.dao;

import bitcamp.java106.pms.domain.Task;
import bitcamp.java106.pms.domain.Team;

public class TaskDao {
        
    public void insert(Team team) {
        // 팀 정보가 담겨있는 객체의 주소를 배열에 보관한다.
        this.teams[this.teamIndex++] = team;
    }
    
    public Team[] list() {
        Team[] arr = new Team[this.teamIndex];
        for (int i = 0; i < this.teamIndex; i++) 
            arr[i] = this.teams[i];
        return arr;
    }
    
    public Task get(String name) {
        int i = this.getTeamIndex(name);
        if (i == -1)
            return null;
        return [i];
    }
    
    public void update(Team team) {
        int i = this.getTeamIndex(team.getName());
        if (i != -1)
            teams[i] = team;
    }
    
    public void delete(String name) {
        int i = this.getTeamIndex(name);
        if (i != -1) 
            teams[i] = null;
    }
    
    private int getTaskIndex(String name) {
        for (int i = 0; i < this.; i++) {
            if (this.teams[i] == null) continue;
            if (name.equals(this.teams[i].getName().toLowerCase())) {
                return i;
            }
        }
        return -1;
    }
}