package br.edu.fatecfranca.ecommerce.repository;

import br.edu.fatecfranca.ecommerce.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // esta interface vai nos permitir fazer CRUD na tabela Produto
}
