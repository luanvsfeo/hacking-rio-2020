package com.mytour.hackingrio.controller;

import com.mytour.hackingrio.domain.Usuario;
import com.mytour.hackingrio.repository.LugarRepository;
import com.mytour.hackingrio.service.UsuarioService;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    private UsuarioService usuarioService;
    private LugarRepository lugarRepository;

    public UsuarioController(UsuarioService usuarioService, LugarRepository lugarRepository) {
        this.usuarioService = usuarioService;
        this.lugarRepository = lugarRepository;
    }

    @GetMapping("{uuid}")
    public Usuario perfil(@PathVariable("uuid")String uuid){

        Usuario usuario = usuarioService.buscarPorUuid(UUID.fromString(uuid));
        usuario.setHistoricoCheckIns(lugarRepository.buscarPorUsuarioId(usuario.getId()));

        return usuario;
    }

    @PostMapping("")
    public String cadastro(@RequestBody Usuario usuario){
        Usuario usuarioSalvo = usuarioService.salvar(usuario);
        return usuarioSalvo.getUuid().toString();
    }

}
