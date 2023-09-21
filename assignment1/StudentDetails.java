package assignment1;

public class StudentDetails {
int rollno;
String name;
float percentage;
StudentDetails(int rollno,String name,float percentage)
{
	this.rollno=rollno;
	this.name=name;
	this.percentage=percentage;
}
public void display()
{
	System.out.println("student rollno.:"+rollno+""+"\nStudent name:"+name+""+"\npercentage"+percentage);
		System.out.println();
}
   public static void main(String[] args) {
		// TODO Auto-generated method stub

StudentDetails s1=new StudentDetails(10,"shweta",90);
StudentDetails s2=new StudentDetails(12,"charu",89);
StudentDetails s3=new StudentDetails(14,"kadambari",91);
StudentDetails s4=new StudentDetails(15,"toshita",94);
StudentDetails s5=new StudentDetails(11,"tejaswi",88);

s1.display();
s2.display();
s3.display();
s4.display();
s5.display();
	}

}
