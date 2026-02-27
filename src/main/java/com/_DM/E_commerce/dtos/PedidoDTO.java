package com._DM.E_commerce.dtos;

import com._DM.E_commerce.enums.StatusPedido;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PedidoDTO {

    @NotBlank
    private LocalDate momento;
    @NotBlank
    private StatusPedido status;
}
