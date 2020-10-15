package com.mytour.hackingrio.repository;

import com.mytour.hackingrio.domain.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface LugarRepository extends JpaRepository<Lugar,Long> {

            @Query(nativeQuery = true,
                        value = " select lugar.* from hackingrio.itinerario " +
                                " inner join hackingrio.lugar on lugar.itinerario_id = itinerario.id " +
                                " where " +
                                " usuario_id = :usuario_id")
            List<Lugar> buscarPorUsuarioId( @Param("usuario_id") long id);

}
