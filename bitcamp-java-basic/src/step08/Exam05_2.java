// 변수의 초기화 - 자동 초기화 문장
package step08;

public class Exam05_2{
	static class A{
		// 변수 선언과  동시에 값을 저장하는 것을 "변수 초기화 문장"이라 한다.
		// 변수 생성시 즉시 " 할당 연산자" 라고 한다.
		static int a = 100;
		int b = 200;
	}
	public static void main(String[] args) {
		int c = 300;
		
		System.out.println(A.a);
		A obj1 = new A();
		System.out.println(obj1.b);
		System.out.println(c);		//컴파일 오류!!
	}	
}