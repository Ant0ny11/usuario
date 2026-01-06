package com.javanauta.usuario.infraestructure.config.repository;


import com.javanauta.usuario.infraestructure.config.entity.Telefone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long> {
}
