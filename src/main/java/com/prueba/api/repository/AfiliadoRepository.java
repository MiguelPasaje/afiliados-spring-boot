package com.prueba.api.repository;

import com.prueba.api.model.Afiliado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AfiliadoRepository extends JpaRepository<Afiliado,Long> {
}
