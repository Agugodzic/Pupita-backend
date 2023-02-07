package com.back.tienda.Repository;

import com.back.tienda.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriasRepository extends JpaRepository<Categoria,Long> {
}
