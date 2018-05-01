// 비트 이동 연산자 : >>, >>>, <<,
package step04_Operators;

public class Exam04_1{
    public static void main(String[] args) {

        int i = 1;
        System.out.println( i << 1);
        System.out.println( i << 2);
        System.out.println( i << 3);
        System.out.println( i << 4);
        

        // 왼쪽으로 이동 후 , 
        // 오른쪽 빈자리 : 0 으로 채운다.
        System.out.println(i << 1);
        // 왼쪽의 넘어간 비트 : 짜른다.
        
        i = 0b0000_1011; // 11
        System.out.println(i << 1);
        System.out.println(i << 2);
        System.out.println(i << 3);
        System.out.println(i << 29);

    }
}

// 왼쪽 이동
// -1 비트 이동은 곱하기 2한 것과 같은 효과를 준다