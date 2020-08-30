public class Vehiculo {
    
    private String color;
    private String marca;
    private int modelo;

    public Vehiculo(){
        this.color =  "Sin definir.";
        this.marca = "Sin definir.";
        this.modelo = 0;
    }

    public Vehiculo(String color, String marca, int modelo){
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getColor(){return color;};
    public void setColor(String color){this.color = color;};
    public String getMarca(){return marca;};
    public void setMarca(String marca){this.marca = marca;};
    public int getModelo(){return modelo;};
    public void setModelo(int modelo){this.modelo = modelo;};

    public void getInfo(){
        System.out.println("_____________INFORMACIÓN______________");
        System.out.println(">Color: " + getColor());
        System.out.println(">Marca: " + getMarca());
        System.out.println(">Modelo: " + getModelo());
    }
}