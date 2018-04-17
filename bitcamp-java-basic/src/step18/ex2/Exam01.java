// 클래스 정보 추출 - 클래스 이름 알아내기
package step18.ex2;

public class Exam01 {

    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("java.lang.String");
        
        System.out.println(clazz.getSimpleName()); // String
        System.out.println(clazz.getName()); // java.lang.String
        System.out.println(clazz.getCanonicalName()); // java.lang.String
        System.out.println(clazz.getTypeName()); // java.lang.String
        // getName : 경로를 포함한 모든것을 나타내 주는것
        // getCanonicalName :
//        Java 언어 스펙으로 정의 된 기본 클래스의 표준 이름을 리턴합니다. 
//        기본이되는 클래스가 표준 명을 가지지 않는 경우 (즉, 로컬 클래스 또는 익명 클래스의 경우, 또는 컴퍼넌트 형이 정규명을 가지지 않는 배열의 경우), null를 돌려줍니다.
        // getTypeName() :
        //  유형의 이름에 대한 유익한 문자열을 반환합니다.
    }

}
