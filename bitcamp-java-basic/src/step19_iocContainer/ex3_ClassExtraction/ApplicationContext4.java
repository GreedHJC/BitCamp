// 중첩 클래스를 제외한 .class 파일만 추출한다.
package step19_iocContainer.ex3_ClassExtraction;

import java.io.File;
import java.io.FileFilter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class ApplicationContext4 {
    private ArrayList<File> list = new ArrayList<>();
    
    public ApplicationContext4(String packageName) {
        String path = packageName.replace(".", "/");            //.을 /로 바꾸는것
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();       //클래스 파일 전체를 한곳으로 모으는것
        URL url = classLoader.getResource(path);                //국제 경로로
        File dir = new File(url.getPath());                     // 경로를 로컬 경로에 맞게 수정
        if (!dir.isDirectory())                                 // 만약 디렉토리가 아니면 되돌아가고 디렉토리면 파일찾기 실행
            return;
        findFiles(dir);
    }
    
    private void findFiles(File dir) {
        File[] files = dir.listFiles(new FileFilter() {
            public boolean accept(File pathname) {
                if (pathname.isDirectory() || // 디렉토리 이거나
                        (pathname.getName().endsWith(".class") && // .class 파일인 경우 
                        !pathname.getName().contains("$"))) { // 단 중첩클래스는 제외
                    return true;
                }
                return false;
            }
        });
        for (File f : files) {
            if (f.isDirectory()) {
                findFiles(f);
            } else {
                this.list.add(f);
            }
        }
    }
    
    public List<File> getFiles() {
        return this.list;
    }
}




