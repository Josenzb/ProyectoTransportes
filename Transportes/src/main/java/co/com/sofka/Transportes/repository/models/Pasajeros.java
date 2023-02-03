package co.com.sofka.Transportes.repository.models;

public class Pasajeros {

    private long id;
    private String nombre;
    private int cedula;

    public Pasajeros(){}

    public Pasajeros(String nombre, int cedula){
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
