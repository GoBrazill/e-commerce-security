package com._DM.E_commerce.services;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;

@Service
public class JwtService {

    private final String SECRET = "senhasupersecretaquetemqueterotamanhodepelomenos45caracteres";

    public String gerarToken(String email) {
        return Jwts.builder()
                .setSubject(email)
                .signWith(SignatureAlgorithm.HS256,SECRET)
                .compact();

    }

    public String pegarEmail(String token) {
        return Jwts.parser()
                .setSigningKey(SECRET)
                .parseClaimsJws(token)
                .getBody()
                .getSubject();
    }
}
