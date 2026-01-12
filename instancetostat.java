//we can't directly access instance var to static method need to create obj
package anjali;
public class instancetostat {
int id=101;
	public static void main(String[] args) {
		instancetostat obj=new instancetostat();
		System.out.println(obj.id);
		//System.out.println(id);
	}
}
