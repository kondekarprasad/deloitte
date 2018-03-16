package practice;

import java.util.Scanner;

public class Loop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a digit:");
		int i=scanner.nextInt();
		for(int j=i;j>0;j--){
			for (int j2 = j; j2 >0; j2--) {
				System.out.print(j2);
				
			}
			System.out.println();
		}
	}

}
/*
 
  
10987654321
987654321
87654321
7654321
654321
54321
4321
321
21
1

 
 */




