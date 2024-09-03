package cosasJAVA2;
import java.util.Scanner;


public class Papucosas {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		    
	        System.out.println("Elija el ejercicio: ");
	      

	        int ejercicio = sc.nextInt();
	        switch (ejercicio) {
	        
	        case 1:
	        	
	        	ejercicio1();
		
	        break;

	        case 2:
	    
	        	ejercicio2();
		
	    }

	}

	
	public static void ejercicio1 () {
		int numA = 20;
    	int numB = 5;
    	
    	System.out.println("El resultado de la suma es: " + ( numA + numB ) );
    	System.out.println("El resultado de la resta es: " + (numA - numB ) );
    	System.out.println("El resultado de la multiplicacion es: " + (numA * numB) );
    	System.out.println("El resultado de la division es: " + (numA / numB));
	}
	
	
	public static void ejercicio2 () {
		
		int numA = 10;
    	int numB = 40;
		
    	if (numA > numB) {
    		System.out.println( numA + " Es el mayor");
    	} else if(numA < numB) {
    		System.out.println( numB + " Es el mayor");
    	}
	}
	
	
	
	
}
