

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("vijay");
		al.add("Ajay");
		
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Hanumat");
		
		al2.removeAll(al2);
		System.out.println("Hard work is key to success");
		Iterator iterator=al.iterator();
		while (iterator.hasNext()) 
		{
			System.out.println(iterator.next());
			
		}

	}

}
