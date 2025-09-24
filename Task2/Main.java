import java.util.Scanner;

class Main{
	public static void main (String[] args){

		System.out.println("Please type your name");

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();

		System.out.println("Hello "+input+"\n Please type yout age");

		int age = scan.nextInt();

		System.out.println("You are "+age+" years old");
	}
}