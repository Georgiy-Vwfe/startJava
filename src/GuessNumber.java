import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String quit = "no";
        int findNumber;
        int enteredNumber;

        Player player1 = new Player();
        Player player2 = new Player();
        player1.name();
        player2.name();

        int parity = 0;

        findNumber = random.nextInt(100);
        while (quit.equals("no")) {
            if (parity % 2 == 0) {
                System.out.println("Your turn, " + player1.getPlayer());
                parity++;
            } else {
                System.out.println("Your turn, " + player2.getPlayer());
                parity++;
            }
            System.out.print("Enter num: ");
            enteredNumber = scanner.nextInt();

            if (enteredNumber == findNumber) {
                System.out.println("Entered num = hidden num");
                System.out.print("Do you want quit?\n" + "Type yes or no: ");
                scanner.nextLine();
                quit = scanner.nextLine();
            } else if (enteredNumber > findNumber) {
                System.out.println("Entered num > hidden num");
            } else if (enteredNumber < findNumber) {
                System.out.println("Entered num < hidden num");
            }

        }
    }

}
