// IoC 컨테이너 만들기 - 에노테이션을 사용하여 객체의 이름 지정하기
package step19_iocContainer.ex8_DependanciesInjection;

public class Exam14 {
    public Exam14() {
        System.out.println("===> Exam14()");
    }
    
    public static void main(String[] args) throws Exception {
        ApplicationContext9 iocContainer = new ApplicationContext9("step19.ex8");
        Car2 car2 = (Car2) iocContainer.getBean("step19.ex8.Car2");
        car2.move();
    }
}






