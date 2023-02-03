package co.com.sofka.Transportes.service;

import co.com.sofka.Transportes.repository.BusesRepository;
import co.com.sofka.Transportes.repository.DestinoRepository;
import co.com.sofka.Transportes.repository.PasajerosRepository;
import co.com.sofka.Transportes.repository.models.Buses;
import co.com.sofka.Transportes.repository.models.Destinos;
import co.com.sofka.Transportes.repository.models.Pasajeros;
import co.com.sofka.Transportes.repository.models.Viaje;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ViajeService {
    private List<Viaje> viajes = new ArrayList<>();
    DestinoRepository destinoRepository = new DestinoRepository();
    BusesRepository busesRepository = new BusesRepository();
    PasajerosRepository pasajerosRepository = new PasajerosRepository();


    public Viaje create(String hora, long destinoId, long busId) {
        Destinos destino = destinoRepository.getDestinoById(destinoId);
        Buses bus = busesRepository.getBusById(busId);
        long id = viajes.size() + 1;
        Viaje viaje = new Viaje(id, hora, destino, bus);
        viajes.add(viaje);
        return viaje;
    }

    public List<Viaje> findAll(){
        return viajes;
    }

    public Viaje addPassengers(long viajeId, List<Long> pasajerosId) {
        Viaje viaje = viajes.stream()
                .filter(v -> v.getId() == viajeId)
                .findFirst()
                .orElse(null);

        if (viaje == null) {
            return null;
        }
        List<Pasajeros> pasajeros = pasajerosId.stream()
                .map(pasajerosRepository::getPasajeroById)
                .collect(Collectors.toList());

        viaje.setPasajeros(pasajeros);
        return viaje;
    }

}
