import java.util.Scanner;
class Leap{

	public static void main(String[] arg){
	
		Scanner scan = new Scanner(System.in);
		int val = scan.nextInt();

		if(val==365 || val==366){
			if(val==366)
				System.out.println("Year is a leap Year");
			else
				System.out.println("Year is a Regular Year");
		}else
			System.out.println("Wrong input");
			
		
		
	
	}


}
