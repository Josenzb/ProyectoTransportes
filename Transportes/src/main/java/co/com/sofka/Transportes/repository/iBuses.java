package co.com.sofka.Transportes.repository;

import co.com.sofka.Transportes.repository.models.Buses;


import java.util.List;

interface iBuses {
    public Buses addBus(Buses buses);
    public List<Buses> getAllBuses();
    public void updateBus(Buses buses);
    public String deleteBus(long id);
}
