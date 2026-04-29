package com._DM.E_commerce.controllers;

import com._DM.E_commerce.dtos.LoginDTO;
import com._DM.E_commerce.services.JwtService;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final JwtService jwtService;
    private final AuthenticationManager authnManager;

    public AuthController(JwtService jwtService, AuthenticationManager authnManager) {
        this.jwtService = jwtService;
        this.authnManager = authnManager;
    }

    @PostMapping("login")
    public String login(@RequestBody LoginDTO dto) {
        authnManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        dto.getEmail(),
                        dto.getSenha()
                )
        );
        return jwtService.gerarToken(dto.getEmail());

    }
}
