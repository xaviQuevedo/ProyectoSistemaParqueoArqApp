package ec.edu.utpl.backend_parqueaderos.entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

public class Parqueadero {

    @Id
    @Column(name = "id_parqueaderos")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idParqueadero;
            
    private String nombre;
    private String direccion;
    private double longitud;
    private double latitud;
    private double costo;
    
    @OneToOne
    private Gestor gestor;
    
    @OneToMany(cascade = CascadeType.ALL)
    private List<Espacio> espacios;

    public Parqueadero() {
    }

    
    public Parqueadero(String Nombre, String direccion, double longitud, double latitud, double costo) {
        this.nombre = Nombre;
        this.direccion = direccion;
        this.longitud = longitud;
        this.latitud = latitud;
        this.costo = costo;
    }
   

    public void setNombre(String nombre) {
        nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

}
