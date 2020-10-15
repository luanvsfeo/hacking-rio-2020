package com.mytour.hackingrio.service;

import com.mytour.hackingrio.domain.Usuario;
import com.mytour.hackingrio.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario buscarPorUuid(UUID uuid){
        return usuarioRepository.findByUuid(uuid);
    }

    public Optional<Usuario> buscarPorId(long id){
        return usuarioRepository.findById(id);
    }

    public Usuario buscarPorItinerarioId(long id){
        return usuarioRepository.findByItinerarioId(id);
    }

    public Usuario salvar(Usuario usuario){
        return usuarioRepository.save(usuario);
    }
}
