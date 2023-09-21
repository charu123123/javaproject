package assignment1;

public class Employee {
int id;
String name;
float salary;
Employee(int empid,String empname,float sal)
{
	id=empid;
	name=empname;
	salary=sal;
}
public Employee() {
	// TODO Auto-generated constructor stub
}
public void display()
{
	System.out.println("employee name:"+name+""+"salary="+salary);
	System.out.println();
}

void max(Employee  obj[], float a )
{
	
	Employee b = new Employee();
	
	for(int i =0 ; i<obj.length; i++)
	{
		if (obj[i].salary > a)
		{
			b=obj[i];
		}
	}
	
	System.out.println(b.id);
	System.out.println(b.salary);
	System.out.println(b.name);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			Employee [] obj=new Employee [5];
			obj[0]=new Employee(111,"Rajesh",45000);
			obj[1]=new Employee(112,"kiara",355000);
			obj[2]=new Employee(113,"prisha",40000);
			
//			for(int i=0;i<=5;i++) {
//				obj[i].display();
//			}
//			
			
			float m =obj[0].salary;
			obj[3].max(obj, m);
			
		}

	}

}
