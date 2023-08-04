import java.util.Scanner;

public class Punto_16 {
    // Realiza un programa que calcule e imprima la serie de Fibonacci 
    // hasta un número dado ingresado por el usuario. 
    
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int numeroMaximo;

        System.out.println("Ingresa el numero maximo para la serie Fibonacci: ");
        numeroMaximo = leer.nextInt();

        System.out.println("Serie fibonacci hasta " + numeroMaximo + " :");
        for(int i=0; i <= numeroMaximo; i++){
            System.out.println(fibonacci(i) + " ");
        }
        leer.close();

    }
    public static int fibonacci(int numero){
        if(numero <= 1){
            return numero;
        }else{
            return fibonacci(numero - 1 ) + fibonacci(numero - 2 );
        }
    }
}
