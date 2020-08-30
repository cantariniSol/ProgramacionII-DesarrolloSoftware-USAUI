public class Producto {
    /* Esta clase permite gestionar 
    el código - nombre - marca -cantidadEnStock - precios de un producto */
        
    /* Declaramos los atributos: */
        
        private int codigo;
        private String nombre;
        private String marca;
        private int cantidadEnStock = 0;
        private double precio = 0.0;
        private int faltante = 10;
        
        
    
    
    /* Declaramos los constructores para los distintos casos: */
        public Producto ( int codigo, String nombre, String marca, int cantidadEnStock, double precio, int faltante ){
         
         this.codigo = codigo;
         this.nombre = nombre;
         this.marca = marca;
         this.cantidadEnStock = cantidadEnStock;
         this.precio = precio;
         this.faltante = faltante;
        
        }
    
        public Producto ( int codigo, String nombre, String marca){
            
            this.codigo = codigo;
            this.nombre = nombre;
            this.marca = marca;
            
        }
    
        public Producto (){
           
           this.codigo = 0;
           this.nombre = " ";
           this.marca= " ";
           this.cantidadEnStock = 0;
           this.precio = 0.0;
           this.faltante = 3; 
    
        }
    
        public int getCodigo(){ return codigo;}
        public void setCodigo(int codigo){this.codigo = codigo;}
        public String getNombre(){ return nombre;}
        public void setNombre(String nombre ){this.nombre = nombre;}
        public String getMarca(){ return marca;}
        public void setMarca(String marca){this.marca = marca;}
        public int getCantidadEnStock(){ return cantidadEnStock;}
        public void setCantidadEnStock(int cantidadEnStock){this.cantidadEnStock = cantidadEnStock;}
        public double getPrecio(){ return precio;}
        public void setPrecio (double precio){this.precio = precio;}
        public int getFaltante(){ return faltante;}
        public void setFaltante(int faltante){ this.faltante = faltante;}
    
        
        @Override
        public String toString(){
            return "\nNFORMACIÓN DEL PRODUCTO " +"\n========================"+"\n*CODIGO: "+ getCodigo() + "\n*NOMBRE: " + getNombre() +"\n*MARCA: " + getMarca() + "\n*CANTIDAD EN STOCK: " + getCantidadEnStock() + "\n*PRECIO: $"+ getPrecio() + "\n*ALERTAR CUANDO LLEGE A: " + getFaltante()+ " unidades";
            
        }       
    }