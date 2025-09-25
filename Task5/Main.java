import java.util.ArrayList;

class Main {
	
	public static void main (String[] args){


		ArrayList<String>actions = new ArrayList<>();
			actions.add("1) Start game");
			actions.add("2) Resume game");
			actions.add("3) Pause game");
			actions.add("4) End game"); 

	

		GameMenu games = new GameMenu(actions);

	
		//games.displayMenu();
		
		String userChoice = games.promptUser();
		
		int choice = Integer.parseInt(userChoice);

		doAction(choice);

		

		}

		public static void doAction(int action){
			switch (action){
			case 1:
				System.out.println("Starter spillet nu");
				break;
			case 2:
				System.out.println("Henter tidligere gemte spildata");
				break;
			case 3:
				System.out.println("Spillet er sat på pause");
				break;
			case 4:
				System.out.println("Slutspil");
				break;
			default:
				System.out.println("Start program again");

			}
	}
}