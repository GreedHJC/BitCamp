//클래스 변수와 인스턴스 변수 응용

package step08;
public class Exam01_5 {
    static class Student{ 
        // 모든 인스턴스가 공유하는 값은 클래스변수로 선언한다.
        static int count;
        
        //인스턴스마다 개별적으로 관리해야할 값은 인스턴스 변수에 저장한다.
        String name;
        int age;
    }


    public static void main(String[] args) {
        Student.count = 0;
        
        Student s1= new Student();
        s1.name = "홍길동";
        s1.age = 10;
        Student.count++;
        
        Student s2= new Student();
        s2.name = "임꺽정";
        s2.age = 20;
        Student.count++;
        
        Student s3= new Student();
        s3.name = "유관순";
        s3.age = 30;
        Student.count++;
        
        // 인스턴스 주소를 통해 클래스 변수를 사용할 수 있다.
        // => 인스턴스에 count라는 변수가 없으면 클래스에서 찾기 때문이다.
        // => 하지만 이렇게 사용하지 마라!! 왜??? 다른 개발자가 이 코드를 봤을때, count가 인스턴스 변수라고 착각할 것이다.
        // "클래스 변수는 클래스 이름을 사용하여 접근하라!"
        System.out.printf("s1 = %d, %s %d\n",Student.count, s1.name, s1.age);
        System.out.printf("s2 = %d, %s %d\n",Student.count, s2.name, s2.age);
        System.out.printf("s3 = %d, %s %d\n",Student.count, s3.name, s3.age);

    }

}

// 클래스 변수는 클래스가 로딩될때 딱 한 번 자동으로 생성되기 떄문에
// 각각 구분되는 개별 데이터를 저장할 수 없다.
// 왜?  변수가 한 개이다.