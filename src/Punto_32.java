

import java.util.Scanner;

public class Punto_32 {
    
    // Buscar un elemento: Escribe un programa que busque un número específico en un arreglo y 
    // muestre su índice (o un mensaje si no se encuentra)

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int numeroBuscado;


        int arreglo[] = {20, 30 ,40, 5, 6};

        
        System.out.println("Arreglo: ");
        mostrarArreglo(arreglo);
        
      

        System.out.println(" Ingrese el numero que desea buscar:  ");
        numeroBuscado = leer.nextInt();

        int indice = -1;

        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] == numeroBuscado){
                indice = i;
                break;
            }
        }
            if (indice != -1){
                System.out.println("El numero " + numeroBuscado + " se encuentra en el indice " + indice + " del array");
            }else{
                System.out.println("El numero " + numeroBuscado + " no se encuentra en el array");
            }
            System.out.println();
           leer.close();

    }

    static void mostrarArreglo(int arreglo []){
        for(int i = 0; i < arreglo.length; i++){
           
            System.out.print(String.format("%4d", arreglo[i]));
        }
        System.out.println();
    }
  

}
