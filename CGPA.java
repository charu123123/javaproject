package chapter1;

public class CGPA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int n=5;
     double m[]=new double[n];
     double g[]=new double[n];
     double cgpa,sum=0;
     m[0]=90;
     m[1]=85;
     m[2]=95;
     m[3]=80;
     m[4]=85;
     for(int i=0;i<n;i++) {
    	 g[i]=(m[i]/10);
     }
     for(int i=0;i<n;i++) {
    	 sum+=g[i];
     }
      cgpa=sum/n;
     System.out.println("cgpa"+cgpa);
     System.out.println("percentage from cgpa"+cgpa*9.5);
	}

}
