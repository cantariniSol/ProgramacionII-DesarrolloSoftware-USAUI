import java.util.ArrayList;

public interface GestionDeStock {
    /*1. DEVOLVER UN LISTADO CON TODOS LOS PRODUCTOS: devuelve un listado con todos los productos en stock. */
    ArrayList<Producto>getListadoDeProductos();

    /* 2.AGREGAR PRODUCTO NUEVO: El método debe permitir agregar un producto al stock Recibe un objeto producto por parámetro y lo agrega stock. Si el producto ya existía (chequea por código) no se puede agregar y el método devuelve false. Si el producto no existía es correctamente agregado y devuelve true. */
    boolean agregarProductoNuevo(Producto p);

    /* 3.BUSCAR PRODUCTO POR CÓDIGO: El método debe verificar si el código de producto existe en stock. Si existe debe devolver el producto. El producto será identificado unívocamente por su código (es decir, no pueden existir dos productos con el mismo código). */
    Producto buscarProductoPorCodigo(int c);
  
  /* 4. DESCONTAR CANTIDAD DE PRODUCTO: El método descuenta una cantidad de producto pasada por parámetro al stock actual del producto. Recibe el código del producto y la cantidad a descontar por parámetro. El método no debe permitir descontar si no hay stock suficiente para la cantidad indicada por parámetro. Devuelve true si ha podido descontar y false en caso contrario. */
    boolean descontarCantidadProducto(int c, int can);

/* 5.DEVOLVER UN LISTADO CON TODOS LOS PRODUCTOS POR TIPO PASADO POR PARÁMETRO: por ejemplo tipo “notebook”, tipo “monitor”; devuelve un listado de productos filtrado por el parámetro recibido.
 */
    ArrayList<Producto> listadoDeProductoPorTipo( Class<? extends Producto> tipo);

    /* 6.BUSCAR PRODUCTO/S POR  NOMBRE O MARCA: */
    Producto buscarProductoPorNombreoMarca(String n, String mar);

     

    //* 7 . BUSCAR PRODUCTOS POR PRECIO */
    ArrayList<Producto> buscarProductoPorPrecio(double pr, boolean mayorA);

    /* 8. BORRAR UN PRODUCTO DEL STOCK: Borrar un producto cuyo código es pasado por parámetro del stock, solo se permite borrar el producto si el stock actual es cero. Devuelve true si se pudo borrar, false en caso contrario.
 */ boolean borrarProductoStock(int c);

  /* 9.  AGREGAR CANTIDAD DE PRODUCTO: El método recibe un código de producto y una cantidad a sumar. Busca el producto y si lo encuentra le suma la cantidad recibida por parámetro al stock. Devuelve: true si ha podido agregar, false en caso contrario
  /*/

  boolean agregarCantidadProducto(int c, int can);

/* 
   10. GENERAR ALERTAS POR STOCK POR DEBAJO DEL MÍNIMO INDICADO: Este método se se encargará de revisar el atributo de reposición del producto y comparar con la cantidad actual. Si la cantidad actual es menor hará un system.out indicando la situación y la cantidad faltante */
   void alertaFaltaStock(Producto pr);
  
    }