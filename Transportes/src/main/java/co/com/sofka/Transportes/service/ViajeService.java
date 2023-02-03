package co.com.sofka.Transportes.service;

import co.com.sofka.Transportes.repository.BusesRepository;
import co.com.sofka.Transportes.repository.DestinoRepository;
import co.com.sofka.Transportes.repository.models.Buses;
import co.com.sofka.Transportes.repository.models.Destinos;
import co.com.sofka.Transportes.repository.models.Pasajeros;
import co.com.sofka.Transportes.repository.models.Viaje;


import java.util.ArrayList;
import java.util.List;

public class ViajeService {
    private List<Viaje> viajes = new ArrayList<>();
    DestinoRepository destinoRepository = new DestinoRepository();
    BusesRepository busesRepository = new BusesRepository();

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
}
