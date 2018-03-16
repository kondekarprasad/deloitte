package practice;

public class Loop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println();
			for (int j = 0; j < i; j++) {
				System.out.print(j);
			}
			
		}

	}

}
/*

0
01
012
0123
01234
012345
0123456
01234567
012345678

*/