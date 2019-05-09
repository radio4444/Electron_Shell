import java.util.Scanner;

public class Electron_Shell {
	public static void main (String args[]) {
		System.out.println("Welcome! This is a Electron shell");
		System.out.println("In this program, the user would enter one of the shells: K,L,M,N,O,P,Q;" +
				"and learn how many of electrons in 'X'(which is the user's input) shell hold.");
		System.out.print("Enter one of the shells letter: K,L,M,N,O,P,Q : ");
		Scanner input = new Scanner(System.in);
		String shellChoice = input.nextLine();
		if(shellChoice.equalsIgnoreCase("k")){
			System.out.println("K can hold 2 electrons (k=2)");
			System.out.println("Now, re-run the program to learn how many electrons other shell can hold.");
		}
		else if(shellChoice.equalsIgnoreCase("l")){
			System.out.println("L can hold 8 electrons (l=8)");
			System.out.println("Now, re-run the program to learn how many electrons other shell can hold.");
		}
		else if(shellChoice.equalsIgnoreCase("m")){
			System.out.println("M can hold 18 electrons (m=18)");
			System.out.println("Now, re-run the program to learn how many electrons other shell can hold.");
		}
		else if(shellChoice.equalsIgnoreCase("n")){
			System.out.println("N can hold 32 electrons (n=32)");
			System.out.println("Now, re-run the program to learn how many electrons other shell can hold.");
		}
		else if(shellChoice.equalsIgnoreCase("o")){
			System.out.println("O can hold 50 electrons (o=50)");
			System.out.println("Now, re-run the program to learn how many electrons other shell can hold.");
		}
		else if(shellChoice.equalsIgnoreCase("p")){
			System.out.println("P can hold 72 shell electron (p=72)");
			System.out.println("Now, re-run the program to learn how many electrons other shell can hold.");
		}
		else if(shellChoice.equalsIgnoreCase("q")){
			System.out.println("Q can hold 98 shell electron (q=98)");
			System.out.println("Now, re-run the program to learn how many electrons other shell can hold.");
		}
		else
			System.out.println("Error! Re-run the program to try again");
		
	}
}
