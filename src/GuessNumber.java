import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    static void playGame() {
        String quit = "no";
        Scanner scanner = new Scanner(System.in);
        int findNumber;
        int enteredNumber;

        Player player1 = new Player();
        Player player2 = new Player();
        player1.name();
        player2.name();
        System.out.println("If you want quit, enter 101");
        int parity = 0;
        while (quit != "yes") {
            if (parity % 2 == 0) {
                System.out.println("Your turn," + player1);
                parity++;
            } else {
                System.out.println("Your turn," + player2);
                parity++;
            }
            Random random = new Random();
            findNumber = random.nextInt(10);
            System.out.print("Enter num: ");
            enteredNumber = scanner.nextInt();
            if (enteredNumber == 101) {
                quit = "yes";
            } else if (enteredNumber > findNumber) {
                System.out.println("Entered num > hidden num");
            } else if (enteredNumber < findNumber) {
                System.out.println("Entered num < hidden num");
            } else {
                System.out.println("Entered num = hidden num");
                System.out.print("Do you want quit?\n" + "Type yes or no: ");
                quit = scanner.nextLine();
            }

        }
    }

}
