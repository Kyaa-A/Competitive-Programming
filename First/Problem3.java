import java.util.Scanner;
public class Problem3 {
    //WRONG
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] fat = new int[100];
        int[] protein = new int[100];
        int[] sugar = new int[100];
        int[] starch = new int[100];
        int[] alcohol = new int[100];
        int count = 0;
        while (true) {
            String line = input.nextLine();
            if (line.equals("-")) {
                break;
            }
            String[] values = line.split(" ");
            fat[count] = getValue(values[0]);
            protein[count] = getValue(values[1]);
            sugar[count] = getValue(values[2]);
            starch[count] = getValue(values[3]);
            alcohol[count] = getValue(values[4]);
            count++;
        }
        int totalCalories = getTotalCalories(fat, protein, sugar, starch, alcohol, count);
        int totalFatCalories = getTotalFatCalories(fat, count);
        int percentCaloriesFromFat = (int) Math.round((double) totalFatCalories / totalCalories * 100);
        System.out.println(percentCaloriesFromFat + "%");
    }
    public static int getValue(String str) {
        if (str.endsWith("g")) {
            return Integer.parseInt(str.substring(0, str.length() - 1));
        } else if (str.endsWith("C")) {
            return Integer.parseInt(str.substring(0, str.length() - 1));
        } else if (str.endsWith("%")) {
            return 0;
        }
        return 0;
    }
    public static int getTotalCalories(int[] fat, int[] protein, int[] sugar, int[] starch, int[] alcohol, int count) {
        int totalCalories = 0;
        for (int i = 0; i < count; i++) {
            totalCalories += fat[i] * 9 + protein[i] * 4 + sugar[i] * 4 + starch[i] * 4 + alcohol[i] * 7;
        }
        return totalCalories;
    }
    public static int getTotalFatCalories(int[] fat, int count) {
        int totalFatCalories = 0;
        for (int i = 0; i < count; i++) {
            totalFatCalories += fat[i] * 9;
        }
        return totalFatCalories;
    }
}