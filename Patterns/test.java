import java.sql.SQLOutput;

public class test{
    public static void main(String[] args) {
        
        test(5, "* ", "  ");
    }
    static void test(int n, String symbol, String space){
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(space);
            }
            System.out.print(symbol);
            for (int j = 1; j < (i-1)*2 ; j++) {
                System.out.print(space);
            }
            if(i == 1){
                System.out.println();
            }else{
                System.out.print(symbol + "\n");
            }
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(space);
            }
            System.out.print(symbol);
            for (int j = 1; j < (i-1)*2; j++) {
                System.out.print(space);
            }
            if(i == 1){
                System.out.println();
            }else{
                System.out.print(symbol + "\n");
            }
        }
    }
}