package com.mytour.hackingrio.controller;

import com.mytour.hackingrio.domain.Cidade;
import com.mytour.hackingrio.repository.CidadeRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/cidade")
public class CidadeController {

    private CidadeRepository cidadeRepository;

    public CidadeController(CidadeRepository cidadeRepository) {
        this.cidadeRepository = cidadeRepository;
    }

    @GetMapping("{nome}")
    public Collection<Cidade> inicioCadastroItinerario(@PathVariable("nome") String nome){
        return cidadeRepository.buscarPorNome(nome);
    }
}
