package July25.advanProg;

import java.util.ArrayList;

public class JULY25_IO_Generics {

	public static void main(String[] args) {


		// Why array is keeping their existing
		
		int [] arr = new int[5];
		arr[0]=1;
		arr[1]=1;
		arr[2]=1;
		arr[3]=1;
		arr[4]=1;
		
		//print array[0]
		//print array[arr.length-1]
	
		//both above operations take the same amount of time   why? 
		//because array elements are stored in memory with no gaps between
		
		//arrayList 
		//Linked list 
		
		//called ragged array which mean flexible size of more than 1 dem array 
		
		//
		int [][] arr3d = new int [5][];
		arr3d[0][0]=5;
		arr3d[0][1]=5;
		arr3d[0][2]=5;
		arr3d[0][3]=5;
		arr3d[0][4]=5;
		arr3d[1][0]=5;
		arr3d[1][1]=5;
		arr3d[1][2]=5;
		
		ArrayList myarrList = new ArrayList();
		ArrayList<String> myarrList2 = new ArrayList<>();
		
		myarrList.add(5);
		
		
		int s = (int) myarrList.get(0);
		
		
		
		
	}

}
