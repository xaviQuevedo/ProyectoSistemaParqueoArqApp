package ec.edu.utpl.backend_parqueaderos.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gestor")
public class Gestor {
    
    @Id
    @Column(name = "id_gestor")
    private int idGestor;
    
    private String nombres;
    private String apellidos;
    private String telefono;
    private String usuario;
    private String contrasena;

    public int getIdGestor() {
        return idGestor;
    }

    public void setIdGestor(int idGestor) {
        this.idGestor = idGestor;
    }

    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    
    @Override
    public String toString() {
        return "Gestor{" + "idGestor=" + idGestor + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono + ", usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }

}
