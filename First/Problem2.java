import java.util.Scanner;

public class Problem2 {
	//How Long?
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
      
        int input = 0;
        while ((input = scan.nextInt()) != 0) {
            String output = converter(input);
            System.out.println(input + " seconds = " + output);
        }
        scan.close();
    }
    static String converter(int seconds) {
    	
        int hours = seconds / 3600;
        seconds %= 3600;
        int minutes = seconds / 60;
        seconds %= 60;
        
        StringBuilder result = new StringBuilder();
        if (hours > 0) {
            result.append(hours).append(hours == 1 ? " hour" : " hours");
        }
        if (minutes > 0) {
            if (result.length() > 0) {
                result.append(", ");
            }
            result.append(minutes).append(minutes == 1 ? " minute" : " minutes");
        }
        if (seconds > 0) {
            if (result.length() > 0) {
                result.append(" and ");
            }
            result.append(seconds).append(seconds == 1 ? " second" : " seconds");
        }
        return result.toString();
    }
}

