public class ControlesDeFlujo {
    public static void main(String[] args) {

        int i = 1; // Inicialización de la variable i

        for (i = 1; i <= 10; i++) { // Inicialización de la variable i; Condición de parada; Incremento de la
                                    // variable i

            if (i == 5) { // Si la variable i es igual a 5
                break; // Salir del bucle
            }
            System.out.println(i); // Imprime el valor de la variable i
        }

        System.out.println("\n"); // Salto de línea

        for (i = 1; i <= 10; i++) { // Inicialización de la variable i; Condición de parada; Incremento de la
                                    // variable i
            if (i == 5) { // Si la variable i es igual a 5
                continue; // Continuar con la siguiente iteración
            }

            System.out.println(i); // Imprime el valor de la variable i
        }

        System.out.println("\n"); // Salto de línea

        for (i = 1; i <= 10; i++) { // Inicialización de la variable i; Condición de parada; Incremento de la
                                    // variable i
            if (i == 5) {   // Si la variable i es igual a 5
                return;    // Salir del método
            }

            System.out.println(i);  // Imprime el valor de la variable i
        }
    }
}
