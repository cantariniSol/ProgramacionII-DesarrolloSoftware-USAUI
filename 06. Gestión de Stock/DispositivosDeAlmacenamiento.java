public class DispositivosDeAlmacenamiento extends Producto{

    public String tipoDisco; /* Disco duro - Disco Externo - Disco SSD */
     public int cantidadAlmacenamiento; /* 500 GB , 1TB , 2 TB */
    


    public DispositivosDeAlmacenamiento(){
      super();
      this.tipoDisco = " ";
      this.cantidadAlmacenamiento = 0;
    }

    public DispositivosDeAlmacenamiento(int codigo, String nombre, String marca, int cantidadEnStock, double precio, int faltante, String tipoDisco, int cantidadAlmacenamiento){
      super(codigo, nombre, marca, cantidadEnStock, precio, faltante);   
      this.tipoDisco = tipoDisco;
      this.cantidadAlmacenamiento = cantidadAlmacenamiento;
    }

    public String getTipoDisco(){return tipoDisco;}
    public void setTipoDisco(String tipoDisco){ this.tipoDisco = tipoDisco;}
    public int getCantidadAlmacenamiento(){ return cantidadAlmacenamiento;}
    public void setCantidadAlmacenamiento(int cantidadAlmacenamiento) { this.cantidadAlmacenamiento = cantidadAlmacenamiento;}



   @Override
    public String toString(){
        return super.toString() + "\n*TIPO DE DISCO: " + getTipoDisco() + "\n*CANTIDAD DE ALMACENAMIENTO: " + getCantidadEnStock()+"\n========================";
    }
       

}