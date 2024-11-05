package br.edu.fatecfranca.ecommerce.repository;

import br.edu.fatecfranca.ecommerce.model.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {;

}
