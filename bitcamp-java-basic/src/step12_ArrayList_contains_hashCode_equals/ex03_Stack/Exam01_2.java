// Static 구현과 사용
package step12_ArrayList_contains_hashCode_equals.ex03_Stack;

import java.util.Stack;
public class Exam01_2 {
    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("bbb");
        String s3 = new String("ccc");
        String s4 = new String("ddd");
        String s5 = new String("eee");
        int a= 3;
        int b= 3;

        Stack stack = new Stack();
        stack.push(s1);
        print(stack);
        stack.push(s2);
        print(stack);
        stack.push(s3);
        print(stack);

        System.out.println("== > " + stack.pop());        // ccc   
        print(stack);

        System.out.println("== > " + stack.pop());        // bbb
        print(stack);

        stack.push(s4);
        print(stack);
        stack.push(s5);
        print(stack);

        String value;
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }

    }
    static void print(Stack list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }

}
