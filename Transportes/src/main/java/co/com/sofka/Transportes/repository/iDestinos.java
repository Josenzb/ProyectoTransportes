package co.com.sofka.Transportes.repository;

import co.com.sofka.Transportes.repository.models.Destinos;

import java.util.List;

interface iDestinos {
    public Destinos addDestino(Destinos destino);
    public List<Destinos> getAllDestinos();
    public void updateDestino(Destinos destino);
    public String deleteDestino(long id);
}
