package Figura;

public class Circulo extends Figura {
    private double radio;
    
     //metodo constructor


    public Circulo(double radio){
        this.radio=radio;
    }
    


    //Getter y Setters metodos accesores
    public double getRadio() {
        return radio;
    }



    public void setRadio(double radio) {
        this.radio = radio;
    }

    //metodo de la sublcase
    public void calcularArea() {
        double area=(radio*radio)*3.14;
        System.out.println("El radio del circulo digitado por el usuario es "+radio+ 
        " y su area al multiplicar radio*radio y despues multiplicarlo por PI (3.14) es: "+area);

      }




}
