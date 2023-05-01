import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int input = 0;
        while((input = scan.nextInt()) != 0){
            
            int hours = input / 3600; 
            input %= 3600;
            int minutes = input / 60;
            input %= 60;

            
        }
    }
}
