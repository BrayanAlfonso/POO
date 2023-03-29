package Principal;
import Salud.Persona;
import Salud.Empleado;
import java.util.Scanner;



public class Inicio {
    public static void main(String[] args) {
        double peso, pesoActual,estatura;
        


        Scanner capturar=new Scanner(System.in);
        
        //Creamos objeto en la clase Persona

       Persona brayan=new Persona();

        //Invoco metodos

        System.out.println("Ingrese la peso de la persona");
        peso=capturar.nextDouble();
        System.out.println("Ingrese el estatura de la persona");
        estatura=capturar.nextDouble();
        

        brayan.pedirDatos();

        brayan.mostrarPersona();

        /*brayan.calcularImc();*/

        brayan.mayorEdad(); 
        
        
        
        
        //Recuerde pesoActual es un parametro de salida porque es quien retorna. (importa)
        pesoActual=brayan.calcularImc(peso, estatura);
        
        if(pesoActual<20){
            System.out.println("PESOBAJO");
        }else if(pesoActual>=20 & pesoActual<=25){
            System.out.println("PESOIDEAL");
        }else if(pesoActual>25){
            System.out.println("SOBREPESO");
        }else{
            System.out.println("No se ha podido realizar la operacion");
        }
    
        



        
        String cargo;
        double valorHora;
        int horasTrabajadas,departamento;
        
        System.out.println("Ingrese su cargo");
        cargo=capturar.next();

        System.out.println("ingrese su departamento");
        departamento=capturar.nextInt();

        System.out.println("Ingrese el valor por hora que trabaja");
        valorHora=capturar.nextDouble();

        System.out.println("Ingrese las horas trabajadas");
        horasTrabajadas=capturar.nextInt();
        
        Empleado obj=new Empleado(brayan.getTipoDoc(),brayan.getDocumento(),brayan.getNombre(),brayan.getApellido(),
        brayan.getPeso(),brayan.getEstatura(),brayan.getEdad(),brayan.getSexo(),cargo, valorHora, horasTrabajadas, departamento);
        
        obj.mostrarEmpleado();
        obj.calcularHonorarios();
        
    }
}
