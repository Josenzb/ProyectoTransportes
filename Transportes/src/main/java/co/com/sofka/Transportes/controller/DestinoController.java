package co.com.sofka.Transportes.controller;

import co.com.sofka.Transportes.repository.models.Destinos;
import co.com.sofka.Transportes.service.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/destinos")
public class DestinoController {
    private DestinoService destinoService;

    @Autowired
    public DestinoController(DestinoService destinoService) {
        this.destinoService = destinoService;
    }

    @GetMapping
    public List<Destinos> getAllDestinos() {
        return destinoService.getAllDestinos();
    }

    @GetMapping("/{id}")
    public Destinos getDestinosById(@PathVariable long id) {
        return destinoService.getDestinoById(id);
    }

    @PostMapping
    public Destinos addDestino(@RequestBody Destinos destino) {
        return destinoService.addDestino(destino);
    }

    @PutMapping("/{id}")
    public void updateDestino(@RequestBody Destinos destino, @PathVariable long id) {
        destino.setId(id);
        destinoService.updateDestino(destino);
    }

    @DeleteMapping("/{id}")
    public String deleteDestino(@PathVariable long id) {
        return destinoService.deleteDestino(id);
    }
}
