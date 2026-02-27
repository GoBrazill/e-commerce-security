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

    public Pedido criarPedido(PedidoDTO dto) {
//            Pedido pedido = new pedido(dto);
//            userRepository.save(pedido);
//            PedidoDTO pedidodto = new PedidoDTO(pedido.getStatus(), pedido.getMomento(), pedido.gete);
//            return pedidodto;

    }

}
