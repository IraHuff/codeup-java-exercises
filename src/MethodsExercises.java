import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pick a integer");
        int a = sc.nextInt();
        System.out.println("and a second integer");
        int b = sc.nextInt();
        System.out.println("the numbers added " + Addition(a, b));
        System.out.println("the numbers subtracted " + Subtraction(a, b));
        System.out.println("the numbers multiplied " + Multiplication(a, b));
        System.out.println("the numbers divided " + Division(a, b));
        System.out.println("the remainder " + remainder(a, b));
        System.out.print("Enter a number between 1 and 20: ");
        long userInput = getInteger(1, 20);
        System.out.printf("your factorial is %d.%n",userInput);
        diceRoll();
    }

    public static int Addition (int a, int b) {
        int sum = a + b;
        return sum;
    }
    public static int Subtraction (int a, int b) {
        int dif = a - b;
        return dif;
    }
    public static int Multiplication (int a, int b) {
        if (a<b){
            return Multiplication(b,a);
        }
        else if (b!=0){
            return (a + Multiplication(a, b-1));
        }else{
            return 0;
        }
    }

    public static double Division (int a, int b){
        double sum = (double)a/(double)b;
        return sum;
    }
    public static int remainder (int a, int b){
        return a%b;
    }
    public static long getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        int input=scanner.nextInt();
        if (input >= min && input <=max){
            return factorial(input);
        }
        else {
            System.out.printf("Please input an number between %d and %d:",min,max);
        return getInteger(min, max);
        }
    }
    public static long factorial(long a){
        if (a==1){
            return 1;
        }else{
            return (a * factorial(a-1));
        }
    }
    public static int getRandom(int min, int max){
        return (int) Math.floor(Math.random()*max+1) +min;
    }
    public static void diceRoll(){
        Scanner dice = new Scanner(System.in);
        while (true){
            System.out.println("How many sides on your die?");
            int sides = dice.nextInt();
            System.out.println("your first roll is " + getRandom(1, sides));
            System.out.println("your second roll is " + getRandom(1, sides));
            System.out.println("Roll again? y/N");
            String confirm = dice.next();
            if (confirm.equalsIgnoreCase("y")){
                continue;
            }else{
                break;
            }

        }
    }
}
