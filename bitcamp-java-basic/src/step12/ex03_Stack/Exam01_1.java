// Static 구현과 사용
package step12.ex03_Stack;

import step12.ex02_LinkedList.LinkedList;

public class Exam01_1 {
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
        while((value = (String) stack.pop()) != null) {
            System.out.println(value);
        }

    }
    static void print(LinkedList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }

}
