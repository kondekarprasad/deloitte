

import java.util.Hashtable;

public class hashtable {
	public static void main(String[] args) {
		Hashtable hashtable = new Hashtable();
		hashtable.put("A",new Integer(3));
		hashtable.put("B", new Integer(2));
		hashtable.put("C", new Integer(8));
		hashtable.remove(new String("B"));
		System.out.println(hashtable);
	}

}
/*
 * 
 * {A=3, C=8}
 */
