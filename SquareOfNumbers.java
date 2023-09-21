package assignment2;
import java.io.*;
import java.util.Scanner;
public class SquareOfNumbers {

	
		
	public static void main(String[] args) {
		int n,i;
		System.out.print("Enter the last number for square: ");
		Scanner Sc= new Scanner(System.in);

		
		n = Sc.nextInt();

		 
		for(i=1;i<=n;i++)
		{
			System.out.println("Square of " +i+" is : "+(i*i));     
		}
	    }
	
	}


