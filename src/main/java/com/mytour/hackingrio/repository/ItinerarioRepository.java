package com.mytour.hackingrio.repository;

import com.mytour.hackingrio.domain.Itinerario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface  ItinerarioRepository extends JpaRepository<Itinerario,Long>  {

    List<Itinerario> findAllByUsuarioId(long id) ;
}
