import java.util.Scanner;

public class Punto_17 {

// Pide al usuario dos números enteros y muestra todos los números primos que se encuentran en ese rango.
    public static void main(String[] args) throws Exception {
       Scanner leer = new Scanner(System.in);
        int numeroInicio;
        int numeroLimite;

        System.out.println(" Ingrese el primer numero: ");
        numeroInicio = leer.nextInt();

        System.out.println(" Ingrese el segundo numero: ");
        numeroLimite = leer.nextInt();

        System.out.println("Los Numeros primos entre " + numeroInicio + " Y " + numeroLimite + " : ");

        for(int i = numeroInicio; i <= numeroLimite; i++){
            if(esPrimo(i)){
                System.out.println(i + "    ");
            }
            leer.close();
        }

    }
    public static boolean esPrimo(int numero){
        if(numero <= 1){
            return false;
        }
        for(int j = 2; j <= Math.sqrt(numero); j++){
            if(numero % j ==0){
                return false;
            }
        }
        return true;
    }
    
}
