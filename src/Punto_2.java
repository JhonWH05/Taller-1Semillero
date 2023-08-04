import java.util.Scanner;

public class Punto_2 {
       // Escribe un programa que pida al usuario un número entero y
        //  determine si es par o impar
    public static void main(String[] args) throws Exception {
        int numero;
        Scanner leer = new Scanner(System.in);
        
    
        System.out.println("Ingrese Un numero (Entero): ");
        numero = leer.nextInt();

        if (numero % 2 == 0){
            System.out.println("El numero ingresado ES ( PAR)");
        }else{
            System.out.println("El numero ingresado ES  (IMPAR)");
        }
        leer.close();
    }
}
