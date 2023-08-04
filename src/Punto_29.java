public class Punto_29 {
    // Encontrar el número más grande: 
    // Crea un programa que encuentre el número más grande en un arreglo de enteros.

    public static void main(String[] args) throws Exception {
        
        int arreglo [] = {35,40,22,10};
        System.out.println();
        System.out.println("ESTOS SON LOS ELEMENTOS DEL ARREGLO : ");
        System.out.println();
        mostrarArreglo(arreglo);
            
            int mayor = arreglo[0];
                for(int i = 0; i < arreglo.length; i++){
                    mayor = Math.max(mayor, arreglo[i]);
                    
                }
            System.out.println();
            System.out.println("El numero Mayor del arreglo es: " + mayor);
            System.out.println();

        // for(int i = 0; i < arreglo.length; i++){
        //     int numeroActual = arreglo[i];
        //     boolean esMayor = true;

        //     for(int j = 0;  j < arreglo.length; j++ ){
        //         if(arreglo[j] > numeroActual){
        //             esMayor = false;
        //             break;
        //         }
        //     }
        //     if  (esMayor){
        //         System.out.println();
                
        //         System.out.println();
        //         System.out.println("El numero mayor del arreglo es: " + numeroActual);
        //         System.out.println();
        //     }
        }
        static void mostrarArreglo(int arreglo []){
            for(int i = 0; i < arreglo.length; i++){
               
                System.out.print(String.format("%4d", arreglo[i]));
            }
            System.out.println();
        }
     
    }
    

