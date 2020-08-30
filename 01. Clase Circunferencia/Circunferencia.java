
public class Circunferencia {
    
    private double radio = 0;

    public Circunferencia(double radio){
       this.radio = radio;
    };
   /* Usamos siempre public  ya que queremos mostrar  o modificar  desde  fuera de clase */
   public  double getRadio(){return radio;} //  Con el método getSper retornamos el radio.
   public  void setRadio( double radio ) { this.radio = radio;} //Establezco el valor que me mande el usuario. 

   public double CalcularPerimetro(){ double resultado = 0;   resultado = radio * 2 * Math.PI; return resultado;}
   public double CalcularSuperficie(){double resultado = 0; resultado =   Math.PI * Math.sqrt(radio); return resultado;}   
}