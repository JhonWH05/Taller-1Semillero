import java.util.Scanner;

public class Punto_7 {

    // Crea un programa que pida al usuario un número entero positivo 
    // y muestre su tabla de multiplicar hasta el 10.
    public static void main(String[] args) throws Exception {
        int numero;
        int contador;
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese Un numero Entero POSITIVO: ");
        numero = leer.nextInt();
        int resultado;
        for(contador = 0; contador<=10; contador++){
            resultado= numero*contador;

            System.out.println(numero + " X " + contador + " = " + resultado);
        
            leer.close();
        }
       
    }
}
