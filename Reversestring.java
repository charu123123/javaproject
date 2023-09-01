package chapter1;

public class Reversestring {


		public static void main(String[] args) {
				// TODO Auto-generated method stub
		      String original,reverse="";
		      Scanner in=new Scanner();
		      System.out.println("Enter a String to reverse");
		     original=in.nextLine();
		      int length=original.length();
		      for(int i=length-1;i>0;i--)
		    	  reverse=reverse+original.charAt(i);
		      System.out.println("Reverse of the String:"+reverse);
		    		  
			}

		
	}

