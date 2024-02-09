package basura;

public class Main {
    public static void main(String[] args) {
        Producto [] lista = new Producto[100];

        for (int i=0; i<lista.length; i++){
            lista [i] = new Producto("Pro"+i);
        }

        boolean encontrado = false;
        int i = 0;
        String buscado = "Pro"+1;
        while(!encontrado && i<lista.length){
            Producto p = lista[i];

            if(p.getNombre().equals(buscado)){
                encontrado = true;
            }

            i++;
        }
    }
}
