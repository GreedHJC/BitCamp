// JDBC 프로그래밍 개요 - JDBC 드라이버 준비
package step25_JDBCProgramming_Mybatis.ex1_Drive_DBMS_SQL;

import java.sql.DriverManager;

// JDBC 드라이버 다운로드 및 설정
// 1) 직접 설정하기
// - java-basic/lib 폴더 생성
// - c:\Program Files (x86)\MySQL\Connector J x.x\mysql-connector-java-x.x.jar 복사
// - java-basic/lib 폴더에 붙여넣기
// - 컴파일과 실행할 때 .jar 파일을 사용할 수 있도록 CLASSPATH에 추가한다.
//   project 컨텍스트 메뉴/build path/configure build path.../Libraries/Add Jars...
//
public class Exam01_3 {

    public static void main(String[] args) throws Exception {
        // 1) JDBC 드라이버 로딩 
        // => MySQL 최근 드라이버는 인스턴스를 생성하면 자동으로 DriverManager에 등록된다.
        new com.mysql.cj.jdbc.Driver();
        
        // DriverManager에 자동 등록된 것을 확인해보자!
        java.sql.Driver driver = DriverManager.getDriver("jdbc:mysql:");
        System.out.println("JDBC 드라이버 로딩 및 등록 완료!");
        // 해당 드라이버가 등록되지 않았으면 예외가 발생할 것이다.
        
        // 등록되지 않은 드라이버를 요구해봐라! 예외가 발생할 것이다.
        //driver = DriverManager.getDriver("jdbc:oracle:"); // 예외 발생!
    }
}







