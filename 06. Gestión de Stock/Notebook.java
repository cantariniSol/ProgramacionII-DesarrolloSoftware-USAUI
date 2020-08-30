public class Notebook extends Producto{

    public String tipoProcesador; /* Amd - intel */
    public String usoRecomendado; /* uso Recomendados ejemplos: DISEÑO, GAMING, HOGAR, OFICINA. */
    


    public Notebook(int codigo, String nombre, String marca, int cantidadEnStock, double precio, int faltante, String tipoProcesador, String usoRrecomendado){
        super(codigo, nombre, marca, cantidadEnStock, precio, faltante);
        this.tipoProcesador = tipoProcesador;
        this.usoRecomendado = usoRrecomendado;
    }

    public Notebook(){
        super();
        this.tipoProcesador = " ";
        this.usoRecomendado =" ";
    }

    public String getTipoProcesador(){return tipoProcesador;}
    public void setTipoProcesador(String tipoProcesador){ this.tipoProcesador= tipoProcesador;}
    public String getUsoRecomendado(){return usoRecomendado;}
    public void setUsoRecomendado(String usoRecomendando){ this.usoRecomendado = usoRecomendando;} 


    @Override
    public String toString(){
        
        return super.toString() + "\n*TIPO DE PROCESADOR: " +getTipoProcesador() + "\n*USO RECOMENDADO: " + getUsoRecomendado()+"\n========================\n";
    } 
    
}