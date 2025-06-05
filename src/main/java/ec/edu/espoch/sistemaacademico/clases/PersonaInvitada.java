
package ec.edu.espoch.sistemaacademico.clases;

public class PersonaInvitada extends Persona{

    //CONSTRUCTOR
    
    public PersonaInvitada(int id, String nombre, String correoPersonal, String cedula){    
        super(id, nombre, correoPersonal, cedula);
    }

    //MÉTODO
    public String agregarPersonaInvitada() {
        return "";
    }

    @Override
    public String toString() {
        return "PersonaInvitada{" +super.toString()+ '}';
    }
    
    
    
    
}
