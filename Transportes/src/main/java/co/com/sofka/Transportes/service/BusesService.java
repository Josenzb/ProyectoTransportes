package co.com.sofka.Transportes.service;

import co.com.sofka.Transportes.repository.BusesRepository;
import co.com.sofka.Transportes.repository.models.Buses;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusesService {
    private BusesRepository busesRepository;

    public BusesService(){busesRepository = new BusesRepository();}

    public Buses addBus(Buses buses) {
        busesRepository.addBus(buses);
        return buses;
    }

    public List<Buses> getAllBuses() {
        return busesRepository.getAllBuses();
    }

    public Buses getBusById(long id) {
        return busesRepository.getBusById(id);
    }

    public void updateBus(Buses buses) {
        busesRepository.updateBus(buses);
    }

    public String deleteBus(long id) {
        busesRepository.deleteBus(id);
        return "Eliminado";
    }
}
