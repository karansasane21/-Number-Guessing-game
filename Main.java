package nunuberguesspackege;



import java.util.Random;
import java.util.Scanner
;
public class GuesstheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("what is your name?");
		String name = scan.nextLine();
		
		System.out.println("well," + name +",I am thinking of a number between 1 and 100 !" );
		int myNumber =getRandomNumber(1, 100);
		
		for (int i=0; i<6; i++) {
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Take a guess");
			int yourGuess = scan2.nextInt();
			
			if (yourGuess == myNumber) {
				System.out.println("you guessed correctly!");
				break;		
			}
			else if (yourGuess < myNumber) {
				System.out.println("your guess is too low!");
				
			}
			else if(yourGuess > myNumber) {
				System.out.println("your guess is too high!");
			}
			 if (i >=5) {
				 System.out.println();
				 System.out.println("Nope. the number I was thinking of was" + myNumber + "!");
			 
				 
			 }
		}
		
	}
			
		
				
				
	
	
	
	public static int getRandomNumber(int min ,int max) {
		Random random = new Random ();
		return random.ints(min,max).findFirst().getAsInt();
		
	}

}
