package com.devmarrima.gestorstock.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devmarrima.gestorstock.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
