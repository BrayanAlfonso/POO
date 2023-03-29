package Figura;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        
         String opcion;
         do{
            Scanner capturar=new Scanner(System.in);
            System.out.println("Digite el numero para la figura a la cual le quiere calcular el area \n ++");
            int figura=capturar.nextInt();

        if(figura==1){
            System.out.println("Digite el valor del lado del cuadrado");
             float lado=capturar.nextFloat();
   
   
            //crear el objeto de la subclase cuadrado
            Cuadrado c1=new Cuadrado(lado);
            c1.calcularArea();
        }else if(figura==2){
            
         System.out.println("Digite el valor de la base del rectangulo");
          float base=capturar.nextFloat();

         System.out.println("Digite el valor de la altura del rectangulo");
         float altura=capturar.nextFloat();

          //crear el objeto de la subclase rectangulo
          Rectangulo r1=new Rectangulo(base,altura);
          r1.calcularArea();
        }else if(figura==3){
            System.out.println("Digite el valor de la base del triangulo");
            float baseTri=capturar.nextFloat();
   
            System.out.println("Digite el valor de la altura del triangulo");
            float alturaTri=capturar.nextFloat();
   
             //crear el objeto de la subclase triangulo
             Triangulo t1=new Triangulo(baseTri,alturaTri);
             t1.calcularArea();
        }else if(figura==4){
            System.out.println("Digite el valor del radio del circulo");
            float radio=capturar.nextFloat();
   
             //crear el objeto de la subclase circulo
             Circulo ci1=new Circulo(radio);
             ci1.calcularArea();
 

        }else{
            System.out.println("Ha ingresado un numero invalido");
        }
        
        System.out.println("Desea calcular el area de otra figura?");
        opcion=capturar.next();

        capturar.close();

        } while(opcion.equals("si"));
            


         
    }
}
