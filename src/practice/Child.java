
class School{
	int a;

	public School(int a) {
		this.a = a;
	}
}
class PrimarySchool extends School{
	int b;

	public PrimarySchool(int a, int b) {
		super(a);
		this.b = b;
	}
	void show(){
		System.out.println("schools a"+a);
		System.out.println("PrimarySchool's b"+b);
	}
}
public class Child {
	public static void main(String[] args) {
		PrimarySchool obj= new PrimarySchool(7,8);
		obj.show();
		
	}
	
	

}
