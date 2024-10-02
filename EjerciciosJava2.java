package ejerciciosJava2;
import java.util.Scanner;



public class EjerciciosJ2 {

	public static void main(String[] args) {
		Menu();
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
	/* Modifica la aplicación anterior, para
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
        
        sc.close();
	}
	
	public static void ejercicio6 () {
		
	/*6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). 
	 Si no lo es, también debemos indicarlo.*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero y le digo si ese numero es divisible por 2 o no: ");
	
		int numIngresado = sc.nextInt();
		
		if (numIngresado % 2 == 0) {
			System.out.println(numIngresado + " es divisible por 2");
		} else {
			System.out.println(numIngresado + " no es divisible por 2");
		}
		
		
		
		sc.close();
	}
	
		public static void ejercicio7 () {
		/*7) Lee un número por teclado y muestra por consola, el carácter al que pertenece
		  en la tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.*/
		
			// no se puede realizar por el momento
			
			
		}
		
		public static void ejercicio8 () {
			/*Modifica el ejercicio anterior, para que en lugar de pedir un número,
			  pida un carácter (char) y muestre su código en la tabla ASCII.*/
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduzca un caracter para pasar a codigo ASCII");
			
			 char caracter = sc.next().charAt(0);
			 
		     int ASCII = (int) caracter;
		 
		        System.out.println("El codigo ASCII de " + caracter + " es " + ASCII);
		}
		
		public static void ejercicio9 () {
			/*Lee un número por teclado que pida el precio de un producto
			(puede tener decimales) y calcule el precio final con IVA. El IVA sera una constante que sera del 21%.*/
			
			Scanner sc = new Scanner(System.in);
			
			
			final double IVA = 1.21;
			
			System.out.println("Ingrese el precio del producto: ");
			
			double precio = sc.nextDouble();
			
			double precioFinal = precio * IVA;
			
			System.out.println("El precio final es " + precioFinal);
		}
		
	
		public static void Menu() {
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
		        
		        break;
		        
		        case 6:
		        	
		        	ejercicio6();
		        	
		        break;
		        
		        case 7:
		        	
		        	ejercicio7();
		        
		        break;
		        
		        case 8:
		        	
		        	ejercicio8();
		        
		        break;		        
		        
		        case 9:
		        	
		        	ejercicio9();
		        
		        break;
		    }

		        sc.close();
		}
}
