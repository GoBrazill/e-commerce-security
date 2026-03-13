package com._DM.E_commerce.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class PedidoProduto {

    @EmbeddedId
    private PedidoProdutoPK id = new PedidoProdutoPK();
    private int quantidade;
    private double preco;

    public PedidoProduto(Pedido pedido, Produto produto, int quantidade, double preco) {
        id.setPedido(pedido);
        id.setProduto(produto);
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Pedido getPedido() {
        return id.getPedido();
    }

    public void setPedido(Pedido pedido) {
        id.setPedido(pedido);
    }

    public Pedido getProduto() {
        return id.getPedido();
    }

    public void setProduto(Produto produto) {
        id.setProduto(produto);
    }

}
