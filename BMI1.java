import java.util.Scanner;
class  BMI1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter w = ");
		double  w =sc.nextDouble();
		System.out.print("Enter h  = ");
		double h = sc.nextDouble()/100;
		System.out.print("Enter bmi = ");
	    double bmi = w / (h*h);
		System.out.println(bmi);
	  
  }
}
