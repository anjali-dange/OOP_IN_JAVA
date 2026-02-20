//single level inheritance 
//here we have used nested static class i.e (everything in same program)
package anjali;
public class A {
    void m1() {
        System.out.println("parent method");
    }
    static class B extends A {
        void m2() {
            System.out.println("child method");
        }
        public static void main(String[] args) {
            B p1 = new B();
            p1.m1();
            p1.m2();
        }
    }
}