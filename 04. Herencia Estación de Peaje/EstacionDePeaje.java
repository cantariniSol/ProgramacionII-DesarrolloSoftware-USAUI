public class EstacionDePeaje{
    private int idPeaje;
    private String nombreEsPeaje;
    private double montoBase;
    private double montoAcumulado;
    private int contVehiculo = 0;

    public EstacionDePeaje(){
        this.idPeaje = 0;
        this.nombreEsPeaje = "Sin definir.";
        this.montoBase = 0;
    }
    public EstacionDePeaje(int idPeaje, String nombre, double montoBase){
            this.idPeaje = idPeaje;
            this.nombreEsPeaje = nombre;
            this.montoBase = montoBase;
    }
    public int getIdPeaje(){return idPeaje;};
    public void setIdPeaje(int idPeaje){this.idPeaje = idPeaje;};
    public String getNombreEsPeaje(){return nombreEsPeaje;};
    public void setNombreEsPeaje(String nombreEsPeaje){this.nombreEsPeaje = nombreEsPeaje;};
    public double getMontoBase(){return montoBase;};
    public void setMontoBase(double montoBase){this.montoBase = montoBase;};
    public int getCantVehiculo(){return contVehiculo;};
    public double getMontoAcumulado(){return montoAcumulado;};
    
    public void ContadorVehiculo(Vehiculo v){
        double montoCobrar = 0;
        contVehiculo++;
        if(v instanceof Auto){
            montoCobrar = montoBase + (montoBase * 10 / 100);
        }
        if(v instanceof Camion){
            montoCobrar = montoBase + (montoBase * 20 / 100);
        }
        if(v instanceof Colectivo){
            montoCobrar = montoBase + (montoBase * 30 / 100);
        }

        if(contVehiculo <= 2){
            montoCobrar -=10;
            montoAcumulado += montoCobrar;
        }

        System.out.println(">Monto cobrado: " + montoCobrar + "\n>Información del Vehiculo: " + v.getInfo());   
    }
}