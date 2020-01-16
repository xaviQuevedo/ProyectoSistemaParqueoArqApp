package entities;

import java.util.List;

public class Parqueadero {

    private String Nombre;
    private String direccion;
    private float longitud;
    private float latitud;
    private Gestor gestor;
    private List<Espacio> espacios;
    private int num_espacios;

    public void setNombre(String nombre) {
        Nombre = nombre;
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

    public void setEspacios(List<Espacio> espacios) {
        this.espacios = espacios;
        setNum_espacios(espacios.size());
    }

    public void setNum_espacios(int num_espacios) {
        this.num_espacios = num_espacios;
    }
}
