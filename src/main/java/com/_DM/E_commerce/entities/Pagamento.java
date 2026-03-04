package com._DM.E_commerce.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
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
@Entity
public class Pagamento {

    @Id
    private UUID id;
    private LocalDate momento;

    public Pagamento(UUID id, LocalDate momento) {
        this.id = id;
        this.momento = momento;
    }

//   mapsId indica que o mesmo id dessa deese pedido vai ser o mesmo da primary key do pedido
    @OneToOne
    @MapsId
    private Pedido pedido;
}
