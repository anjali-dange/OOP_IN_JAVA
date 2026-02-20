package anjali;
// abstract class
abstract class Abstraction {
    abstract void add();
    void fun() {
        System.out.println("hiii");
    }
    static void m1() {
        System.out.println("hello");
    }
}
// child class
class Child extends Abstraction {
    @Override
    void add() {
        System.out.println("here you give body to the abstract method");
    }
}
// main class
public class TestAbstraction {
    public static void main(String[] args) {
        Abstraction obj = new Child();  // upcasting
        obj.add();   // calls child method
        obj.fun();   // calls parent method
        Abstraction.m1(); // calls static method
    }
}

