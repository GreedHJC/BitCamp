package bitcamp.java106.pms;

public class Test {
    public static void main(String[] args) {
        String str = "/board/add?title=aaaa&content=bbb";
        String[] arr = str.split("\\?");
        for(String item : arr) {
            System.out.println(item);
        }
    }
}
