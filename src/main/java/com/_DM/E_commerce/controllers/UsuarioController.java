package com._DM.E_commerce.controllers;

import com._DM.E_commerce.dtos.UsuarioDTO;
import com._DM.E_commerce.services.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("usuario")
@RestController
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("criar")
    public ResponseEntity<?> criarUsuario(@Valid @RequestBody UsuarioDTO dto) {
        return ResponseEntity.ok(usuarioService.criarUsuario(dto));
    }

    @GetMapping("mostrar/todos")
    public ResponseEntity<?> mostrarUsuarios() {
        return ResponseEntity.ok(usuarioService.mostrarUsuarios());
    }

    @GetMapping("mostrar/{id}")
    public ResponseEntity<?> mostrarUsuarioPorId(@PathVariable UUID id) {
        return ResponseEntity.ok(usuarioService.mostrarUsuarioPorId(id));
    }

    @PutMapping("atualizar/{id}")
    public ResponseEntity<?> atualizarUsuario(@PathVariable UUID id, @Valid @RequestBody UsuarioDTO dto) {
        return ResponseEntity.ok(usuarioService.atualizarUsuario(id, dto));
    }

    @DeleteMapping("deletar/{id}")
    public ResponseEntity<?> deletarUsuario(@PathVariable UUID id) {
        return ResponseEntity.ok(usuarioService.deletarUsuario(id));
    }

    @GetMapping("/admin")
    public String testeAdmin() {
        return "The dad is awesome, there is no way";
    }
}
