public class EstructurasDeControl {
    public static void main(String[] args){
        // ESTRUCTURAS DE CONTROL: Permiten controlar el flujo de ejecución de un programa.
        // IF: Permite ejecutar un bloque de código si se cumple una condición.
        int a = 5; // Asignación a = 5
        int b = 10; // Asignación b = 10
        if(a < b){ // Condición a < b
            System.out.println("a es menor que b");
        }
        // IF-ELSE: Permite ejecutar un bloque de código si se cumple una condición y otro si no se cumple.
        if(a > b){ // Condición a > b
            System.out.println("a es mayor que b");
        }else{
            System.out.println("a no es mayor que b");
        }
        // IF-ELSE-IF: Permite ejecutar un bloque de código si se cumple una condición, otro si se cumple otra condición y otro si no se cumple ninguna de las anteriores.
        if(a > b){ // Condición a > b
            System.out.println("a es mayor que b");
        }else if(a < b){ // Condición a < b
            System.out.println("a es menor que b");
        }else{
            System.out.println("a es igual a b");
        }
        // SWITCH: Permite ejecutar un bloque de código dependiendo del valor de una variable.
        int dia = 1; // Asignación dia = 1
        switch(dia){ // Variable dia
            case 1: // Caso 1
                System.out.println("Lunes");
                break; // Salir del switch
            case 2: // Caso 2
                System.out.println("Martes");
                break; // Salir del switch
            case 3: // Caso 3
                System.out.println("Miércoles");
                break; // Salir del switch
            case 4: // Caso 4
                System.out.println("Jueves");
                break; // Salir del switch
            case 5: // Caso 5
                System.out.println("Viernes");
                break; // Salir del switch
            case 6: // Caso 6
                System.out.println("Sábado"); // Se ejecuta si dia es 6          
                break; // Salir del switch
            case 7: // Caso 7
                System.out.println("Domingo"); // Se ejecuta si dia es 7
                break; // Salir del switch
            default: // Caso por defecto       
                System.out.println("Día no válido");
                break; // Salir del switch
        }
    }

}
