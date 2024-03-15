import java.util.Scanner;

class Operator{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		//scan.next();
		String o= scan.next();
		Operator.op(a,b,o);

	
	}
	public static void op(int a,int b,String o){
	
		switch(o){
			case "+":
				System.out.println(a+b);
				break;
			case "-":
				System.out.println(a-b);
				break;
			case "/":
				System.out.println(a/b);
				break;
			case "*":
				System.out.println(a*b);
				break;
			defualt:
				System.out.println("Enter valid Operator");
		
		}
	}

}
