//인스턴스 변수

package step08_Instance;
public class Exam01_3 {
static class A{ 
    //클래스 변수
    // => 클래스로 로딩하는 순간 자동으로 생성된다.
    // 클래스 이름을 사용한다고 해서 " 클래스에 소속된 변수" , 클래스 변수"라 부른다.
    //=> static이 붙은 변수이기 때문에 " 스태틱 변수"라고도 부른다.
    // => "Method Area" 영역에 존재한다
    static int v1;
    static boolean v2;
}


    public static void main(String[] args) {
       
        // 클래스 변수 사용법
        // 클래스명.스태틱변수명 값;
        // 클래스를 사용하는 순간 클래스가 로딩되고, 스태틱 변수는 자동 생성된다.
        A.v1 = 100;
        A.v2 = true;
        
        System.out.printf("%d %b\n", A.v1,A.v2);
    }

}

// 클래스 변수는 클래스가 로딩될때 딱 한 번 자동으로 생성되기 떄문에
// 각각 구분되는 개별 데이터를 저장할 수 없다.
// 왜?  변수가 한 개이다.