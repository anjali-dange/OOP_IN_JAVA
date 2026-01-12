package anjali;
public class Overriding {
    void m1() {
        System.out.println("we have a 1bhk");
        System.out.println("i have 1 friend");
        System.out.println("its very easy");
    }
    // static inner class
    static class Test extends Overriding {
        // overriding m1() method
        @Override
        void m1() {
            System.out.println("we have a 2bhk");
            System.out.println("i have 2 friends");
            System.out.println("its a piece of cake");
        }
    }
    public static void main(String[] args) {
        Test t = new Test();
        t.m1();  
        // calls overridden method
    }
}