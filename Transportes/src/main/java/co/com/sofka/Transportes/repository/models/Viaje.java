package co.com.sofka.Transportes.repository.models;


import java.util.ArrayList;
import java.util.List;

public class Viaje {

    private long id;
    private String hora;
    private Destinos destino;
    private Buses bus;
    private List<Pasajeros> pasajeros;


    public Viaje(long id, String hora, Destinos destino, Buses bus) {
        this.id = id;
        this.hora = hora;
        this.destino = destino;
        this.bus = bus;
        this.pasajeros = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Destinos getDestino() {
        return destino;
    }

    public void setDestino(Destinos destino) {
        this.destino = destino;
    }

    public Buses getBus() {
        return bus;
    }

    public void setBus(Buses bus) {
        this.bus = bus;
    }

    public List<Pasajeros> getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(List<Pasajeros> pasajeros) {
        this.pasajeros = pasajeros;
    }
}
