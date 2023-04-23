package Second;

import java.util.Scanner;

public class MachineProblem4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double[] costs = new double[n];
        double[] gains = new double[n];
        for (int i = 0; i < n; i++) {
            double totalCost = scan.nextDouble();
            int numRecipients = scan.nextInt();
            for (int j = 0; j < numRecipients; j++) {
                int recipient = scan.nextInt() - 1; // subtract 1 to match array index
                double amount = totalCost / numRecipients;
                gains[recipient] += amount;
                costs[i] += amount;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d: %.2f\n", i+1, gains[i] - costs[i]);
        }
    }
}