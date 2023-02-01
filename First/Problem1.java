package First;

import java.util.Scanner;
import java.util.ArrayList;

public class Problem1 {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> input = new ArrayList<>();

        int m = 0;
        int n = 0;
        double lastDigit = 0;
        double limit = Math.pow(10, 101);
        int counter = 0;

        boolean padayon = true;

        do {
            do {
                m = scan.nextInt();
                n = scan.nextInt();
                System.out.println();
                counter++;
                double squared = Math.pow(m, n);
                double temp = squared;

                do {
                    lastDigit = squared % 10;
                    temp /= 10;
                } while (temp != 0);
                if (m != 0 || n != 0) {
                    input.add((int) lastDigit);
                    if (limit > counter) {
                        padayon = false;
                    }
                }

            } while (m != 0 || n != 0);
            scan.close();
        } while (padayon);

        System.out.println();

        for (int i = 0; i < input.size(); i++) {
            System.out.println(input.get(i));
        }

    }

}
