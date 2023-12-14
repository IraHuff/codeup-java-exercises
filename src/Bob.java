import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        boolean more;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Talk to Bob: ");
            String userInput = scanner.nextLine();
            if(userInput.endsWith("?")){
                System.out.println("Sure");
            }else if(userInput.endsWith("!")){
                System.out.println("Whoa, chill out!");
            }else if(userInput.isEmpty()){
                System.out.println("Fine. Be that way!");
            }else{
                System.out.println("Whatever");
            }
            System.out.print("Talk to Bob some more? (y/N)");
            String confirm = scanner.next();
            if (confirm.equalsIgnoreCase("y")) {
                more = true;
                scanner.nextLine();
            } else {
                more = false;
            }
        }while (more);
    }
}
