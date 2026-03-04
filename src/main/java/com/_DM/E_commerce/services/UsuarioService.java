package com._DM.E_commerce.services;

import com._DM.E_commerce.dtos.UsuarioDTO;
import com._DM.E_commerce.entities.Usuario;
import com._DM.E_commerce.repositories.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public UsuarioDTO criarUsuario(UsuarioDTO dto) {
        Usuario usuario = new Usuario(dto.getNome(), dto.getEmail(), dto.getTelefone(), dto.getSenha(), dto.getRole());
        usuarioRepository.save(usuario);
        UsuarioDTO usuarioDTO = new UsuarioDTO(usuario.getNome(), usuario.getEmail(), usuario.getTelefone(), usuario.getSenha(), usuario.getRole());
        return usuarioDTO;
    }
}
