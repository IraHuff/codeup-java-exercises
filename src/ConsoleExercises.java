import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter an integer");
        int userInt = scanner.nextInt();
        System.out.format("Here is your Integer -->%d<--%n", userInt);
        //if not an int get an error
        System.out.println("Please enter three words no more no less");
        String userString1 = scanner.next();
        String userString2 = scanner.next();
        String userString3 = scanner.next();
        System.out.println(userString1);
        System.out.println(userString2);
        System.out.println(userString3);
// if less than three the prompt continues if more the extra ignored
        System.out.println("a short sentence please");
        scanner.nextLine();
        String userSentence = scanner.nextLine();
        System.out.println(userSentence);
        //next only captures up to the first whitespace
        System.out.println("please enter the length of the room");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.println("please enter the width of the room");
        double width = Double.parseDouble(scanner.nextLine());;
        System.out.println("please enter the height of the room");
        double height = Double.parseDouble(scanner.nextLine());;
        double perimeter = (length * 2) + (width * 2);
        double area = length * width;
        double volume = length * height * width;

        System.out.format("The perimeter of the room is %f, the area of the room is %f, the volume of the room is %f.%n", perimeter, area, volume);

    }
}
