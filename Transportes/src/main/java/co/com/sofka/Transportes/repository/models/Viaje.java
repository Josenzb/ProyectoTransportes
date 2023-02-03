package co.com.sofka.Transportes.repository.models;

import java.time.LocalTime;
import java.util.List;

public class Viaje {

    private int id;
    private LocalTime hora;
    private Destinos destino;
    private Buses bus;

    public Viaje(int id, LocalTime hora, Destinos destino, Buses bus) {
        this.id = id;
        this.hora = hora;
        this.destino = destino;
        this.bus = bus;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
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
}
