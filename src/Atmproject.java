import java.util.Scanner;
public class Atmproject {
    public static void main(String[] args) {

        int pin = 9398;
        int balance = 10000;

        Scanner sc = new Scanner(System.in);

        int attempts = 0;

        for (; attempts < 3; attempts++) {

            System.out.println("Enter your pin:");
            int enterPin = sc.nextInt();

            if (enterPin == pin) {
                System.out.println("Correct pin");
                break;
            } else {
                System.out.println("Wrong pin");
            }
        }

        if (attempts == 3) {

            System.out.println("ATM blocked");

        } else {

            System.out.println("Balance: " + balance);
            System.out.println("Enter withdraw amount:");

            int withdraw = sc.nextInt();

            if (withdraw <= balance) {

                balance = balance - withdraw;

                System.out.println("Withdraw successful");
                System.out.println("New balance = " + balance);

            } else {

                System.out.println("Insufficient balance");
            }
        }

        sc.close();
    }
}