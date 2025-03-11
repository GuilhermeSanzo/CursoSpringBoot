package io.github.guilhermesanzo.produtosapi.repository;

import io.github.guilhermesanzo.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {

}
