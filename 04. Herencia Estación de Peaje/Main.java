import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {

        Auto a1 = new Auto("Gris", "Ford", 2019, 5);
        Auto a2 = new Auto("Negro", "Fiat", 2019, 5);
        Auto a3 = new Auto("Rojo", "WV", 2019, 5);
        Camion cn = new Camion("Verde", "WV", 2015, 4300);
        Colectivo co = new Colectivo("Rojo y Gris", "Mercedes", 2018, 30);

        a1.getInfo();
        a2.getInfo();
        a3.getInfo();
        cn.getInfo();
        co.getInfo();

        EstacionDePeaje estacion1 = new EstacionDePeaje(20001010, "Estación de Peaje Carlos Paz-Córdoba", 50);
        
        ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
        lista.add(a1);
        lista.add(a2);
        lista.add(a3);
        lista.add(cn);
        lista.add(co);

        for(int n  = 0; n < lista.size(); n++){
            estacion1.ContadorVehiculo(lista.get(n));
        }
        
        System.out.println("________REPORTE DE ESTACIÓN DE PEAJE________");
        System.out.println(">Estación de peaje ID: " + estacion1.getIdPeaje());
        System.out.println(">Nombre: " + estacion1.getNombreEsPeaje());
        System.out.println(">Cantidad de Vehiculos pasados: " + estacion1.getCantVehiculo());
        System.out.println(">Monto total cobrado: $" + estacion1.getMontoAcumulado());

    }
}
