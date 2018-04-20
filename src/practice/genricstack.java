

import java.util.Stack;

public class genricstack<E> {
   Stack<E> stack = new Stack<E>();
   public void push(E obj) {
	   stack.push(obj);
		   	   }
   public E pop() {
	   E obj=stack.pop();
	   return obj ;
	}
	
}


class Output{
	public static void main(String[] args) {
		genricstack<String> genricstack = new genricstack<String>();
		genricstack.push("hello");
		System.out.println(genricstack.pop());
	}
	
}