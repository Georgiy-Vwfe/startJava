import java.util.Random;
import java.util.Scanner;

public class FindNumber {
    public static void main(String[] argc) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int findNum;
        int enteredNum;
        findNum = random.nextInt(100);

        System.out.print("Enter num");
        enteredNum = scanner.nextInt();
        if (enteredNum > findNum) {
            System.out.print("Entered num > hidden num");
        } else if (enteredNum < findNum) {
            System.out.print("Entered num < hidden num");
        } else {
            System.out.print("Entered num = hidden num");
        }

    }
}
