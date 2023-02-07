package com.back.tienda.Repository;

import com.back.tienda.Model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AdminRepository extends JpaRepository<Admin,Integer> {
        Optional<Admin> findByUser(String user);
}
