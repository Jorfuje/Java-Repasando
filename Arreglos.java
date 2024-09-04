public class Arreglos {
    public static void main(String[] args) {

        // ARREGLOS: Estructura de datos que tienen valores del mismo tipo bajo un mismo
        // nombre
        // Estos arreglos se distribuyen secuencialmente en la memoria y se accede a
        // ellos mediante un índice
        // LOS ARREGLOS SON TAMBIÉN LLAMADOS VECTORES O MATRICES
        // Son de tamaño fijo, es decir, una vez que se declara un arreglo de un tamaño

        // Declaración de un arreglo de enteros
        int[] numeros = new int[5]; // Se declara un arreglo de 5 elementos de tipo entero

        // DATO IMPORTANTE: El indice de los arreglos comienza en 0
        numeros[0] = 1; // Se asigna el valor 1 al primer elemento del arreglo
        numeros[1] = 2; // Se asigna el valor 2 al segundo elemento del arreglo
        numeros[2] = 3; // Se asigna el valor 3 al tercer elemento del arreglo
        numeros[3] = 4; // Se asigna el valor 4 al cuarto elemento del arreglo
        numeros[4] = 5; // Se asigna el valor 5 al quinto elemento del arreglo

        System.out.println(numeros[0]); // Se imprime el primer elemento del arreglo
        System.out.println(numeros[1]); // Se imprime el segundo elemento del arreglo
        System.out.println(numeros[2]); // Se imprime el tercer elemento del arreglo
        System.out.println(numeros[3]); // Se imprime el cuarto elemento del arreglo
        System.out.println(numeros[4]); // Se imprime el quinto elemento del arreglo

        int longitud = numeros.length; // Se obtiene la longitud del arreglo

        System.out.println("La longitud del arreglo es: " + longitud); // Se imprime la longitud del arreglo

        for (int index = 0; index < numeros.length; index++) {
            System.out.println(numeros[index]); // Se imprime cada elemento del arreglo
        }

        // Otra forma de declarar un arreglo de enteros
        int[] numeros2 = { 1, 2, 3, 4, 5 }; // Se declara un arreglo de 5 elementos de tipo entero

        for (int numero : numeros2) {   // Se recorre el arreglo con un ciclo for mejorado
            System.out.println(numero); // Se imprime cada elemento del arreglo
        }
    }
}
