abstract class PCU {

    abstract void method3();
    void method4() {
        System.out.println("We are in Abstract Class");
    }
}

public class Employee {

    public static void main(String[] args) {

        PCU p = new B();
        p.method3();
        p.method4();
    }
}
class B extends PCU {
    void method2() {
        System.out.println("We are in child class");
    }
    @Override
    void method3() {
        System.out.println("Overriding from abstract class");
    }
}
