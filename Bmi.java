import java.util.Scanner;

class Bmi{

	public static void main(String args[]){
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your weight in Kg");
		float w = scan.nextFloat();
		System.out.println("Enter your height in meters");
		float h = scan.nextFloat();

		float bmi = w/(h*h);
		System.out.println("Your BMI is "+bmi);
	
	}


}
