package Figura;


public class Rectangulo extends Figura{

    private float base;
    private float altura;
     //metodo constructor


    public Rectangulo(float base, float altura){
        this.base=base;
        this.altura=altura;
    }
    


    //Getter y Setters metodos accesores
     public float getBase() {
        return base;
    }



    public void setBase(float base) {
        this.base = base;
    }



    public float getAltura() {
        return altura;
    }



    public void setAltura(float altura) {
        this.altura = altura;
    }



    //metodo de la sublcase
    public void calcularArea() {
        float area=base*altura;
        System.out.println("La base del rectangulo digitada por el usuario es es: "+base+" y su altura es: "+
        altura+" y su area multiplicando base por altura es: "+area);

      }



   
}
