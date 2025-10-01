import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your birth month (1-12): ");
        int BirthMonth = input.nextInt();

        if (BirthMonth >= 1 && BirthMonth <= 12) {
            System.out.println("Your birth month is " + BirthMonth);
        } else {
            System.out.println("You entered an incorrect month: "  + BirthMonth);
        }
    }
}
