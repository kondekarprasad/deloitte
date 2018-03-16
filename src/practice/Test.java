package practice;

public class Test {
	int rollno;
	String name;

	public Test(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Test [rollno=" + rollno + ", name=" + name + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test test=new Test(102, "prasaad");
		Test test2=new Test(105, "chintu");
		System.out.println(test);
		System.out.println(test2);

	}

}
