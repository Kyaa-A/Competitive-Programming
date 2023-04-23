package Second;

import java.util.Scanner;

public class MachineProblem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scoreA = 0;
        int scoreB = 0;
        String servingTeam = "A";
        while (true) {
            System.out.print("Enter rally winner sequence (0 to exit): ");
            String rallyWinnerSequence = scanner.nextLine();
            if (rallyWinnerSequence.equals("0")) {
                break;
            }
            for (int i = 0; i < rallyWinnerSequence.length(); i++) {
                char rallyWinner = rallyWinnerSequence.charAt(i);
                if (rallyWinner == servingTeam.charAt(0)) {
                    scoreA++;
                } else {
                    scoreB++;
                }
                if ((scoreA + scoreB) % 2 == 0) {
                    String temp = servingTeam;
                    servingTeam = "B";
                    scoreA = scoreB;
                    scoreB = scoreA;
                }
            }
            System.out.println(scoreA + "-" + scoreB);
        }
    }
}

