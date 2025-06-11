package ec.edu.espoch.sistemaacademico.personasinsitucionales;

import ec.edu.espoch.sistemaacademico.personas.Persona;

public class PersonaInstitucional extends Persona{
    
    //atributos
    private String correoInstitucional;
    
    //

    public PersonaInstitucional(String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(id, nombre, correoPersonal, cedula);
        this.correoInstitucional = correoInstitucional;
    }


    @Override
    public String toString() {
        return "PersonaInstitucional{" +super.toString()+ "correoInstitucional=" + correoInstitucional +'}';
    }

}
