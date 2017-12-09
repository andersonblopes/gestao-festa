package com.lopes.gestaofesta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lopes.gestaofesta.model.Convidado;

public interface ConvidadosRepository extends JpaRepository<Convidado, Long> {

}
