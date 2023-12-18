import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    static int game(char you, char computer) {
        if (you == computer)
            return -1;

        if ((you == 's' && computer == 'p') || (you == 'p' && computer == 'z') || (you == 'z' && computer == 's'))
            return 0;
        else
            return 1;
    }

    public void playRockPaperScissors() {
        int n;
        char you, computer;
        int result;

        Random random = new Random();
        n = random.nextInt(100);

        if (n < 33)
            computer = 's';
        else if (n > 33 && n < 66)
            computer = 'p';
        else
            computer = 'z';

        System.out.println("\n\n\n\n\t\t\t\tEnter s for STONE, p for PAPER, and z for SCISSOR\n\t\t\t\t\t\t\t");

        Scanner scanner = new Scanner(System.in);
        you = scanner.next().charAt(0);

        result = game(you, computer);

        if (result == -1) {
            System.out.println("\n\n\t\t\t\tGame Draw!\n");
        } else if (result == 1) {
            System.out.println("\n\n\t\t\t\tWow! You have won the game!\n");
        } else {
            System.out.println("\n\n\t\t\t\tOh! You have lost the game!\n");
        }
        System.out.println("\t\t\t\tYou choose : " + you + " and Computer choose : " + computer + "\n");
    }
}
