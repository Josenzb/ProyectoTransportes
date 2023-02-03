package co.com.sofka.Transportes.repository;

import co.com.sofka.Transportes.repository.models.Destinos;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

public class DestinoRepository implements iDestinos{

    private final AtomicLong idCounter = new AtomicLong();
    private List<Destinos> destinos = new ArrayList<>();

    public DestinoRepository(){
        destinos.add(crearDestinoConId(new Destinos("chiquinquira", "Boyaca")));
        destinos.add(crearDestinoConId(new Destinos("Cartagena", "Bolivar")));
        destinos.add(crearDestinoConId(new Destinos("Bucaramanga", "Santander")));
        destinos.add(crearDestinoConId(new Destinos("Medellin", "Antioquia")));
        destinos.add(crearDestinoConId(new Destinos("Cali", "Valle del cauca")));
    }

    private Destinos crearDestinoConId(Destinos destino) {
        destino.setId(idCounter.incrementAndGet());
        return destino;
    }

    @Override
    public Destinos addDestino(Destinos destino) {
        destino.setId(idCounter.incrementAndGet());
        destinos.add(destino);
        return destino;
    }

    @Override
    public List<Destinos> getAllDestinos() {
        return destinos;
    }

    public Destinos getDestinoById(long id) {
        return destinos.stream()
                .filter(d -> d.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void updateDestino(Destinos destino) {
        destinos = destinos.stream()
                .map(d -> d.getId() == destino.getId() ? destino : d)
                .collect(Collectors.toList());
    }

    @Override
    public String deleteDestino(long id) {
        destinos = destinos.stream()
                .filter(d -> d.getId() != id)
                .collect(Collectors.toList());
        return "Eliminado";
    }
}
