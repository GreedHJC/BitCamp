// 배열 - 같은 종류의 메모리를 쉽게 만드는 방법
package step02;

public class Exam09_1 {
    public static void main(String[] args) {
        
        //배열 선언
        int[] arr1 = new int[5]; 
        int arr2[]  = new int[5];   //C-style

        //배열 메모리에 접근
        arr1[1] = 100;
        arr1[2] = 100;
        arr1[3] = 100;
        arr1[4] = 100;

        // 유효하지 않은 인덱스를 지정한다면?
        arr1[5] = 600;  // 컴파일 할때는 인덱스가 유효한지 알 수 없다. 실행할때 오류가 발생.
    }
}

// 배열?
// - 같은 종류의 메모리를 쉽게 만드는 ㅂ아법
// - 문법
//      메모리종류[] 메모리이름 = new 메모리종류[개수]
//      data_type[] 변수명     = new data_type[num]
//      ex ) int[] arr = new int[5];

// 배열 메모리에 접근
// - 문법
//  배열변수[인덱스] = 값;
// - 배열의 인덱스는 0부터 시작한다.
// - 따라서 인덱스의 범위는 0 ~ (배열개수 -1) 이다.
// 
