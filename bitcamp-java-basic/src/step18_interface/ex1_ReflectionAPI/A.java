package step18_interface.ex1_ReflectionAPI;

class A {
    static int i;
    static void m() {i = 100;};
    static {
        System.out.println("A 클래스 로딩!");
    }
}