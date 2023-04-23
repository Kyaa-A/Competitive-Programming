import java.util.Scanner;

public class Problem1 {
	//Bra Size
	public static void main(String[] args) {
    
    	Scanner scan = new Scanner(System.in);
    	double bust, band;
    	while (true) {
    		System.out.print("Enter bust measurement: ");
    		bust = scan.nextDouble();
      		if (bust == 0) {
        	break;
      		}
      		System.out.print("Enter band measurement: ");
      		band = scan.nextDouble();
      		if (bust > 60) {
        		bust /= 2.54; // convert from centimeters to inches
        		band /= 2.54;
      		}
      		
			double diff = bust - band;
		    if (diff < 0.5) {
		      	System.out.println("Bra Size = " + Math.round(bust) + "AA");
		    }else if (diff < 1.5) {
		     	System.out.println("Bra Size = " + Math.round(bust) + "A");
		    }else if (diff < 2.5) {
		    	System.out.println("Bra Size = " + Math.round(bust) + "B");
		    }else if (diff < 3.5) {
		    	System.out.println("Bra Size = " + Math.round(bust) + "C");
		    }else if (diff < 4.5) {
		     	System.out.println("Bra Size = " + Math.round(bust) + "D");
		    }else if (diff < 5.5) {
		      	System.out.println("Bra Size = " + Math.round(bust) + "E");
		    }else if (diff < 6.5) {
		      	System.out.println("Bra Size = " + Math.round(bust) + "F");
		    }else if (diff < 7.5) {
		      	System.out.println("Bra Size = " + Math.round(bust) + "G");
		    }else if (diff < 8.5) {
		      	System.out.println("Bra Size = " + Math.round(bust) + "H");
		    }else if (diff < 9.5) {
		      	System.out.println("Bra Size = " + Math.round(bust) + "I");
		    }else {
		      	System.out.println("Bra Size = " + Math.round(bust) + "J");
		    }
		    break;
	    }
	    scan.close();
  	}
}

