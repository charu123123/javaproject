package Inheritance;
 class AnimalSuperConstructor {
AnimalSuperConstructor(){System.out.println("animal is created");}
 }
 class Horse extends AnimalSuperConstructor{
	 Horse(){
		 super();
			 System.out.println("Horse is created");
			 
		 }
	 }
 class TestSuper3{
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Horse h=new Horse();

	}

}
