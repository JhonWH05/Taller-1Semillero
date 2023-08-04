import java.text.DecimalFormat;
import java.util.Scanner;

public class Punto_13 {

    // Pide al usuario un número decimal y muestra su valor redondeado a un número específico de decimales 
    public static void main(String[] args) throws Exception {
       Scanner leer = new Scanner(System.in);
       double numero;

       System.out.println();
       System.out.println("ESTE PROGRAMA REDONDEA A 2 DECIMAS");
       System.out.println("Ingrese Un numero decimal (utilizar (,) ): ");
       numero = leer.nextDouble();

       int decimales = 2;

       String formato = "#.";

       for(int i = 0; i < decimales; i++){
        formato += "#";
       }
       DecimalFormat decimalFormat = new DecimalFormat(formato);
       String numeroRedondeado = decimalFormat.format(numero);

       System.out.println(" El Numero Redondeado es: " + numeroRedondeado);

       leer.close();
    }
}
