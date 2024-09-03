public class Operadores {
    public static void main(String[] args){

        // OPERADORES: Simbolos que sirven para hacer operaciones con variables o valores.
        // ARITMÉTICOS: +, -, *, /, % (módulo)

        int a = 5;  // Asignación   a = 5               
        int b = 2;  // Asignación   b = 2       
        int suma = a + b; // Suma       suma = 7
        int resta = a - b; // Resta     resta = 3
        int multiplicacion = a * b; // Multiplicación multiplicacion = 10
        int division = a / b; // División division = 2
        int modulo = a % b; // Módulo     modulo = 1    
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        // OPERADORES DE ASIGNACIÓN: =, +=, -=, *=, /=, %=
        int c = 10; // Asignación c = 10
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c); // c = 15
        c -= 5; // c = c - 5
        System.out.println("c -= 5: " + c); // c = 10
        c *= 5; // c = c * 5
        System.out.println("c *= 5: " + c); // c = 50
        c /= 5; // c = c / 5
        System.out.println("c /= 5: " + c); // c = 10
        c %= 5; // c = c % 5
        System.out.println("c %= 5: " + c); // c = 0
        c++; // c = c + 1
        System.out.println("c++: " + c); // c = 1
        c--; // c = c - 1
        System.out.println("c--: " + c); // c = 0

        // OPERADORES DE COMPARACIÓN: ==, !=, >, <, >=, <=
        int d = 5;  // Asignación   d = 5
        int e = 10; // Asignación   e = 10

        boolean igual = d == e; // Igualdad      igual = false      
        boolean diferente = d != e; // Diferencia diferente = true
        boolean mayor = d > e; // Mayor         mayor = false
        boolean menor = d < e; // Menor         menor = true    
        boolean mayorIgual = d >= e; // Mayor o igual mayorIgual = false
        boolean menorIgual = d <= e; // Menor o igual menorIgual = true
        System.out.println("Igualdad: " + igual);
        System.out.println("Diferencia: " + diferente);
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
        System.out.println("Mayor o igual: " + mayorIgual);
        System.out.println("Menor o igual: " + menorIgual);

        // OPERADORES LÓGICOS: && (AND), || (OR), ! (NOT)
        boolean f = true;  // Asignación f = true
        boolean g = false; // Asignación g = false

        boolean and = f && g; // AND     and = false    
        boolean or = f || g; // OR      or = true
        boolean not = !f; // NOT        not = false
        System.out.println("AND: " + and);
        System.out.println("OR: " + or);
        System.out.println("NOT: " + not);
        


    }
}
