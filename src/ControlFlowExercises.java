import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        byte i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }
        byte j = 0;
        do {
            System.out.println(j);
            j += 2;
        } while (j <= 100);
        byte k = 100;
        do {
            System.out.println(k);
            k -= 5;
        } while (k >= -10);
        int l = 2;
        do {
            System.out.println(l);
            l = (int) Math.pow(l, 2);
        } while (l < 1000000);

        for (byte m = 5; m <= 15; m++) {
            System.out.println(m);
        }

        for (byte m = 0; m <= 100; m += 2) {
            System.out.println(m);
        }

        for (byte m = 100; m >= -10; m -= 5) {
            System.out.println(m);
        }

        for (int m = 2; m <= 1000000; m = (int) Math.pow(m, 2)) {
            System.out.println(m);
        }

        for (byte m = 1; m <= 100; m++) {
            if (m % 3 == 0 && m % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (m % 5 == 0) {
                System.out.println("Buzz");
            } else if (m % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(m);
            }
        }
        Scanner scanner = new Scanner(System.in);
        boolean more;
        do {
            System.out.print("What number would you like to go up to?");
            int userInput = scanner.nextInt();
            System.out.println("number | squared | cubed");
            System.out.println("-------|---------|------");
            for (int m = 1; m <= userInput; m++) {
                System.out.format("%-7d| %-8d| %d%n", m, (int) Math.pow(m, 2), (int) Math.pow(m, 3));
            }
            System.out.print("Would you like to play a game?  (y/N)");
            String confirm = scanner.next();
            if (confirm.equalsIgnoreCase("y")) {
                more = true;
            } else {
                more = false;
            }

        } while (more);

        do {
            System.out.print("Please give me a round number between 0 and 100. ");
            int grade = scanner.nextInt();
            if (grade >= 98) {
                System.out.format("%d is an A+%n", grade);
            } else if (grade >= 90) {
                System.out.printf("%d is an A%n", grade);
            } else if (grade >= 88) {
                System.out.printf("%d is an A-%n", grade);
            } else if (grade >= 86) {
                System.out.printf("%d is an B+%n", grade);
            } else if (grade >= 82) {
                System.out.printf("%d is a B%n", grade);
            } else if (grade >= 80) {
                System.out.printf("%d is a B-%n", grade);
            } else if (grade >= 78) {
                System.out.printf("%d is a C+%n", grade);
            } else if (grade >= 69) {
                System.out.printf("%d is a C%n", grade);
            } else if (grade >= 67) {
                System.out.printf("%d is a C-%n", grade);
            } else if (grade >= 65) {
                System.out.printf("%d is a D+%n", grade);
            } else if (grade >= 62) {
                System.out.printf("%d is a D%n", grade);
            } else if (grade >= 60) {
                System.out.printf("%d is a D-%n", grade);
            } else {
                System.out.println("that is an F");
            }
            System.out.print("Another grade? (y/N)");
            String confirm = scanner.next();
            if (confirm.equalsIgnoreCase("y")) {
                more = true;
            } else {
                more = false;
            }
        } while(more);

    }
}
