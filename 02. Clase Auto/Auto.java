public class Auto {
    
    private String color;
    private String marca;
    private int modelo;

    public Auto( String color, String marca, int modelo){
       this.color = color;
       this.marca = marca;
       this.modelo = modelo;
    }

    public Auto(){
        this.color = "Sin definir";
        this.marca = "Sin definir";
        this.modelo = 0;
    }

    public String getColor(){return color;};
    public void setColor(String color){ this.color = color;};
    public String getMarca(){return marca;};
    public void setMarca(String marca){ this.marca = marca;};
    public int getModelo(){ return modelo;};
    public void setModelo(int modelo){ this.modelo = modelo;};

    public void getInfo(){
        System.out.println("________INFORMACIÓN_________");
        System.out.println(">Color: " + getColor());
        System.out.println(">Marca: " + getMarca());
        System.out.println(">Modelo: " + getModelo());
    }
}