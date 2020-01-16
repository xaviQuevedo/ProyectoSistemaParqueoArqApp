package entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Persona {
    @Id
    private String ID;
    private String nombres;
    private String apellidos;
    private String correo;

    public Persona() {
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
