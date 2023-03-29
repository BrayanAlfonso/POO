package Figura;


public class Cuadrado extends Figura {
    private float lado;

    //metodo constructor

    public Cuadrado (float lado){
        this.lado=lado;
    }
    
    


    //Getter y Setters metodos accesores
    public float getLado() {
        return lado;
    }


    public void setLado(float lado) {
        this.lado = lado;
    }

    
    //metodo de la sublcase
    public void calcularArea() {
        float area=lado*lado;
        System.out.println("El valor lado del cuadrado digitado por el usuario es: "+lado+" y su area al multiplicar lado*lado es: "+area);
      }
}
