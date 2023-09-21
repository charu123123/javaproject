package assignment1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyNumber {
int a;
MyNumber()
{
	a=0;
}
MyNumber(int b)
{
	this.a=b;
}
boolean ispositive(int b)
{
	if(b>0)
		return true;
	else
		return false;
}
boolean isnegative(int b)
{
	if(b<0)
		return true;
	else
		return false;
}
boolean iseven(int b)
{
	if(b%2==0)
		return true;
	else
		return false;
}
boolean isodd(int b)
{
	if(b%2!=0)
		return true;
	else
		return false;
}
boolean iszero(int b)
{
	if(b==0)
		return true;
	else
		return false;
}


	public static void main(String[] args) throws NumberFormatException,IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("a=0");
		System.out.println("enter a number:");
		int b=Integer.parseInt(br.readLine());
		MyNumber m=new MyNumber();
		if(m.isodd(b))
			System.out.println("Odd");
		if(m.iseven(b))
			System.out.println("Even");
		if(m.ispositive(b))
			System.out.println("ispositive");
		if(m.isnegative(b))
			System.out.println("isnegative");
		if(m.iszero(b))
			System.out.println("iszero");
		
		// TODO Auto-generated method stub

	}

}
