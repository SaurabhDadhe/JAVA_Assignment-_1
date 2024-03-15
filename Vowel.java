import java.util.Scanner;

class Vowel{
	public static void main(String arg[]){
		Scanner scan = new Scanner(System.in);
		String alp = scan.next();

		if(alp.equals("a") || alp.equals("e") || alp.equals("i") || alp.equals("o") || alp.equals("u"))
			System.out.println(alp+" Is a Vowel");
		else
			System.out.println(alp+" Is not Vowel");
	
	}
	



}
