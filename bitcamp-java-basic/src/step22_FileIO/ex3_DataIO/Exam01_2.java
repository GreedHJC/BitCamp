// 데이터 읽기 - int 값 읽기 
package step22_FileIO.ex3_DataIO;

import java.io.FileInputStream;

public class Exam01_2 {

    public static void main(String[] args) throws Exception {
        FileInputStream in = new FileInputStream("temp/test3.data");
        
        // Exam02_1을 실행하여 출력한 데이터를 read()로 읽는다. 
        // read()는 1바이트를 읽어 int 값으로 만든 후 리턴한다.
        int value = in.read(); 
        
        in.close();
        
        System.out.printf("%d\n", value);
        
        
    }
}






