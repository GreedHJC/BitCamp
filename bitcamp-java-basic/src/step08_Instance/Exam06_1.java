// 초기화 블록 - 인스턴스 블록
package step08_Instance;

public class Exam06_1{
	static class A{
		int value;
		int a, b; 
		{	//아무 이름 없이 선언하는 블록이 "초기화 블록"이다.
			//인스턴스를 생성한 후, 생성자를 호출하기 전에 자동으로 실행한다.
			System.out.println("{}11111111111");
		}
		
		A(){
			System.out.println("A()");
		}
		
		{	// 초기화 블록은 여러개 정의 할수 있다.
			// 순서대로 호출한다.
			System.out.println("{}22222222222");
			// 초기화 블록을 굳이 나눠서 여러개 정의할 필요는 없다.
			// 할 수는 있지만 이렇게 하지 말라!
			// 만약 초기화 블록을 정의한다면 한 개만 하라!	
		}
	}
	
	public static void main(String[] args) {
		A obj1 = new A();	
	}
}