//heirachial inheritance
package anjali;
// Parent class
public class X {
    void parentMethod() {
        System.out.println("This is parent class X");
    }
}
// Child class 1
class Y extends X {
    void child1Method() {
        System.out.println("This is child class Y");
    }
}
// Child class 2
class Z extends X {
    void child2Method() {
        System.out.println("This is child class Z");
    }
    public static void main(String[] args) {
        // Object of Y
        Y obj1 = new Y();
        obj1.parentMethod();   // from X
        obj1.child1Method();   // from Y
        // Object of Z
        Z obj2 = new Z();
        obj2.parentMethod();   // from X
        obj2.child2Method();   // from Z
        
    }
}