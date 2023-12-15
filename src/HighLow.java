import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        game();
    }

    public static int random() {
        return (int) (Math.floor(Math.random() * 100) + 1);
    }

    public static void game() {
        Scanner sc = new Scanner(System.in);
        boolean next = true;
        byte chance = 10;
        int num = random();
        do {
            if (chance == 0) {
                System.out.println("Too Many Guesses");
                System.out.println("Would you like to play again? (y/N)");
                String again = sc.next();
                if (again.equalsIgnoreCase("y")) {
                    System.out.println("Time for another round");
                    game();
                } else {
                    break;
                }
            }
            System.out.printf("I have a number between 1 and 100 what is it? " +
                    "You have %d chances to get it correct%n", chance);
            int guess = sc.nextInt();
            if (guess < num && chance >= 1) {
                System.out.println("HIGHER");
                chance--;
                continue;
            }
            if (guess > num && chance >= 1) {
                System.out.println("LOWER");
                chance--;
                continue;
            }
            if (guess == num) {
                System.out.println("GOOD GUESS");
                System.out.println("Would you like to play again? (y/N)");
                String again = sc.next();
                if (again.equalsIgnoreCase("y")) {
                    System.out.println("Time for another round");
                    game();
                } else {
                    next = false;
                }
            }
        }while (next);

    }
}
