package co.com.sofka.Transportes.controller;

import co.com.sofka.Transportes.repository.models.Viaje;
import co.com.sofka.Transportes.service.ViajeService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.List;

@RestController
@RequestMapping("/viajes")
public class ViajeController {
    private ViajeService service = new ViajeService();

    @PostMapping("/destinoId/{destinoId}/busId/{busId}")
    public Viaje create(@RequestBody String hora, @PathVariable long destinoId, @PathVariable long busId) {
        return service.create(hora, destinoId, busId);
    }

    @GetMapping
    public List<Viaje> findAll(){
        return service.findAll();
    }

}



