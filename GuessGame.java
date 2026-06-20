import java.util.Scanner;

public class GuessGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your Number: ");
        int myNumber = sc.nextInt();

        int userNumber = 0;
        int attempts = 0;

        while(userNumber != myNumber) {

            System.out.print("Guess Number: ");
            userNumber = sc.nextInt();

            attempts++;

            if(userNumber > myNumber) {
                System.out.println("Number is Too High");
            }

            else if(userNumber < myNumber) {
                System.out.println("Number is Too Low");
            }

            else {
                System.out.println("You Won!");
                System.out.println("Total Attempts = " + attempts);
            }
        }

        sc.close();
    }
}