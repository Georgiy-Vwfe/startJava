import java.util.Random;
import java.util.Scanner;

public class FindNumber {
    public static void main(String[] argc) {
        boolean quit = false;
        System.out.println("If you want exit Enter 101");
        while (quit != true) {
            Random random = new Random();
            Scanner scanner = new Scanner(System.in);
            int findNumber;
            int enteredNumber;
            findNumber = random.nextInt(100);
            System.out.print("Enter num: ");
            enteredNumber = scanner.nextInt();
            if (enteredNumber == 101) {
                quit = true;
            } else if (enteredNumber > findNumber) {
                System.out.println("Entered num > hidden num");
            } else if (enteredNumber < findNumber) {
                System.out.println("Entered num < hidden num");
            } else {
                System.out.println("Entered num = hidden num");
                quit = true;
            }

        }
    }
}
