//all types of constructors
package anjali;
class CONSTRUCTORS {
    int id;
    String name;
    //  Default constructor
    CONSTRUCTORS() {
        id = 0;
        name = "No Name";
        System.out.println("Default constructor called");
    }
    // 2️ Parameterized constructor
    CONSTRUCTORS(int i, String n) {
        id = i;
        name = n;
        System.out.println("Parameterized constructor called");
    }
    // 3️ Copy constructor
    CONSTRUCTORS(CONSTRUCTORS s) {
        id = s.id;
        name = s.name;
        System.out.println("Copy constructor called");
    }
    void show() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
    public static void main(String[] args) {
        // Using Default constructor
        CONSTRUCTORS s1 = new CONSTRUCTORS();
        s1.show();
        // Using Parameterized constructor
        CONSTRUCTORS s2 = new CONSTRUCTORS(101, "Anu");
        s2.show();
        // Using Copy constructor
        CONSTRUCTORS s3 = new CONSTRUCTORS(s2);
        s3.show();
        //calling without methods
        System.out.println(s3.name);
        System.out.println(s3.id);
    }
}
