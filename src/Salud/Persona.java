package Salud;

import java.util.Scanner;

public class Persona {
    //Defino los atributos
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;

    //Metodo vacio

    public Persona(){
        
    }



    
    
    //Metodo constructor
    public Persona(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura,
            int edad, String sexo) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.estatura = estatura;
        this.edad = edad;
        this.sexo = sexo;
    }

     //Métodos getters y setters
    public String getTipoDoc() {
        return tipoDoc;
    }

    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    //Defino metodos
    public void pedirDatos(){
        Scanner captura= new Scanner(System.in);

        System.out.println("Ingrese su tipo de documento");
        tipoDoc=captura.next();

        System.out.println("Ingrese su documento");
        documento=captura.nextInt();

        System.out.println("Ingrese su nombre");
        nombre=captura.next();

        System.out.println("Ingrese su apellido");
        apellido=captura.next();

        /*System.out.println("Ingrese su peso");
        peso=captura.nextDouble();

        System.out.println("Ingrese su estatura");
        estatura=captura.nextDouble();*/

        System.out.println("Ingrese su edad");
        edad=captura.nextInt();

        System.out.println("Ingrese su sexo");
        sexo=captura.next();
        
    }

   

    public void mostrarPersona(){
        System.out.println("La persona registrada ha sido "+nombre+" "+apellido);
        System.out.println("Con tipo de documento "+tipoDoc+" numero "+documento);
       /* System.out.println("Con un peso de"+peso+" y con una estatura de "+estatura); */
        System.out.println("Tiene "+edad+" años");
        System.out.println("Y su sexo es "+sexo);
    }

    /*public void calcularImc(){
        double pesoActual=peso/(estatura*estatura);
        if(pesoActual<20){
            System.out.println("el peso esta por debajo de lo ideal");
        }else if(pesoActual>=20 & pesoActual<=25){
            System.out.println("El peso es ideal");
        }else{
            System.out.println("Tiene  sobre peso");
        }
    }*/

    public double calcularImc(double peso, double estatura){
        double pesoActual=peso/(estatura*estatura);
        System.out.println("Su imc es: "+pesoActual);
        return pesoActual;
    }

    public void mayorEdad(){
        if(edad>18){
            System.out.println(nombre+" es mayor de edad");
        }else{
            System.out.println(nombre+ " no es mayor de edad");
        }
        
    }
}

