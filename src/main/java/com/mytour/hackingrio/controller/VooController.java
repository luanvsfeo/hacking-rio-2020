package com.mytour.hackingrio.controller;

import com.mytour.hackingrio.domain.ApiObjects.Aviationstack.Root;
import com.mytour.hackingrio.domain.Itinerario;
import com.mytour.hackingrio.domain.Voo;
import com.mytour.hackingrio.repository.VooRepository;
import com.mytour.hackingrio.service.ItinerarioService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.Optional;

@RestController
@RequestMapping("/voo")
public class VooController {


    private RestTemplate restTemplate;

    private ItinerarioService itinerarioService;

    private VooRepository vooRepository;

    public VooController(RestTemplate restTemplate, ItinerarioService itinerarioService, VooRepository vooRepository) {
        this.restTemplate = restTemplate;
        this.itinerarioService = itinerarioService;
        this.vooRepository = vooRepository;
    }

    /**
     *  Metodo que faz/faria um request para a API do Aviation stack com o objetivo de retorno das informações
     *  de um voô usando o seu codigo e salva as informaçãos do mesmo no banco para verificação dos dados
     *  (https://api.aviationstack.com/v1/flights?airline_iata={codigo}&access_key=? )
     * (https://aviationstack.com/documentation)
     *
     * @since 10/10/2020
     * @author Luan Sampaio
     * */
    @PostMapping("/{itinerarioId}/{codigo}")
    public Voo cadastrarVooNoItinerario(@PathVariable("itinerarioId") long id, @PathVariable("codigo") String codigo){

        Optional<Itinerario> itinerario = itinerarioService.buscarPorId(id);

        Root quote = restTemplate.getForObject(
                "https://luanfeo.free.beeceptor.com/flight_iata={codigo}", Root.class, codigo);

        Voo voo = null;

        if(quote.getData().size() == 1 && itinerario.isPresent()){

            voo =  new Voo(quote.getData().get(0));
            voo.setItinerarios(Arrays.asList(itinerario.get()));
            voo = vooRepository.save(voo);
        }

        return voo;
    }
}
