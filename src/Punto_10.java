public class Punto_10 {

    // Ejercicio 10: Crea un programa que muestre los primeros 20 números de la serie Fibonacci. 
    // La serie Fibonacci se forma sumando los dos números anteriores 
    // para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …

    public static void main(String[] args) throws Exception {
      int numeros = 20;

      System.out.println("los primeros " + numeros + "de la serie fibonacci Son: ");

      int numeroAnterior = 0;
      int numeroActual = 1;

      for(int i=1; i <= numeros; i++){
        System.out.println(numeroAnterior + " ");

        int numeroSiguiente = numeroAnterior + numeroActual;
        numeroAnterior = numeroActual;
        numeroActual = numeroSiguiente;
      }
    }
}
