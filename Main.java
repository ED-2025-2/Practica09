import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pila<Integer> pila = new Pila<>();

        System.out.println("\nLa pila está vacía: " + pila.esVacia());

        // Agregar elementos a la pila de forma interactiva
        System.out.println("Ingrese números a la pila (Ingrese -1 para terminar):");
        while (true) {
            System.out.print("Número: ");
            int num = scanner.nextInt();
            if (num == -1) break; // Terminar si el usuario ingresa -1
            pila.apilar(num);
            System.out.println("Elemento " + num + " agregado.");
        }

        
        // Mostrar el contenido de la pila
        System.out.println("\nContenido actual de la pila:");
        mostrarPila(pila);


        // Mostrar la cima y longitud
        try {
            System.out.println("\nElemento en la cima: " + pila.darElementoCima());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Longitud de la pila: " + pila.darLongitud());

        // Desapilar un elemento
        try {
            pila.desapilar();
            System.out.println("Desapilamos el ultimo elemento ingresado.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // Mostrar la pila después de desapilar
        System.out.println("\nContenido de la pila después de desapilar:");
        mostrarPila(pila);


        // Mostrar la cima y longitud nuevamente
        try {
            System.out.println("\nElemento en la cima: " + pila.darElementoCima());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Longitud de la pila: " + pila.darLongitud());


        // Vaciar la pila
        pila.vaciar();
        System.out.println("\nSe realiza un vaciado a la pila.");


        // Verificar si la pila está vacía
        System.out.println("¿La pila está vacía? " + pila.esVacia());

        scanner.close();
    }

    /**
     * Muestra el contenido de la pila sin modificarla.
     */
    public static void mostrarPila(Pila<Integer> pila) {
        try {
            Pila<Integer> aux = new Pila<>();
            while (!pila.esVacia()) {
                int elemento = pila.darElementoCima();
                System.out.print( "| " + elemento + " |" + "\n");
                System.out.println("-----");
                aux.apilar(elemento);
                pila.desapilar();
            }

            // Restaurar la pila original
            while (!aux.esVacia()) {
                pila.apilar(aux.darElementoCima());
                aux.desapilar();
            }
            System.out.println();
        } catch (Exception e) {
            System.out.println("Error al mostrar la pila: " + e.getMessage());
        }
    }
}
