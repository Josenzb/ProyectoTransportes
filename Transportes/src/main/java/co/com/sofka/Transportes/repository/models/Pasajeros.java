package co.com.sofka.Transportes.repository.models;

public class Pasajeros {
    private String nombre;
    private int cedula;

    public Pasajeros(){}

    public Pasajeros(String nombre, int cedula){
        this.nombre = nombre;
        this.cedula = cedula;
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
