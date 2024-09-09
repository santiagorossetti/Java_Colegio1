package ejerciciosJava2;
import java.util.Scanner;


public class EjerciciosJ2 {

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
	        
	        break;
	        
	        case 3:
	        	
	        	ejercicio3();
	        
	        break;
	        
	        case 4:
	        	
	        	ejercicio4();
	        
	        break;
	        
	        case 5:
	        	
	        	ejercicio5();
	    }

	        sc.close();
	}

	
	public static void ejercicio1 () {
		
	/*1) Declara dos variables numéricas (con el valor que desees), muestra por consola la 
	  suma, resta,multiplicación, división y módulo (resto de la división).*/
		
		int numA = 20;
    	int numB = 5;
    	
    	System.out.println("El resultado de la suma es: " + ( numA + numB ) );
    	System.out.println("El resultado de la resta es: " + (numA - numB ) );
    	System.out.println("El resultado de la multiplicacion es: " + (numA * numB) );
    	System.out.println("El resultado de la division es: " + (numA / numB));
	}
	
	
	public static void ejercicio2 () {
	
		/*2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor 
		de los dos. Si son iguales indicarlo también. Vas cambiando los valores 
		para comprobar que funciona.*/
	
		int numA = 10;
    	int numB = 40;
		
    	if (numA > numB) {
    		System.out.println( numA + " Es el mayor");
    	} else if(numA < numB) {
    		System.out.println( numB + " Es el mayor");
    	} else if(numA == numB){
			System.out.println( numA + " y " + numB + " , como podras ver, son iguales ");
		}
	}
	
	public static void ejercicio3 () {
		
		/*3) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida
		 por consola.Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».*/
		
		String Nombre = "Fernando";
		
		System.out.println("Bienvenido " + Nombre);
		
	}
	
	
	public static void ejercicio4 () {
	/*Modifica la aplicación anterior, para
	  que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).*/
		
		System.out.println("Por favor, ingrese su nombre asi lo/la puedo saludar: ");
		Scanner R6S = new Scanner(System.in);
		
		String Nombre = R6S.next();
		
		System.out.println("Bienvenido " + Nombre);
		
		R6S.close();
	}
	
	
	public static void ejercicio5 () {
		
		/*5) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio 
		se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble).
		Usa la constante PI y el método pow de Math.*/
		
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Introduce un radio: ");
       
        double radio=sc.nextDouble();
		
        double area=Math.PI*Math.pow(radio, 2);
        
        System.out.println("El area del circulo es "+ area);
	}
		
}
