// 증감 연산자 : 후위(post-fix) 감소 연산자 II
package step04_Operators;

public class Exam06_5 {
    public static void main(String[] args) {
        int i = 2; 
        int result = i++ + i++ * i++;

        // 연산자 우선순위 : 
        // 1) ++, --
        // 2) *, /, %
        // 3) +, -
        // 4) -

        // int result = 2 + 3 * 4
        // int result = 2 + 12
        // int result = 14
        
        System.out.printf("%d, %d\n", i, result);
    }
}