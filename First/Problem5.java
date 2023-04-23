import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Read the number of requirements
        int n = scan.nextInt();
        // Read the weights of the requirements
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scan.nextInt();
        }
        // Read the number of proposals
        int p = scan.nextInt();
        // Read the proposals and calculate their scores
        double[] scores = new double[p];
        scan.nextLine(); // consume the newline character
        for (int i = 0; i < p; i++) {
            String[] proposal = scan.nextLine().split(" ");
            String reqs = proposal[0];
            double price = Double.parseDouble(proposal[1]);
            double score = 0;
            for (int j = 0; j < n; j++) {
                if (reqs.charAt(j) == 'O') {
                    score += weights[j];
                }
            }
            score /= price;
            scores[i] = score;
        }
        // Find the winning proposal
        int winner = 0;
        for (int i = 1; i < p; i++) {
            if (scores[i] > scores[winner]) {
                winner = i;
            }
        }
        // Output the winning proposal number
        System.out.println("Proposal " + (winner + 1));
    }
}