import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();
        System.out.print("Enter Symbol : ");
        char c = sc.next().charAt(0);
        sc.close();
           hollowdiamond(n, c); 
    }

    static void hollowdiamond(int n, char c){

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("_");
            }
            if(i == 1){
                System.out.print("*");
            }else{
                for (int j = 1; j <= i * 2 - 1; j++) {
                    if(j == 1 || j == i * 2 -1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
            }  
            System.out.println("");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("$");
            }
            for (int j = n; j >= i * 2 - 1; j--) {
                if(j == 1 || j == i * 2 -1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
            
        }
    }







    private static void hollowPyramid(int n, char c) {
        for (int i = 1; i <= n; i++) {

            // for space
            for (int j = 1; j <= n - i; j++) {
                System.out.print("_");
            }

            /* when to print symbol */
            // for 1st row and last row
            if (i == 1 || i == n)
                for (int j = 1; j <= i * 2 - 1; j++) {
                    System.out.print(c);
                }

            // for middle rows
            else {

                // when to print space and when to print symbol for middle rows
                for (int j = 1; j <= i * 2 - 1; j++) {
                    if (j == 1 || j == i * 2 - 1)
                        System.out.print(c);
                    else
                        System.out.print("_");
                }
            }

            // print new line
            System.out.println();

        }
    }
}