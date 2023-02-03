package co.com.sofka.Transportes.repository;

import co.com.sofka.Transportes.repository.models.Destinos;
import co.com.sofka.Transportes.repository.models.Pasajeros;

import java.util.List;

public interface iPasajeros {
    public Pasajeros addPasajero(Pasajeros pasajero);
    public List<Pasajeros> getAllPasajeros();
    public void updatePasajero(Pasajeros pasajero);
    public String deletePasajero(long id);
}
