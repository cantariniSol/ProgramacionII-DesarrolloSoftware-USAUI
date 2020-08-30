import java.util.ArrayList;

public class ImplementGestionDeStok implements GestionDeStock {

    ArrayList<Producto> productos;

    public ImplementGestionDeStok() {

        productos = new ArrayList<Producto>();

        // Notebook.
        productos.add(new Notebook(888, "Notebook LaMasMejor", "Asus", 15, 65900.00, 10, "Intel", "Diseño"));
        productos.add(new Notebook(333, "Notebook Potentasa", "HP", 15, 150000.00, 10, "Intel", "Home"));

        // Monitores.
        productos.add(new Monitor(111, "Monitor Max", "Samsung", 20, 5500.00, 10, "LED", 120));
        productos.add(new Monitor(222, "Monitor Flash", "Dell", 5, 3600.00, 10, "LCD", 60));

        // Dispositivos de almacenamiento.
        productos.add(new DispositivosDeAlmacenamiento(777, "Disco Duro Durex", "Kingstone", 20, 3050.00, 10,
                "Disco Duro", 1));
        productos.add(new DispositivosDeAlmacenamiento(555, "Disco Externo LaEx", "Samsumg", 12, 4050.00, 10,
                "Disco Externo", 500));

    }

    /* 1.DEVOLVER UN LISTADO CON TODOS LOS PRODUCTOS: */
    @Override
    public ArrayList<Producto> getListadoDeProductos() {
        return productos;
    }

    /* 2.AGREGAR PRODUCTO NUEVO: No funciona */
    @Override
    public boolean agregarProductoNuevo(Producto p) {

        for (Producto pr : productos) {

            if (pr.getCodigo() == p.getCodigo()) {
                return false;

            }
        }

        productos.add(p);

        return true;
    }

    /* 3.BUSCAR PRODUCTO POR CÓDIGO: */
    @Override
    public Producto buscarProductoPorCodigo(int c) {
        Producto aux = null;
        for (Producto p : productos) {
            if (p.getCodigo() == c) {
                aux = p;
            }

        }
        return aux;
    }

    /* 4. DESCONTAR CANTIDAD DE PRODUCTO: */
    @Override
    public boolean descontarCantidadProducto(int c, int can) {
        Producto aux = buscarProductoPorCodigo(c);

        if (aux != null) {
            if (aux.getCantidadEnStock() >= can) {
                aux.setCantidadEnStock(aux.getCantidadEnStock() - can);
                return true;
            }
        }
        return false;
    }

    // /5. DEVOLVER UN LISTADO CON TODOS LOS PRODUCTOS POR TIPO PASADO POR
    // PARÁMETRO:/

    public ArrayList<Producto> listadoDeProductoPorTipo(Class<? extends Producto> tipo) {
        ArrayList<Producto> listaProductoAux = new ArrayList<Producto>();

        for (Producto p : productos) {
            if (tipo == p.getClass()) {
                listaProductoAux.add(p);
            }
        }
        return listaProductoAux;

        // /* demas objects */
        // listadoByProd(Monitor.class);
    }

    /* 6.BUSCAR PRODUCTO/S POR NOMBRE O MARCA: */
    @Override
    public Producto buscarProductoPorNombreoMarca(String n, String mar) {

        for (Producto pr : productos) {
            if (pr.getNombre().equalsIgnoreCase(n) || pr.getMarca().equalsIgnoreCase(mar))
                return pr;
        }

        return null;
    }

    // * 7 . BUSCAR PRODUCTOS POR PRECIO */
    @Override
    public ArrayList<Producto> buscarProductoPorPrecio(double pr, boolean mayorA) {

        ArrayList<Producto> listaProductoaux = new ArrayList<>();

        if (mayorA == true) {
            for (Producto p : productos) {
                if (p.getPrecio() > pr) {

                    listaProductoaux.add(p);
                }

            }
        }

        else if (mayorA == false) {
            for (Producto p : listaProductoaux) {
                if (p.getPrecio() < pr) {
                    listaProductoaux.add(p);
                }

            }
        }
        return listaProductoaux;
    }

    /* 8. BORRAR UN PRODUCTO DEL STOCK */
    @Override
    public boolean borrarProductoStock(int c) {
        Producto aux = buscarProductoPorCodigo(c);
        if (aux != null) {
            if (aux.getCantidadEnStock() == 0) {
                productos.remove(aux);
                System.out.println("Ya no hay mas en stock, producto borrado ");
                return true;
            }

        } 
        System.out.println("Todavía hay stock de este producto, no se puede borrar! ");
        return false;
    }

    /* 9.  AGREGAR CANTIDAD DE PRODUCTO: */
    @Override
    public boolean agregarCantidadProducto(int c, int can) {
        Producto aux = buscarProductoPorCodigo(c);
        if (aux != null) {
            aux.setCantidadEnStock(aux.getCantidadEnStock() + can);
            System.out.println("Se agrego la cantidad de producto correctamente!");
                return true;
            }
            System.out.println("No se agrego ningún producto!");
        return false;
    }

    /* 10. GENERAR ALERTAS POR STOCK POR DEBAJO DEL MÍNIMO INDICADO */ 
    @Override
    public void alertaFaltaStock(Producto pr) {
        for( Producto p : productos){
            if( p.getCantidadEnStock() == pr.getCantidadEnStock() ){
                System.out.println("*ALERTA! ==> El producto: "+ pr.getNombre() + " con código: " + pr.getCodigo() + " tiene un stock de: " + pr.getCantidadEnStock());
            }
        }
    }

}