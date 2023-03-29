package Juego;

import java.util.Random;
import java.util.Scanner;

public class Piedrapapeltijera implements Juego {

    
//Atributos
private String jugador;
private int opcion;
private int aleatorio;


//Objeto para capturar los datos
Scanner capturar=new Scanner(System.in);

public void iniciar() {
   System.out.println("Ingrese el nombre del jugador");
   jugador=capturar.next();
}


public void jugar() {
    System.out.println(jugador+" Digite su eleccion \n 1. Piedra \n 2. Papel \n 3. Tijera");
    opcion=capturar.nextInt();
    Random random=new Random();
    aleatorio=random.nextInt(3)+1;
    System.out.println("La maquina ha elegido "+random);
}


public void finalizar() {

    if (aleatorio==opcion){
        System.out.println("La maquina ha elegido el mismo que usted, han empatado empatado");
        
    }else if(aleatorio==1 && opcion==2){
        System.out.println("La maquina ha elegido piedra, usted ha ganado");

    }else if(aleatorio==1 && opcion==3){
        System.out.println("La maquina ha elegido piedra, usted ha perdido");

    }else if(aleatorio==2 && opcion==1){
        System.out.println("La maquina ha elegido papel, usted ha perdido");

    }else if(aleatorio==2 && opcion==3){
        System.out.println("La maquina ha elegido papel, usted ha ganado");

    }else if(aleatorio==3 && opcion==1){
        System.out.println("La maquina ha elegido tijera, usted ha ganado");
  
    }else if(aleatorio==3 && opcion==2){
        System.out.println("La maquina ha elegido tijera, usted ha perdido");

    }else{
        System.out.println("El numero digitado no es valido");
    }



    capturar.close();

}
    
}
