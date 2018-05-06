import java.util.Scanner;

public class Player {

    String name(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print your name, Player: ");
        String player = scanner.nextLine();
        return player;
    }

}
