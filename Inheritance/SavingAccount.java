package Inheritance;
import java.io.*;


class  InsufficientFundsException extends Exception
{

}

 class SavingAccount
 {
   
    int acNo;
    String name;
    int bal;
  
  SavingAccount(int n,String na,int b)
 {
    this.acNo=n;  
    this.bal=b;
    this.name=na;
  }
  void viewCreditAmount()
  {
   

     System.out.println("Balance is:--"+this.bal);
   }
   
  void withdraw(int add)
  {
       try
      {
       bal-=add;
       if(bal<500)
      {
        bal+=add;
        throw new  InsufficientFundsException();

      }
      }
       catch(Exception e)
       {
        System.out.println("balance is not sufficient for withdraw operation");
       }

       viewCreditAmount();
 }
  
  void deposit(int add)
{  
  bal+=add;
  viewCreditAmount();
 }
  
  
  
   void show()

 {
  System.out.println("Name is:--"+this.name);
  System.out.println("No is:--"+this.acNo);

  viewCreditAmount();
 }
  public static void main(String args[])throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter no of objects:--");
    int r=Integer.parseInt(br.readLine());
    for(int i=0;i<r;i++)
   {
     
     System.out.println("Enter name:--");
     String name=br.readLine();
     System.out.println("Enter no:--");
     int n=Integer.parseInt(br.readLine());
     System.out.println("Enter Balance:--");

     try
   {
     
     int n1=Integer.parseInt(br.readLine());
     if(n1<500)
     {
     
       throw new InsufficientFundsException();
     }
    
     else
     {
       SavingAccount s=new SavingAccount(n,name,n1);
       System.out.println("Enter amount to deposite:--");
       int n5=Integer.parseInt(br.readLine());
       s.deposit(n5);
       System.out.println("\nEnter amount to withdraw:--");
       int n2=Integer.parseInt(br.readLine());
       s.withdraw(n2);
       s.show();
     }
   }
    catch(Exception e)
   {
    System.out.println("Balance is no sufficient:--");
   }
  }
 }
 }

