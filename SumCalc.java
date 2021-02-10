import java.util.InputMismatchException;
import java.util.Scanner;

public class SumCalc
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int sum = 0;
        int counter = 1;
        try {
            while (counter < 4) {
                System.out.println("Enter a integer");
                sum += keyboard.nextInt();
                System.out.println("Current sum: " + sum);
                counter++;
            }
        } catch (InputMismatchException e) {
            System.out.println("There were no digits in that input.");
        }
        System.out.println("Final sum: " +sum);
    }
}
