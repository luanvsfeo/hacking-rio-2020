package com.mytour.hackingrio.controller;

import com.mytour.hackingrio.domain.ApiObjects.TripAdvaisor.ApiRootObject;
import com.mytour.hackingrio.domain.ApiObjects.TripAdvaisor.Data;
import com.mytour.hackingrio.domain.ApiObjects.TripAdvaisor.RootApi;
import com.mytour.hackingrio.domain.Lugar;
import com.mytour.hackingrio.domain.Usuario;
import com.mytour.hackingrio.repository.LugarRepository;
import com.mytour.hackingrio.service.UsuarioService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@RestController()
@RequestMapping("/lugar")
public class LugarController {

    private RestTemplate restTemplate;

    private LugarRepository lugarRepository;

    private UsuarioService usuarioService;

    public LugarController(RestTemplate restTemplate, LugarRepository lugarRepository, UsuarioService usuarioService) {
        this.restTemplate = restTemplate;
        this.lugarRepository = lugarRepository;
        this.usuarioService = usuarioService;
    }

    /**
     *  Metodo que faz/faria um request para a API do TripAdvaisor com o objetivo de  mostrar as informaçoes
     *  de forma detalhada de um estabelecimento em especifico (http://developer-tripadvisor.com/content-api/documentation/location/)
     *
     * @since 10/10/2020
     * @author Luan Sampaio
     * */
    @GetMapping("/{location_id}")
    public Lugar buscarEspecifico(@PathVariable("location_id") String locationId){

        ApiRootObject quote = restTemplate.getForObject(
                "https://luanfeo.free.beeceptor.com/location/id={codigo}", ApiRootObject.class, locationId);

        Lugar lugar =  new Lugar(quote);

        return lugar;
    }


    /**
    *  Metodo que faz/faria um request para a API do TripAdvaisor com o objetivo mostrar os estabelecimentos em volta
     *  do usuando, levando em consideraçao as suas coordenadas. (http://developer-tripadvisor.com/content-api/documentation/location_mapper/)
     *
     * @since 10/10/2020
     * @author Luan Sampaio
    * */
    @GetMapping("/em-volta/{cords}")
    public Collection<Lugar> buscarNasRedondezas(@PathVariable("cords") String cords, @RequestParam("texto") String texto){

        RootApi quote = restTemplate.getForObject(
                "https://luanfeo.free.beeceptor.com/location_mapper/coords/{cords}", RootApi.class, cords);

        Collection<Lugar> lugars = new ArrayList<>();

        for(Data data : quote.getData()){
            lugars.add(new Lugar(data));
        }

        return lugars;
    }

    @PostMapping()
    public Lugar checkIn( @RequestBody Lugar lugar){

        lugar.setDataCheckin(new Date());
        lugar.setPontuacao(10);

        Usuario usuario = usuarioService.buscarPorItinerarioId(lugar.getItinerarioId());
        usuario.adicionarPontuacao(lugar.getPontuacao());
        usuarioService.salvar(usuario);

        return lugarRepository.save(lugar);
    }


}
