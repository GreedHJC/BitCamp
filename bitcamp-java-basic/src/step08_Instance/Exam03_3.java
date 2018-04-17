//인스턴스 메서드 응용
package step08_Instance;

import java.util.Scanner;

public class Exam03_3 {
    static class Score{
        String name;
        int kor;
        int eng;
        int math;
        int sum;
        float average;
        
        public void compute() {
            this.sum = this.kor +this.eng + this.math;
            this.average = this.sum / 3f;
        }
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("성적 데이터를 입력하세요.(예: 홍길동 100 100 100) > ");
        
        Score s1 = new Score();
        s1.name = sc.next();
        s1.kor = sc.nextInt();
        s1.eng = sc.nextInt();
        s1.math = sc.nextInt();
        s1.compute();
        
        System.out.println("성적 데이터를 입력하세요.(예: 홍길동 100 100 100) > ");
        
        Score s2 = new Score();
        s2.name = sc.next();
        s2.kor = sc.nextInt();
        s2.eng = sc.nextInt();
        s2.math = sc.nextInt();
        s2.compute();
      
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.average);
        
        System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.average);

        
    }
}

