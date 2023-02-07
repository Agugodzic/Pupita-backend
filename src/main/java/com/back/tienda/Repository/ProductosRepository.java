package com.back.tienda.Repository;

import com.back.tienda.Model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Producto,Long> {
}
