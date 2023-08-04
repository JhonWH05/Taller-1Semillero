public class Punto_18 {

    // Crea un programa que genere una contraseña aleatoria de 8 caracteres que contenga letras mayúsculas, 
    // letras minúsculas y dígitos. Puedes utilizar la clase Math para generar números aleatorios 
    // y la clase String para manipular la contraseña.

    public static void main(String[] args) throws Exception {
        String password = generarContraseñaAleatoria (8);

        System.out.println(" Contraseña Generada: " + password);
    }

    public static String generarContraseñaAleatoria(int length){
        String letrasMayuscular = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String letrasMinusculas = "abcdefghijklmnopqrstuvwxyx";
        String numeros ="0123456789";

        String caracteres = letrasMayuscular + letrasMinusculas + numeros;
        StringBuilder password = new StringBuilder();

        for(int i =0 ; i < length; i++){
            int ramdon = (int) (Math.random() * caracteres.length());
            password.append(caracteres.charAt(ramdon));
        }
        return password.toString();
    }
}
