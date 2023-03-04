package com.back.tienda.Repository;

import com.back.tienda.Model.Orden;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdenRepository extends JpaRepository <Orden,Long> {

}
