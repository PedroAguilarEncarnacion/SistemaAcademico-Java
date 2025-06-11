
package ec.edu.espoch.sistemaacademico.empleados;

import ec.edu.espoch.sistemaacademico.personasinsitucionales.PersonaInstitucional;



public class Empleado extends PersonaInstitucional{
    
    private double sueldo;

    public Empleado(double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" +super.toString()+ "sueldo=" + sueldo + '}';
    }
    
    
}
