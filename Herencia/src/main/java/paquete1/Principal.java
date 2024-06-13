
package paquete1;

public class Principal {
    public static void main(String[]args){
        
        Estudiante estudiante = new Estudiante(123,3.5f,"Zamir","Pabon",18);
        Estudiante estudiante2= new Estudiante(345,4.5f,"Kevin","Delgado",19);
        
        estudiante.mostrarDatos();
        System.out.println("");
        estudiante2.mostrarDatos();
    }
}
