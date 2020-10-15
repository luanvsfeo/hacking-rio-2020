package com.mytour.hackingrio.controller;

import com.mytour.hackingrio.domain.Itinerario;
import com.mytour.hackingrio.domain.Usuario;
import com.mytour.hackingrio.service.ItinerarioService;
import com.mytour.hackingrio.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/itinerario")
public class ItinerarioController {

    private ItinerarioService itinerarioService;

    private UsuarioService usuarioService;

    public ItinerarioController(ItinerarioService itinerarioService, UsuarioService usuarioService) {
        this.itinerarioService = itinerarioService;
        this.usuarioService = usuarioService;
    }


    @GetMapping("/usuario/{uuid}")
    public Collection<Itinerario> listagemParaUsuario(@PathVariable("uuid") String uuid){
        Usuario usuario = usuarioService.buscarPorUuid(UUID.fromString(uuid));
        return itinerarioService.buscarItinerariosPeloUsuarioId(usuario.getId());
    }

    @PostMapping
    public Itinerario cadastro(@RequestBody Itinerario itinerario){
        return itinerarioService.cadastrar(itinerario);
    }

    @PutMapping
    public Itinerario edicao(@RequestBody Itinerario itinerario){

            Optional<Itinerario> itinerarioOptional =  itinerarioService.buscarPorId(itinerario.getId());

            if(itinerarioOptional.isPresent()){
                itinerarioOptional.get().atualizar(itinerario);
                itinerario = itinerarioService.cadastrar(itinerarioOptional.get());
            }

        return itinerario;
    }
}
