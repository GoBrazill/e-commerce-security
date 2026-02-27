package com._DM.E_commerce.repositories;


import com._DM.E_commerce.entities.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PagamentoRepository extends JpaRepository<Pagamento, UUID> {

}
