package chapter1;

public class Constructor {
	private String name;
	Constructor(){
	System.out.println("constructor called:");
	name="programiz";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructor obj=new Constructor();
System.out.println("This name is"+obj.name);
	}

}
