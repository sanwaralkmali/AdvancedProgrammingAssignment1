package Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		   Scanner input = new Scanner(System.in);

		    MyStack s = new MyStack();
		    System.out.print("Enter five strings: ");
		    for (int i = 0; i < 5; i++) {
		        s.push(input.next());
		      }
		    
		    int size = s.getSize();

		    for (int i = 0; i < size; i++) {
		      System.out.println(s.pop());
		    }
		    
	}

}

class MyStack extends ArrayList<Object> {
	  public int getSize() {
	    return size();
	  }

	  public Object peek() {
	    return get(size() - 1);
	  }

	  public Object pop() {
	    Object o = get(size() - 1);
	    remove(size() - 1);
	    return o;
	  }

	  public void push(Object o) {
	    add(o);
	  }

	  @Override
	  public String toString() {
	    return "stack: " + toString();
	  }
	}
