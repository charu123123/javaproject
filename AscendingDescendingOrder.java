package chapter1;

import java.util.Arrays;

public class AscendingDescendingOrder {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	int[]array=new int[] {90,23,5,109,12,22,67,34};
	Arrays.sort(array);
	System.out.println("Elements of array in ascending order:");
	for(int i=0;i<array.length;i++)
	{
		System.out.println(array[i]);
	}
	Arrays.sort(array);
	System.out.println("element of arrat sorted in descending order:");
    for(int i=array.length-1;i>=0;i--)
    	System.out.println(array[i]);

		}

}

	


