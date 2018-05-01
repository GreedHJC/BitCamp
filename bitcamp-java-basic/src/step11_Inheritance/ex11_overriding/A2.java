package step11_Inheritance.ex11_overriding;

public class A2 extends A {
    int age;
    
    void print2() {
        System.out.printf("'%s(%d)'님 반갑습니다!\n", this.name, this.age);
    }
}
