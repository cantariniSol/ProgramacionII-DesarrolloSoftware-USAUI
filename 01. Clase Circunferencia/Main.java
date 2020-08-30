import java.util.Scanner;
public class Main {
    public static void main(String[] args) { 
        Circunferencia c = new Circunferencia(40);
        System.out.println("El radio de circulo es de: " + c.getRadio());
        System.out.println("La superficie = " + c.CalcularSuperficie());
        System.out.println("El perímetro = " + c.CalcularPerimetro() );

  }
}