package Second;

import java.util.Scanner;
public class MachineProblem1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] keywords = new String[n];
        for (int i = 0; i < n; i++) {
            keywords[i] = scan.next().toLowerCase();
        }
        int m = scan.nextInt();
        scan.nextLine();
        for (int i = 1; i <= m; i++) {
            String input = "";
            int count = 0;
            while (true) {
                String line = scan.nextLine().toLowerCase();
                if (line.equals("#")) {
                    break;
                }
                input += line + " ";
            }
            for (String keyword : keywords) {
                int index = input.indexOf(keyword);
                if (index != -1) {
                    count++;
                    input = input.substring(0, index) + input.substring(index + keyword.length());
                }
            }
            System.out.println("Student " + i + ": " + count);
        }
        scan.close();
    }
}