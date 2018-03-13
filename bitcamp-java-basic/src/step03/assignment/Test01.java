package step03.assignment;

import java.io.InputStream;
import java.util.Scanner;



public class Test01{
    public static void main(String[] args) {
        InputStream key = System.in;
        Scanner sc = new Scanner(key);

        class Score {
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;
        }
        // Score 래퍼런스 선언 + 인스턴스 생성
        Score[] sArr = new Score[3];
        
        for(int i=0; i<sArr.length; i++){
            
            sArr[i] = new Score();
            
            System.out.print("입력 : ");
            sArr[i].name = sc.next();
            sArr[i].kor = sc.nextInt();
            sArr[i].eng = sc.nextInt();
            sArr[i].math = sc.nextInt();
            sArr[i].sum = sArr[i].kor + sArr[i].eng + sArr[i].math;
            sArr[i].aver = sArr[i].sum/3;
        }
        System.out.println("---------------------------");

        for(int i=0; i<sArr.length; i++){
            System.out.printf("%s %3d %3d %3d %3d %5.1f\n",
                                sArr[i].name,sArr[i].kor,sArr[i].eng,sArr[i].math,sArr[i].sum,sArr[i].aver);

        }

            
    }
}
