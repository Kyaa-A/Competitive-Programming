import java.util.Scanner;
public class Problem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Read number of requirements
        int n = scan.nextInt();
        // Read relative weight of each requirement
        int[] weight = new int[n];
        for (int i = 0; i < n; i++) {
            weight[i] = scan.nextInt();
        }
        // Read number of proposals
        int p = scan.nextInt();
        // Read each proposal and calculate score
        int bestProposal = -1;
        double bestScore = Double.NEGATIVE_INFINITY;
        for (int i = 1; i <= p; i++) {
            String reqs = scan.next();
            double price = scan.nextDouble();
            int score = 0;
            for (int j = 0; j < n; j++) {
                if (reqs.charAt(j) == 'O') {
                    score += weight[j];
                }
            }
            double normalizedScore = score / price;
            if (normalizedScore > bestScore) {
                bestScore = normalizedScore;
                bestProposal = i;
            }
        }
        // Output the winning proposal number
        System.out.println("Proposal " + bestProposal);
    }
}