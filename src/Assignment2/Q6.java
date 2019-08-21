package Assignment2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

	    ArrayList<Integer> list1 = getNumbers("list1", input);
	    ArrayList<Integer> list2 = getNumbers("list2", input);
	    ArrayList<Integer> union = union(list1, list2);

	    System.out.print("The combined list is ");
	    displayList(union);
	  }

	  public static ArrayList<Integer> union(ArrayList<Integer> list1,
	    ArrayList<Integer> list2) {
	    ArrayList<Integer> union = new ArrayList<>();
	    union.addAll(list1);
	    union.addAll(list2);
	    return union;
	  }

	  public static ArrayList<Integer> getNumbers(String name, Scanner input) {
	    System.out.print("Enter five integers for " + name + ": ");
	    ArrayList<Integer> list = new ArrayList<>();
	    for (int i = 0; i < 5; i++) {
	      list.add(input.nextInt());
	    }
	    return list;
	  }

	  public static void displayList(ArrayList<Integer> list) {
	    for (int i = 0; i < list.size(); i++) {
	      System.out.print(list.get(i) + " ");
	    }
	    System.out.println();
	}

}
