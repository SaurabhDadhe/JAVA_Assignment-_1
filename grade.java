import java.util.Scanner;
class Grade{

	public static void main(String[] arg){
	
		Scanner scan = new Scanner(System.in);

		int val = scan.nextInt();

		if(val>=75)
			System.out.println("Your grade is A+");
		else if(val<75 && val>=60)
                        System.out.println("Your grade is A");
		else if(val<60 && val>=50)
                        System.out.println("Your grade is B");
		else if (val<50 && val>=40)
			System.out.println("Your grade is C");
		else
			System.out.println("Your grade is F");

	
	
	}
		

}
