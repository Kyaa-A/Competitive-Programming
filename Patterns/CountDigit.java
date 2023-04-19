import java.util.Scanner;

public class CountDigit {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        // int numOfDigit = (int) (Math.log10(number)) + 1;
        int numOfDigit = countNumOfDigit(number);
        System.out.println("\nNumber of digits: " + numOfDigit);
    }

    static int countNumOfDigit(int number) {

        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;

    }

}
