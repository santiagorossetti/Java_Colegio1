import java.util.Scanner;


public class ejercicios1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
    
        System.out.println("Elija el ejercicio: ");
        System.out.println("1. Escribir por consola los números de del 1 al 100 e informar si  el número es par, mostrar su valor.");
        System.out.println("2. Escribir por consola los números del 50 al 100 e informar si  el número es primo, sino escribir sus divisores.");
        System.out.println("3. Pedir números por pantalla hasta que alguno sea mayor a 100 y además sea un numero primo.");
        System.out.println("4. Realizar una calculadora con operaciones aritméticas simples (+, - , *, /).");
        System.out.println("5. Pensar y desarrollar un ejemplo donde se vea el uso del for-each y comentarlo pertinentemente.");

        int ejercicio = sc.nextInt();

        switch (ejercicio) {
            case 1:
                 
                for(int i = 1 ; i <= 100 ; i++){
                    if (i % 2 == 0){
                        System.out.println( i + " es par");
                    } else if (i % 2 == 1){
                        System.out.println( i + " es inpar");
                    }
                }
                

            break;

           /*  case 2:
                
                
        
            
            break;
            */
        }

    
    }
}
