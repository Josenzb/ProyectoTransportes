package co.com.sofka.Transportes.repository;

import co.com.sofka.Transportes.repository.models.Destinos;
import co.com.sofka.Transportes.repository.models.Pasajeros;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class PasajerosRepository implements iPasajeros{

    private final AtomicLong idCounter = new AtomicLong();
    private List<Pasajeros> pasajeros = new ArrayList<>();

    public PasajerosRepository(){
        pasajeros.add(crearPasajeroConId(new Pasajeros("Juan Gomez",124564)));
        pasajeros.add(crearPasajeroConId(new Pasajeros("Andrea Celis",124564)));
        pasajeros.add(crearPasajeroConId(new Pasajeros("Camilo Ortiz",124564)));
        pasajeros.add(crearPasajeroConId(new Pasajeros("David Beltran",124564)));
    }

    private Pasajeros crearPasajeroConId(Pasajeros pasajero) {
        pasajero.setId(idCounter.incrementAndGet());
        return pasajero;
    }

    @Override
    public Pasajeros addPasajero(Pasajeros pasajero) {
        pasajero.setId(idCounter.incrementAndGet());
        pasajeros.add(pasajero);
        return pasajero;
    }

    @Override
    public List<Pasajeros> getAllPasajeros() {
        return pasajeros;
    }

    public Pasajeros getPasajeroById(long id) {
        return pasajeros.stream()
                .filter(d -> d.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void updatePasajero(Pasajeros pasajero) {
        pasajeros = pasajeros.stream()
                .map(d -> d.getId() == pasajero.getId() ? pasajero : d)
                .collect(Collectors.toList());
    }

    @Override
    public String deletePasajero(long id) {
        pasajeros = pasajeros.stream()
                .filter(d -> d.getId() != id)
                .collect(Collectors.toList());
        return "Eliminado";
    }
}
