import java.util.Scanner;

public class ClaseScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvnido a la máquina expendedora de bebidas!");
        System.out.println("Elejir una opción de bebida: ");
        System.out.println("1. Café");
        System.out.println("2. Té");
        System.out.println("3. Agua");
        System.out.println("4. Vino");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Has elejido Café");
                break;
            case 2:
                System.out.println("Has elejido Té");
                break;
            case 3:
                System.out.println("Has elejido Agua");
                break;
            case 4:
                System.out.println("Has elejido Vino");
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }

        System.out.println("Gracias por usar la máquina expendedora de bebidas!");
        scanner.close();

    }
}
