package co.com.sofka.Transportes.repository;

import co.com.sofka.Transportes.repository.models.Buses;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class BusesRepository implements iBuses{

    private final AtomicLong idCounter = new AtomicLong();
    private List<Buses> buses = new ArrayList<>();

    public BusesRepository(){
        buses.add(crearbusConId(new Buses("bcn321",30)));
        buses.add(crearbusConId(new Buses("abx321",30)));
        buses.add(crearbusConId(new Buses("zxc321",30)));
        buses.add(crearbusConId(new Buses("mnb321",30)));
    }

    private Buses crearbusConId(Buses buses) {
        buses.setId(idCounter.incrementAndGet());
        return buses;
    }

    @Override
    public Buses addBus(Buses bus) {
        bus.setId(idCounter.incrementAndGet());
        buses.add(bus);
        return bus;
    }

    @Override
    public List<Buses> getAllBuses() {
        return buses;
    }

    public Buses getBusById(long id) {
        return buses.stream()
                .filter(d -> d.getId() == id)
                .findFirst()
                .orElse(null);
    }


    @Override
    public void updateBus(Buses bus) {
        buses = buses.stream()
                .map(d -> d.getId() == bus.getId() ? bus : d)
                .collect(Collectors.toList());
    }

    @Override
    public String deleteBus(long id) {
        buses = buses.stream()
                .filter(d -> d.getId() != id)
                .collect(Collectors.toList());
        return "Eliminado";
    }
}
