package co.com.sofka.Transportes.repository.models;

public class Buses {
    private long id;
    private String placa;
    private int capacidad;

    public Buses() {
    }

    public Buses(String placa, int capacidad) {
        this.placa = placa;
        this.capacidad = capacidad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
