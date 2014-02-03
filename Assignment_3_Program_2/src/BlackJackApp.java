//----------------------------------------
// The Entry Point for the BlackJackApp
//---------------------------------------
import java.util.Scanner;

public class BlackJackApp {
public static void main(String[] args) {
// TASK 1: CREATE THE GAME ENGINE
BlackJackEngine blackJack = new BlackJackEngine();

// TASK 2: ALLOW THE USER TO PLAY AS MANY TIMES AS THEY WANT.
for (int i = 1;; i++) {
System.out.println("\n\nB L A C K J A C K G A M E #" + i);
blackJack.playGame();
blackJack.callWinner();


Scanner in = new Scanner(System.in);
String another;
System.out.print("\nWould you like to play another game? Enter yes to continue. ");
another = in.nextLine();
if (!another.toLowerCase().equals("yes"))
break;
}
}
}