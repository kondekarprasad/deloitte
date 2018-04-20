

public class MUltipleCatchBlock {
	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=300/0;
			
		} /*catch (Exception e) {
			
		}*/
		catch (ArithmeticException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("");
		}
		
	}

}
