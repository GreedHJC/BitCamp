package step11_Inheritance.ex16_Generalization;

public class Truck extends Car{
    @Override
    public void run() {
        System.out.println("덜컹덜컹 달린다.");
    }
    public void dump() {
        System.out.println("짐을 내린다.");
    }
    
}
