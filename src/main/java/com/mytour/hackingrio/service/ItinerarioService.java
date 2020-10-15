package com.mytour.hackingrio.service;

import com.mytour.hackingrio.domain.*;
import com.mytour.hackingrio.repository.ItinerarioRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class ItinerarioService {

    private ItinerarioRepository itinerarioRepository;

    public ItinerarioService(ItinerarioRepository itinerarioRepository) {
        this.itinerarioRepository = itinerarioRepository;
    }

    public Itinerario salvar(Itinerario itinerario){
        return itinerarioRepository.save(itinerario);
    }

    public Itinerario cadastrar(Itinerario itinerario){
        return itinerarioRepository.save(itinerario);
    }

    public Collection<Itinerario> buscarItinerariosPeloUsuarioId(long id){
        return itinerarioRepository.findAllByUsuarioId(id);
    }

    public Optional<Itinerario> buscarPorId(long id){
        return itinerarioRepository.findById(id);
    }
}
