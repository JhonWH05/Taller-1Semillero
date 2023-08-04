import java.util.Scanner;

public class Punto_9 {

    // Escribe un programa que solicite al usuario un número entero positivo y calcule su factorial.
    
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);

        int numero;
        do{
            System.out.println("DIGITE UN NUMERO ENTERO para calcular su factorial: ");
            numero = leer.nextInt();

        }while(numero < 0);

        long factorial=1;
        for(int i = 1; i <= numero;i++){
            factorial *= i;
        }

        System.out.println("El factorial de " + numero + " es: " + factorial);
        leer.close();
    }
}
