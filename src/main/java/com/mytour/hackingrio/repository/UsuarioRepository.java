package com.mytour.hackingrio.repository;

import com.mytour.hackingrio.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    Usuario findByUuid(UUID uuid);

    @Query(nativeQuery = true,
                        value = "select u.* from hackingrio.usuario u " +
                                "where  " +
                                " u.id in (select i.usuario_id from hackingrio.itinerario i where i.id  = :itinerario_id) ")
    Usuario findByItinerarioId(@Param("itinerario_id") long itinerarioId);
}
