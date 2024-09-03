public class Variables {
    public static void main(String[] args) {
        System.out.println("Hola mundo desde Java!");

        /*
         * Comentarios
         * multilinea
         */

        // Comentarios en una sola línea

        /*
         * VARIABLE:
         * Es un espacio de memoria que tiene un nombre asociado y puede contener un
         * valor cambiante
         * DECLARACIÓN:
         * Asignar el tipo de datop y el nombre de la variable sin darle un valor
         * inicial
         * DEFINICIÓN:
         * Asignar el tipo y el nombre de la variable dándole o no un valor inicial
         * ASIGNACIÓN:
         * Darle un valor a la variable ya declarada
         */

        int numero = 5;

        System.out.println(numero);

        /*
         * TIPOS DE VARIABLES:
         * Variables primitivas: Almacenan valores básicos
         * Variables de referencia: Almacenan direciones de memoria que apuntan a
         * objetos
         */
    
        //  TIPOS DE DATOS ENTEROS: byte (-128 al 127), short (-32768 al 32767), int, long
        int numero1 = 5;

        // TIPOS DE DATOS REALES: float (6 decimales) y el double
        double decimal = 5.2513;

        // TIPO DE DATO CARACTER
        char letra = 's';

        // TIPO DE DATO BOOLEANO
        boolean v = true;
        boolean f = false;

        System.out.println(numero1);
        System.out.println(decimal);
        System.out.println(letra);
        System.out.println(v);
        System.out.println(f);
    }
}