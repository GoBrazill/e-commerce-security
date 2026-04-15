package com._DM.E_commerce.entities;

import com._DM.E_commerce.dtos.UsuarioDTO;
import com._DM.E_commerce.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "cliente")
    private List<Pedido> pedidos = new ArrayList<>();

    public Usuario(String nome, String email, String telefone, String senha) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
    }
}
