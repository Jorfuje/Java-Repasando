public class Cadenas {
    public static void main(String[] args){
        String texto = "Este es un texto asignado a una variable String";
        System.out.println(texto);

        // Función para obtener la longitud del String
        int longitud = texto.length();
        System.out.println(longitud);

        // Función para obtener el caracter en la posición del index especificado
        char caracter = texto.charAt(0);
        System.out.println(caracter);


        // Función para obtener una subcadena de la cadena original
        String subCadena = texto.substring(5, 16);
        System.out.println(subCadena);

        // Función para convertir a minúsculas
        String minuscula = texto.toLowerCase();;
        System.out.println(minuscula);

        // Función para convertir a mayúsculas
        String mayuscula = texto.toUpperCase();
        System.out.println(mayuscula);

        // Función para buscar la primera ocurrencia de una subcadena
        int indice = texto.indexOf("variable");
        System.out.println(indice);

        // Función para reemplazar una subcadena por otra
        String reemplazo = texto.replace("texto", "parrafo");
        System.out.println(reemplazo);

        // Función para verificar si una cadena contiene una subcadena
        boolean contiene = texto.contains("asignado");
        System.out.println("Tiene la palabra asignado: " + contiene);

        // Función para eliminar los espacios en blanco al inicio y al final
        String texto2 = "   Hola mundo   ";
        String sinespacios = texto2.trim();
        System.out.println(sinespacios);
    }
}