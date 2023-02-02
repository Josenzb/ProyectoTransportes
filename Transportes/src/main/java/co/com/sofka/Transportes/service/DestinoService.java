package co.com.sofka.Transportes.service;

import co.com.sofka.Transportes.repository.DestinoRepository;
import co.com.sofka.Transportes.repository.models.Destinos;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DestinoService {
    private DestinoRepository destinoRepository;

    public DestinoService() {
        destinoRepository = new DestinoRepository();
    }

    public Destinos addDestino(Destinos destino) {
        destinoRepository.addDestino(destino);
        return destino;
    }

    public List<Destinos> getAllDestinos() {
        return destinoRepository.getAllDestinos();
    }

    public Destinos getDestinoById(long id) {
        return destinoRepository.getDestinoById(id);
    }

    public void updateDestino(Destinos destino) {
        destinoRepository.updateDestino(destino);
    }

    public String deleteDestino(long id) {
        destinoRepository.deleteDestino(id);
        return "Eliminado";
    }
}

