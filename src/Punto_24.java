import java.util.Scanner;



public class Punto_24 {
    
    // Realiza un programa que solicite al usuario una cadena y reemplace
    //  todas las apariciones de una letra específica por otra
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        String cadena;
        String letraARemplazar;
        String letraRemplazo;

        System.out.println(" Ingrese Una cadena de texto: ");
        cadena = leer.nextLine();

        System.out.println("Ingrese la letra que quiere remplazar: ");
        letraARemplazar = leer.nextLine();

        

        System.out.println(" Ingrese la letra de remplazo");
        letraRemplazo = leer.nextLine();

        
        if (cadena.indexOf(letraARemplazar) != -1){
         String cadenaRemplazada = cadena.replace(letraARemplazar, letraRemplazo);
        System.out.println("");
        System.out.println("CADENA ORIGINAL: " + cadena);
        System.out.println("");
        System.out.println("CADENA CON LETRA REMPLAZADA: " +cadenaRemplazada);
        System.out.println("");
        
      
           
        }else{
            System.out.println("");
             System.out.println("LA LETRA "+ letraARemplazar + " NO SE ENCUENTRA EN LA CADENA DE TEXTO ORIGINAL ");
               leer.close();
               System.out.println("");
        }
      
    }
}
