package bitcamp.java106.pms;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import bitcamp.java106.pms.Description;
import bitcamp.java106.pms.GroupDescription;
import bitcamp.java106.pms.MemberDescription;

public class Management {
    private List<Description> data;

    public Management() {
        data = new ArrayList<Description>();
    }

    public void addData(Scanner sc, String[] question, boolean type) {
        Description sub;

        if(type)
            sub = new GroupDescription();
        else
            sub = new MemberDescription();

        sub.add(sc, question);
        data.add(sub);
        System.out.println();
    }

    public void getData() {
        for(int i=0; i<data.size(); i++)
            data.get(i).get();
        System.out.println();
    }

    public void findData(String target) {
        boolean check = false;
                            
        for(int i=0; i<data.size(); i++) {
            if(data.get(i).getBase().equals(target)) {
                data.get(i).get();
                check = true;
                System.out.println();
                break;
            }
        }
        if(!check)
            System.out.println("해당 이름의 팀이 없습니다.\n");
    }
}