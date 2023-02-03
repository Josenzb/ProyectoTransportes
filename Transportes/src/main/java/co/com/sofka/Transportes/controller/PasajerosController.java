package co.com.sofka.Transportes.controller;


import co.com.sofka.Transportes.repository.models.Pasajeros;
import co.com.sofka.Transportes.service.PasajeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pasajeros")
public class PasajerosController {

    private PasajeroService pasajeroService;

    @Autowired
    public PasajerosController(PasajeroService pasajeroService) {
        this.pasajeroService = pasajeroService;
    }

    @GetMapping
    public List<Pasajeros> getAllPasajeros() {
        return pasajeroService.getAllPasajeros();
    }

    @GetMapping("/{id}")
    public Pasajeros getPasajeroById(@PathVariable long id) {
        return pasajeroService.getPasajeroById(id);
    }

    @PostMapping
    public Pasajeros addPasajero(@RequestBody Pasajeros pasajero) {
        return pasajeroService.addPasajero(pasajero);
    }

    @PutMapping("/{id}")
    public void updatePasajero(@RequestBody Pasajeros pasajero, @PathVariable long id) {
        pasajero.setId(id);
        pasajeroService.updatePasajero(pasajero);
    }

    @DeleteMapping("/{id}")
    public String deletePasajero(@PathVariable long id) {
        return pasajeroService.deletePasajero(id);
    }
}
