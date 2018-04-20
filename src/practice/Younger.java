

class Elder{
	private String string="i m elder";
	private void fun(){
		System.out.println("elder fun()");
	}
	

public class Younger extends Elder {
	private void fun(){
		System.out.println(getClass().getName()+"::accessing data of Elder:::" +string);
		}
	
	}
	 public static void main(String[] args) {
		
		 Elder elder = new Elder();
		 Younger younger=elder.new Younger();
		 younger.fun();
		 elder=younger;
		 elder.fun();
	}
}

/*
 * deloitte.Elder$Younger::accessing data of Elder:::i m elder
 * elder fun()
*/
