import java.util.ArrayList;
import java.util.Scanner;

public class tes51{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            arr.add(scan.nextInt());
        }

        System.out.println(arr);
    }
}