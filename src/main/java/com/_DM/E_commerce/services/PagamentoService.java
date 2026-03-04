package com._DM.E_commerce.services;

import com._DM.E_commerce.repositories.PagamentoRepository;

public class PagamentoService {

    private final PagamentoRepository pagamentoRepository;

    public PagamentoService(PagamentoRepository pagamentoRepository) {
        this.pagamentoRepository = pagamentoRepository;
    }
}
