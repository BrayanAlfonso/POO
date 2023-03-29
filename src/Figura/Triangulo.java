package Figura;

public class Triangulo extends Figura {
    private float baseTri;
    private float alturaTri;
     //metodo constructor


    public Triangulo(float baseTri, float alturaTri){
        this.baseTri=baseTri;
        this.alturaTri=alturaTri;
    }
    


    //Getter y Setters metodos accesores
    public float getBaseTri() {
        return baseTri;
    }



    public void setBaseTri(float baseTri) {
        this.baseTri = baseTri;
    }



    public float getAlturaTri() {
        return alturaTri;
    }



    public void setAlturaTri(float alturaTri) {
        this.alturaTri = alturaTri;
    }
 

    //metodo de la sublcase
    public void calcularArea() {
        float area=(baseTri*alturaTri)/2;
        System.out.println("La base del triangulo digitada por el usuario es: "+baseTri+" y su altura es: "+
        alturaTri+" y su area multiplicando su base por altura y despues dividir ese resultado en 2 es: "+area);

      }



    





}
