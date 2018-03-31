package bitcamp.java106.pms.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class TeamMemberDao {

    private HashMap<String, ArrayList<String>> collection = new HashMap<>(); 

    public int addMember(String teamName, String memberId) {
        String teamNameLC = teamName.toLowerCase();
        String memberIdLC = memberId.toLowerCase();

        // 팀 이름으로 멤버 아이디가 들어 있는 ArryList를 가져온다.
        ArrayList<String> members = collection.get(teamNameLC);
        if (members == null) { // 해당 팀의 멤버가 추가된 적이 없다면,     //memberId가 있는지 없는지 확인 하는 if           
            members = new ArrayList<>();
            members.add(memberIdLC);
            collection.put(teamNameLC, members);            //입력(추가)
            return 1;
        }
        // ArrayList에 해당 아이디를 가진 멤버가 들어 있다면,    
        if(members.contains(memberIdLC)){           //memberId가 있다면 ArryList안에 memberId이 
            return 0;                               // 있는지 비교해서 있으면 리턴해라.        
        }

        members.add(memberIdLC);                  // 팀은 있지만 어레이 안에 멤버가 없다면 add 해서 ID를 추가해라!
        return 1;
    }

    public int deleteMember(String teamName, String memberId) {
        String teamNameLC = teamName.toLowerCase();
        String memberIdLC = memberId.toLowerCase();

        ArrayList<String> members = collection.get(teamNameLC);
        if(members == null || !members.contains(memberIdLC)) {      
            return 0;                                  // 멤버의 팀이름이 없거나, 팀은 있지만 ID가 없으면 리턴해라!
        }

        members.remove(memberIdLC);                 // 멤버 id가 잇으면 지워라
        return 1;
    }
    
    // ArrayList로 리턴하는 경우 ArrayList를 컨트롤러에서 손댈수 있기때문에 Iterator를 사용하게되면
    //  Iterator 클래스 안에는 보는 기능 밖에 없기때문에 Iterator를 사용한다.    
    public Iterator<String> getMembers(String teamName) {
        ArrayList<String> members = collection.get(teamName.toLowerCase());
        if(members == null) {
            return null;
        }
        return members.iterator();
    }
    
    public boolean isExist(String teamName, String memberId) {
        String teamNameLC = teamName.toLowerCase();
        String memberIdLC = memberId.toLowerCase();

        ArrayList<String> members = collection.get(teamNameLC);
        if(members == null || !members.contains(memberIdLC)) {      
            return false;                                  
        }
        return true;
    }

}


// 용어 정리!
// 메서드 시그너처(method signature) = 함수 프로토타입(function prototype)
// => 메서드의 이름과 파라미터 형식, 리턴 타입에 대한 정보를 말한다.

//ver 18 - ArrayList를 적용하여 객체(의 주소) 목록을 관리한다.
//ver 17 - 클래스 추가









