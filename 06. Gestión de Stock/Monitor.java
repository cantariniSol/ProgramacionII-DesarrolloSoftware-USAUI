public class Monitor extends Producto {

    public String tipoPantalla; /* LCD - LED*/
    public int tasaDeRefresco; /* 60 HZ o 120 HZ */
    


    public Monitor(int codigo, String nombre, String marca, int cantidadEnStock, double precio, int faltante, String tipoPantalla, int tasaDeRefresco){
        super(codigo, nombre, marca, cantidadEnStock, precio, faltante);
        this.tipoPantalla = tipoPantalla;
        this.tasaDeRefresco = tasaDeRefresco;
    }
    public Monitor(){
        super();
        this.tipoPantalla = " ";
        this.tasaDeRefresco = 0;
    }

    public String getTipoPantalla(){return tipoPantalla;}
    public void setTipoPantalla(String tipoPantalla){ this.tipoPantalla = tipoPantalla;}
    public int getTasaDeRefresco(){return tasaDeRefresco;}
    public void setTasaDeRefresco(int tasaDeRefresco) { this.tasaDeRefresco = tasaDeRefresco;}


     @Override
    public String toString(){
        return super.toString() + "\n*TIPO DE PANTALLA: " +getTipoPantalla() + "\n*TASA DE REFRESCO: " + getTasaDeRefresco() + " Hz" + "\n========================"; 
    }
       
}