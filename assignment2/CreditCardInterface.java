package assignment2;


	import java.io.*;
	interface CreditCardInterface
	{
	 abstract void viewCreditAmount();
	 abstract void useCard(int n);
	 abstract void payCredit(int n);
	 abstract void increaseLimit(int m); 
	}
	class SilverCC implements CreditCardInterface
	{
	 String name;
	 String no;
	 
	 int Cno;
	 int creditAmt=0;
	  int cLimit;
	 SilverCC(int l)
	 {
	  cLimit = l;
	 }
	 void set(String n,String name)
	 {
	  if(n.length()==16)
	  {
	   this.no=n;
	   this.name=name;
	  }
	  else
	  {
	   System.out.println("Wrong no ");
	   System.exit(0);
	  }
	 }
	 void show()
	 {
	  System.out.println("Name is "+this.name);
	  System.out.println("No is "+this.no);
	  viewCreditAmount();
	 }
	 public void viewCreditAmount()
	 {
	  
	  System.out.println("Credit Amount is " + this.creditAmt);
	 }
	 public void useCard(int add)
	 {
	  creditAmt+=add;
	  if(creditAmt>cLimit)
	  {
	   System.out.println("Cant be added... more than Credit limit");
	   creditAmt-=add;
	  }
	  else
	   viewCreditAmount();
	 }

	 public void payCredit(int add)
	 {
	  if(add>creditAmt)
	   System.out.println("no enough credit");
	  else
	  {
	  creditAmt-=add;
	  if(creditAmt<0)
	   creditAmt=0;
	  viewCreditAmount();
	  }
	 }
	 public void increaseLimit( int m)
	 {
	 }

	}
	class GoldCC extends SilverCC
	{
	 static int n;
	 GoldCC(int l)
	 {
	  super(l);
	 }
	 
	 void set(String n,String name1)
	 {
	  super.set(n, name1);
	  
	 }
	 void show()
	 {
	  super.show();
	  
	 }
	 public void viewCreditAmount()
	 {
	  super.viewCreditAmount();
	  
	 }
	 public void useCard(int add)
	 {
	  super.useCard(add);
	  
	 }

	 public void payCredit(int add)
	 {
	  super.payCredit(add);
	  
	 }
	 public void increaseLimit(int amt)
	 {
	  
	  while(n<3)
	  {
	   if(amt<5000)
	   {
	    this.cLimit=this.cLimit+amt;
	    System.out.println("new credit limit is :"+cLimit);
	   }
	   else
	    System.out.println("Cant be more than 5000");
	   n++;
	  }
	  
	  
	 }
	 public static void main(String a[]) throws IOException 
	 {

	  
	  BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
	  System.out.println("Enter no of objects :");
	  int r= Integer.parseInt(br.readLine());
	  SilverCC g[]=new SilverCC[r];  
	  for(int i=0;i<r;i++)
	  {
	   
	   System.out.println("Enter type of card (S or G)");
	   String ch=br.readLine();
	   if(ch.equals("S"))
	   {
	    g[i] =new SilverCC(50000);
	    System.out.println("Enter name :");
	    String name= br.readLine();
	    System.out.println("Enter no :");
	    String n= br.readLine();
	    g[i].set(n,name);
	    g[i].viewCreditAmount();
	    System.out.println("Enter amount to add");
	    int n1 = Integer.parseInt(br.readLine());
	    g[i].useCard(n1);
	    System.out.println("Enter amount to remove");
	    int n2 = Integer.parseInt(br.readLine());
	    g[i].payCredit(n2);
	    g[i].show();
	    
	   }
	   else
	   {
	    if(ch.equals("G"))
	    {
	     g[i] =new GoldCC(100000);
	     System.out.println("Enter name :");
	     String name= br.readLine();
	     System.out.println("Enter no :");
	     String n=br.readLine();
	     g[i].set(n,name);
	     g[i].viewCreditAmount();
	     System.out.println("Enter amount to add");
	     int n3 = Integer.parseInt(br.readLine());
	     g[i].useCard(n3);
	     System.out.println("Enter amount to remove");
	     int n4 = Integer.parseInt(br.readLine());
	     g[i].payCredit(n4);
	     System.out.println("Enter amount to increase credit Limit :");
	     int n5 = Integer.parseInt(br.readLine());
	     g[i].increaseLimit(n5);
	     g[i].show();
	    }
	   }
	  }
	 }
	}
	   
	  
	 
	

	