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
        }while (j <= 100);
        byte k = 100;
        do {
            System.out.println(k);
            k -= 5;
        }while (k >= -10);
        int l = 2;
        do {
            System.out.println(l);
            l = (int) Math.pow(l, 2);
        }while (l < 1000000);

        for(byte m = 5; m <= 15; m++){
            System.out.println(m);
        }

        for(byte m = 0; m <= 100; m += 2) {
            System.out.println(m);
        }

        for(byte m = 100; m >= -10; m -= 5 ){
            System.out.println(m);
        }

        for(int m=2; m <=1000000; m = (int)Math.pow(m,2)){
            System.out.println(m);
        }

        for(byte m=1; m<=100; m++){
            if(m%3==0 && m%5==0){
                System.out.println("FizzBuzz");
            }else if(m%5==0){
                System.out.println("Buzz");
            }else if(m%3==0){
                System.out.println("Fizz");
            }else{
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
            for(int m=1; m<=userInput; m++){
                System.out.format("%d      | %d       | %d%n",m, (int)Math.pow(m,2), (int)Math.pow(m,3));
            }
            System.out.print("Would you like to play a game?  (y/N)");
            String confirm = scanner.next();
            if(confirm.equalsIgnoreCase("y")){
                more = true;
            }else {
                more = false;
            }

        }while(more);

    }
}
