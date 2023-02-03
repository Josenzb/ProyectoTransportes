package co.com.sofka.Transportes.controller;

import co.com.sofka.Transportes.repository.models.Buses;
import co.com.sofka.Transportes.service.BusesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/buses")
public class BusController {
    private BusesService busesService;

    @Autowired
    public BusController(BusesService busesService) {
        this.busesService = busesService;
    }

    @GetMapping
    public List<Buses> getAllBuses() {
        return busesService.getAllBuses();
    }

    @GetMapping("/{id}")
    public Buses getBusById(@PathVariable long id) {
        return busesService.getBusById(id);
    }

    @PostMapping
    public Buses addBus(@RequestBody Buses buses) {
        return busesService.addBus(buses);
    }

    @PutMapping("/{id}")
    public void updateBus(@RequestBody Buses buses, @PathVariable long id) {
        buses.setId(id);
        busesService.updateBus(buses);
    }

    @DeleteMapping("/{id}")
    public String deleteBus(@PathVariable long id) {
        return busesService.deleteBus(id);
    }
}
