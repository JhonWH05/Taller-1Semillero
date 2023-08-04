import java.util.Scanner;

public class Punto_12 {
    
    // Realiza un programa que pida al usuario un número entero y determine si es un número primo o no

    public static void main(String[] args) throws Exception {
      Scanner leer = new Scanner (System.in);

      int numero;
      
      System.out.println();

      System.out.println("ESTE PROGRAMA DETERMINA SI UN NUMERO ES PRIMO O NO");
      System.out.println("Ingrese un numero Entero: ");
      numero = leer.nextInt();

      if(esPrimo(numero)){
        System.out.println("El numero " + numero + "    ES PRIMO");
      }else{
        System.out.println("El numero   " + numero + "  NO ES primo");
      }
      leer.close();
    }
    public static boolean esPrimo(int numero){
        if(numero<=1){
            return false;
        }
        for(int i =2; i<= Math.sqrt(numero); i++){
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }
}
