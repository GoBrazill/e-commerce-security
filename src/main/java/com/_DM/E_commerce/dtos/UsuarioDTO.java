package com._DM.E_commerce.dtos;

import com._DM.E_commerce.enums.Role;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {

    @NotBlank
    private String nome;
    @NotBlank
    @Column(unique = true)
    private String email;
    @Size(min = 11)
    private String telefone;
    @NotBlank
    @Size(min = 6, max = 20)
    private String senha;
    private Role role;
}
