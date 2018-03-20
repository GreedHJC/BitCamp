// 파라미터를 받는 생성자
package step08;

public class Exam04_3{

	// Exam04_1 클래스 조차도 기본 생성자가 자동으로 추가된다.
	// 즉 다음의 생성자를 컴파일러가 자동으로 붙일 것이다.
	// Exam04_1() {}
	static class Score{
		String name;
		int kor;
		int eng;
		int math;
		int sum;
		float average;

		// 생성자
		// => 클래스 이름과 같은 이름으로 메서드를 만든다.
		// => 리턴 타입을 선언하지 않는다. 즉 값을 리턴하지 않는다.
		// => 인스턴스를 만들 때 자동 생성 된다. 일반 메소드 처럼 나중에 따로 호출할 수 없다.
		// => 만약 개발자가 생성자를 만들지 않으면 컴파일러가 기본 생성자를 자동으로 생성해 준다.
		//		모든 클래스는 반드시 한 개 이상의 생성자가 있다.
		// => 보통 인스턴스를 만든 후에 인스턴스 변수를 초기화시키는 용도로 사용한다.
		// => 다음과 파라미터가 없는 생성자가 기본 생성자이다.

		Score(){
			System.out.println("Score()");
		}
		Score(String name){
			System.out.println("Score(String )");
			this.name = name;
		}
				
		Score(String name, int kor , int eng, int math){
			System.out.printf(" Score(String, int, int, int) 호출! \n");
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
			this.compute();
		}


		public void compute() {
			this.sum = this.kor +this.eng + this.math;
			this.average = this.sum / 3f;
		}
	}

	public static void main(String[] args) {

		//생성자가 여러개 일 때 파라미터에 전달하는 값으로 구분한다.
		
		Score s1 = new Score();
		Score s2 = new Score("유관순");
		Score s3 = new Score("임꺽정",80,88,87);

		// 생성자에서 이미 계산을 수행했기 때문에 합계와 평균을 계싼하기 위해 따로 compute()를 호출할 필요가 없다.
		// 이것이 생성자를 사용하는 이유이다.
		System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s1.name, s1.kor, s1.eng, s1.math, s1.sum, s1.average);

		System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s2.name, s2.kor, s2.eng, s2.math, s2.sum, s2.average);

		System.out.printf("%s, %d, %d, %d, %d, %.1f\n", s3.name, s3.kor, s3.eng, s3.math, s3.sum, s3.average);

	}

}

// 생성자?
// => 인스턴스(객체)를 생성한 후에 사용하기 전에 유효한 값으로 초기화시켜 작업을 수행한다.
