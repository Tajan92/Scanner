import java.util.ArrayList;
import java.util.Scanner;

class GameMenu{
	private ArrayList<String>actions; 

	public GameMenu (ArrayList<String>actions){
		this.actions=new ArrayList<>(actions);
	}

	public void displayMenu (){
		for (int i = 0 ; i<actions.size() ; i++){
		System.out.println((i+1)+": "+actions.get(i));
		}
	}
	public String promptUser(){
		System.out.println("Skriv et tal for at vælge handling");
		this.displayMenu();
		Scanner scan = new Scanner(System.in);
		String choice = scan.nextLine();
		return choice;

	}
}