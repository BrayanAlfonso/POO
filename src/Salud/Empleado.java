package Salud;



public class Empleado  extends Persona {
    

    private String cargo;
    private double valorHora;
    private int horasTrabajadas;
    private int departamento;
    

public Empleado(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura,
            int edad, String sexo, String cargo, double valorHora, int horasTrabajadas, int departamento) {
        super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }

    
public String getCargo() {
    return cargo;
}


public void setCargo(String cargo) {
    this.cargo = cargo;
}


public double getValorHora() {
    return valorHora;
}


public void setValorHora(double valorHora) {
    this.valorHora = valorHora;
}


public int getHorasTrabajadas() {
    return horasTrabajadas;
}


public void setHorasTrabajadas(int horasTrabajadas) {
    this.horasTrabajadas = horasTrabajadas;
}


public int getDepartamento() {
    return departamento;
}


public void setDepartamento(int departamento) {
    this.departamento = departamento;
}


public void calcularHonorarios() {
    double reteica;
    double honorarios=valorHora*horasTrabajadas;
    reteica=(0.966);
    honorarios=(honorarios-reteica);
    System.out.println("El total a pagar debe  ser: "+honorarios);

    System.out.println("");
   } 

   public void mostrarEmpleado() {
    System.out.println("Al empleado "+getNombre()+" " + getApellido()+" con tipo de documento "+getTipoDoc()+" numero "+getDocumento()+ 
    " en el cargo de "+cargo+" trabaja un total  de"+horasTrabajadas+" horas con un valor por hora de "+valorHora);
   }
  

}
