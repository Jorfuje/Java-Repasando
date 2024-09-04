public class BucleFor {

    public static void main(String[] args) {
        
        // Bucle for que recorre 10 veces, for(declaracion; condicion; incremento)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                // Bucle anidado, se ejecuta 5 veces por cada iteracion del bucle principal
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}