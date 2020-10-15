package com.mytour.hackingrio.repository;

import com.mytour.hackingrio.domain.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CidadeRepository extends JpaRepository<Cidade,Long> {

    @Query(nativeQuery = true,
            value = "select * from hackingrio.cidade c  " +
                    "where  " +
                    "c.\"name\" like CONCAT('%',:nome,'%') " +
                    "or c.subcountry like CONCAT('%',:nome,'%') " +
                    "or c.country like CONCAT('%',:nome,'%') ")
    List<Cidade> buscarPorNome(@Param("nome") String nome);
}
