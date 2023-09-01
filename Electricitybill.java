package chapter1;

public class Electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int units=390;
double billToPay=0;
if (units<100)
{
	billToPay=units*1.20;
}
else if(units<300) {
	billToPay=100*1.20+(units-100)*2;
}
else if(units>300)
{
	billToPay=100*1.20+200*2+(units-300)*3;
}
System.out.println("the electricity bill for"+units+"is:"+billToPay);
	}

}
