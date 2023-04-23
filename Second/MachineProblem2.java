package Second;

import java.util.Scanner;

public class MachineProblem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxCapacity = scan.nextInt();
        int numDevices = scan.nextInt();
        int[] currentDrawn = new int[numDevices];
        for (int i = 0; i < numDevices; i++) {
            currentDrawn[i] = scan.nextInt();
        }
        int maxPower = 0;
        boolean blewFuse = false;
        boolean[] deviceOn = new boolean[numDevices];
        int totalCurrent = 0;
        while (true) {
            int deviceNum = scan.nextInt();
            if (deviceNum == 0) {
                break;
            }
            deviceOn[deviceNum - 1] = !deviceOn[deviceNum - 1];
            if (deviceOn[deviceNum - 1]) {
                totalCurrent += currentDrawn[deviceNum - 1];
            } else {
                totalCurrent -= currentDrawn[deviceNum - 1];
            }
            if (totalCurrent > maxCapacity) {
                blewFuse = true;
                break;
            }
            maxPower = Math.max(maxPower, totalCurrent);
        }
        if (blewFuse) {
            System.out.println("Fuse blown.");
            System.out.print("Active devices:");
            for (int i = 0; i < numDevices; i++) {
                if (deviceOn[i]) {
                    System.out.print(" " + (i + 1));
                }
            }
            System.out.println();
        } else {
            System.out.println("Fuse not blown.");
            System.out.println("Max Load at " + maxPower);
        }
    }
}