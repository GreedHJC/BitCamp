// 클래스 사용 - improt II
package step03;

// 구체적으로 클래스 이름을 지정하지 않고 패키지명 다음에 wildcard(*)를 지정한다면,
// 그 패키지의 모든 클래스를 패키지명 없이 사용가능.

import step03.test.*;
import java.util.*;
import java.lang.reflect.*;

public class Exam04_5{
    public static void main(String[] args){

        // 다른 패키지의 클래스 사용
        // => 패키지 이름을 항상 붙여야 한다. 그래야만 컴파일러가 해당클래스를 찾을 수 있다.
        
        step03.test.B v1;
        v1 = new step03.test.B();

        // 그런데 다른 패키지의 클래스를 사용할 때 마다 매번 위와 같이 패키지명을 적는다면 코드가 길어진다.
        // 해결책!
        // => 소스 파일 상단에 클래스의 패키지 정보를 미리 적어준다.
        // => import 패키지명.클래스명;
        B v2;
        v2 = new B();

        Method obj1;
        Calendar obj2;
    }


}
// 결론!
// - 가능한 import 문을 선언할 때 * 대신 구체적인 클래스명을 적어라!
// - 같은 패키지의 여러 클래스를 사용하더라도 귀찮지만 클래스명을 적어라!
// - Why?
//      소스 코드를 읽을 때 어떤 클래스가 어떤 패키지에 있는지 빠르게 파악할 수 있기 때문이다.
// * 를 사용하게 되면 어떤 패키지인지 바로 확인할 수 없다.
// 