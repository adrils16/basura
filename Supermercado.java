package basura;

public class Supermercado {
    private Producto [] lista = new Producto[100];
    private int numProductos = 0;
    /**
     * Busca en la lista un producto por su nombre
     * @param nombre
     * @return posicion del elemento o -1 si no lo encuentra
     */
    public int buscar(String nombre){
        int pos = -1;

        return pos;
    }

    public void add(Producto p){
        lista[numProductos] = p;
        numProductos++;
    }
}
