//static method can't access instance variables directly
//instatnce method can access static variable directly
package anjali;
public class staictoinstance {
static int count=10;
int id=101;
	
void display() {  // instance method
    System.out.println("Instance variable: " + id);   // access instance var
    System.out.println("Static variable: " + count);  // access static var
}

	public static void main(String arg[]) {
		staictoinstance s1=new staictoinstance();
		s1.display();
		//s2.display();
	}
}
