public class Punto_28 {
    // Suma de elementos: Escribe un programa que
    //  calcule la suma de todos los elementos en un arreglo de enteros.


    public static void main(String[] args) throws Exception {
       int [] arreglo = {2,4,6,8};
       System.out.println();
        System.out.println("Arreglo: ");
        System.out.println();
        mostrarArreglo(arreglo);
        
        int suma = 0;
       for(int elemento : arreglo)
       {
           suma += elemento;
       }
       System.out.println("");
       System.out.println("la suma es: " + suma);
       System.out.println("");
    }

    static void mostrarArreglo(int arreglo []){
        for(int i = 0; i < arreglo.length; i++){
           
            System.out.print(String.format("%4d", arreglo[i]));
        }
        System.out.println();
    }
}
