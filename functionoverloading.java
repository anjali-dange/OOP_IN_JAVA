//function overloading
package anjali;
class Polymorphism {
    // add two numbers
    int add(int a, int b) {
        return a + b;
    }
    // add three numbers
    int add(int a, int b, int c) {
        return a + b + c;
    }
    // add two decimal numbers
    double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
      Polymorphism c = new Polymorphism();
        System.out.println(c.add(10, 20));         //  add(int, int)
        System.out.println(c.add(10, 20, 30));     // add(int, int, int)
        System.out.println(c.add(5.5, 2.5));       //add(double,double)
    }
}
