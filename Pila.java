/**
 * @autor Kevin Jair Torres Valencia.
 */

/**
 * Implementación de la estructura Pila.
 * @param <T> - El tipo de elementos de la Pila.
 */
public class Pila<T> {

    /*
    * Unidades básicas de una pila.
    */
    private class NodoPila {
        /* Parámetros */
        public T elemento;
        public NodoPila siguiente;

        /* Métodos */
        /**
         * Construye un NodoPila a partir de un elemento dado.
         * @param elemento - El elemento que contendrá este NodoPila.
         */
        public NodoPila( T elemento ) {
            this.elemento = elemento;
            this.siguiente = null;
        }
    }

    /* Parámetros */
    private NodoPila cima;
    private int longitud;

    /* Métodos */
    /**
     * Crea la Pila vacía.
     */
    public Pila() {
      //Aquí va tu código
    }

    /**
     * Apila un nuevo elemento en esta Pila.
     * @param elemento - El elemento a apilar.
     */
    public void apilar( T elemento ) {
      //Aquí va tu código
    }

    /**
     * Desapila el elemento de la cima de esta Pila.
     * @throws Exception - Si esta Pila es vacía.
     */
    public void desapilar() throws Exception {
      //Aquí va tu código
    }

     /**
     * Devuelve el elemento contenido en la cima de esta Pila.
     * @return La cima de esta Pila.
     * @throws Exception - Si esta Pila es vacía.
     */
    public T darElementoCima() throws Exception {
      //Aquí va tu código
    }

    /**
     * Determina si esta Pila es vacía.
     * @return true si esta Pila es vacía. En caso contrario, false.
     */
    public boolean esVacia() {
      //Aquí va tu código
    }

    /**
     * Devuelve el número de elementos de esta Pila.
     * @return El número de elementos de esta Pila.
     */
    public int darLongitud(){
      //Aquí va tu código
    }

    /**
     * Vacía la pila, eliminando todos sus elementos.
     */
    public void vaciar() {
      //Aquí va tu código
    }
}