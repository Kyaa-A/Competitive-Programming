package Second;

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int fuseRating = scan.nextInt();    // Max 
        int numDevices = scan.nextInt();    // Device Values 

        int[] current = new int[numDevices];   //Store device
   
        for (int i = 0; i < numDevices; i++) {
            current[i] = scan.nextInt();
        }
      
        int totalCurrent = 0;
        boolean[] isActive = new boolean[numDevices];
        while (true) {
            int deviceNum = scan.nextInt();
            if (deviceNum == 0) {
                break;
            }
            isActive[deviceNum - 1] = !isActive[deviceNum - 1];
            if (isActive[deviceNum - 1]) {
                totalCurrent += current[deviceNum - 1];
                System.out.println("TOTAL: " + totalCurrent);

                if (totalCurrent > fuseRating) {
                    System.out.print("Fuse blown\nActive devices:");
                    for (int i = 0; i < numDevices; i++) {
                        if (isActive[i]) {
                            System.out.print(" " + (i + 1));
                        }
                    }
                    System.out.println();
                    return;
                }
            } else {
                System.out.println("TOTAL: " + totalCurrent);
                totalCurrent -= current[deviceNum - 1];
            }
        }

        System.out.println("Fuse not blown");
        System.out.println("Max load at " + totalCurrent);
    }
}