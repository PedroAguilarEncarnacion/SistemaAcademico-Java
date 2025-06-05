

package ec.edu.espoch.sistemaacademico;

import ec.edu.espoch.sistemaacademico.clases.Persona;
import ec.edu.espoch.sistemaacademico.clases.*;

public class SistemaAcademico {

    public static void main(String[] args) {
        
        System.out.println("DATOS DEL OBJETO PERSONA");
        Persona persona= new Persona(1, "Pedro Aguilar-Encarnación", "pedro_stalyn@hotmail.com", "2100485933");
        System.out.println(persona.toString());
        
        System.out.println("\nDATOS DEL OBJETO PERSONA INVITADA");
        PersonaInvitada personaInvitada=new PersonaInvitada(2, "Jennifer Romero", "jenidiana17@hotmail.com", "2100485965");
        System.out.println(personaInvitada.toString());
        
         System.out.println("\nDATOS DEL OBJETO PERSONA INSTITUCIONAL");
         PersonaInstitucional personaInstitucional= new PersonaInstitucional("sofia.lujan@espoch.edu.ec", 3, "Sofia Lujan", "a12@gmail.com", "1726127789");
         System.out.println(personaInstitucional.toString());
    }
}
