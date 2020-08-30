public class Main {
    public static void main(String[] args) throws Exception {
        ImplementGestionDeStok gs = new ImplementGestionDeStok();

        /* 1.DEVOLVER UN LISTADO CON TODOS LOS PRODUCTOS: */
       System.out.println(gs.getListadoDeProductos());

        /* 2.AGREGAR PRODUCTO NUEVO: */
       System.out.println( gs.agregarProductoNuevo(new Notebook(111,"Notebook LaMasMejor", "Asus", 15, 65900.00, 10, "Intel", "Diseño")));
        Monitor moni = new Monitor(666, "Monitor La Bestia", "Samsung", 10, 6500.00, 8, "LED", 120);
        System.out.println(gs.agregarProductoNuevo(moni));
        //System.out.println(gs.getListadoDeProductos());

        /* 3.BUSCAR PRODUCTO POR CÓDIGO: */
        System.out.println("*BUSCAR PRODUCTO POR EL CODIGO: 666" +  gs.buscarProductoPorCodigo(666));

         /*  4. DESCONTAR CANTIDAD DE PRODUCTO: */
         System.out.println(gs.descontarCantidadProducto(666, 5));
         
        //5. DEVOLVER UN LISTADO CON TODOS LOS PRODUCTOS POR TIPO PASADO POR PARÁMETRO:/

        System.out.println(gs.listadoDeProductoPorTipo(DispositivosDeAlmacenamiento.class));
         
         /* 6.BUSCAR PRODUCTO/S POR  NOMBRE O MARCA: */
         System.out.println(gs.buscarProductoPorNombreoMarca("Notebook LaMasMejor", "Asus"));


          //* 7 . BUSCAR PRODUCTOS POR PRECIO */
          System.out.println(gs.buscarProductoPorPrecio(1000, true));

          /* 8. BORRAR UN PRODUCTO DEL STOCK */
          System.out.println(gs.borrarProductoStock(555));

          /* 9. AGREGAR CANTIDAD PRODUCTO */ 
          System.out.println(gs.agregarCantidadProducto(888, 10));

          /* 10. GENERAR ALERTAS POR STOCK POR DEBAJO DEL MÍNIMO INDICADO:*/
          gs.alertaFaltaStock(moni);
    }
}