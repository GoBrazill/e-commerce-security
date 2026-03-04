package com._DM.E_commerce.services;

import com._DM.E_commerce.dtos.PedidoDTO;
import com._DM.E_commerce.entities.Pedido;
import com._DM.E_commerce.repositories.PedidoRepository;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public PedidoDTO criarPedido(PedidoDTO dto) {
            Pedido pedido = new Pedido(dto.getMomento(), dto.getStatus());
            pedidoRepository.save(pedido);
            PedidoDTO pedidodto = new PedidoDTO(pedido.getMomento(), pedido.getStatus());
            return pedidodto;
    }

}
