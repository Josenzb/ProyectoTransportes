package co.com.sofka.Transportes.service;


import co.com.sofka.Transportes.repository.PasajerosRepository;
import co.com.sofka.Transportes.repository.models.Pasajeros;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasajeroService {
    private PasajerosRepository pasajerosRepository;

    public PasajeroService() {
        pasajerosRepository = new PasajerosRepository();
    }

    public Pasajeros addPasajero(Pasajeros pasajero) {
        pasajerosRepository.addPasajero(pasajero);
        return pasajero;
    }

    public List<Pasajeros> getAllPasajeros() {
        return pasajerosRepository.getAllPasajeros();
    }

    public Pasajeros getPasajeroById(long id) {
        return pasajerosRepository.getPasajeroById(id);
    }

    public void updatePasajero(Pasajeros destino) {
        pasajerosRepository.updatePasajero(destino);
    }

    public String deletePasajero(long id) {
        pasajerosRepository.deletePasajero(id);
        return "Eliminado";
    }
}
