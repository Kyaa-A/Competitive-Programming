import java.util.Scanner;
public class Problem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;
        while ((n = scan.nextInt()) != 0) {
            int generator = 0;
            for (int i = 1; i <= n; i++) {
                int sum = i;
                int temp = i;
                while (temp > 0) {
                    sum += temp % 10;
                    temp /= 10;
                }
                if (sum == n) {
                    generator = i;
                    break;
                }
            }
            System.out.println(generator);
        }
    }
}