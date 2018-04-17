package step18.ex1;

class A {
    static int i;
    static void m() {i = 100;};
    static {
        System.out.println("A 클래스 로딩!");
    }
}