import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String playAgain;

    do {
        System.out.print("Do you want to play craps? (y/n): ");
        playAgain = scanner.next();

        if (playAgain.equalsIgnoreCase("y")) {
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum: " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("Craps! You lose.");
            } else if (sum == 7 || sum == 11) {
                System.out.println("Natural! You win!");
            } else {
                int point = sum;
                System.out.println("Point is now " + point);

                boolean playing = true;
                while (playing) {
                    die1 = random.nextInt(6) + 1;
                    die2 = random.nextInt(6) + 1;
                    sum = die1 + die2;

                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Sum: " + sum);

                    if (sum == 7) {
                        System.out.println("Got a seven and lost.");
                        playing = false;
                    } else if (sum == point) {
                        System.out.println("Made point and won!");
                        playing = false;
                    } else {
                        System.out.println("Trying for point");
                    }
                }
            }
        }
    } while (playAgain.equalsIgnoreCase("y"));

    scanner.close();
    }
}