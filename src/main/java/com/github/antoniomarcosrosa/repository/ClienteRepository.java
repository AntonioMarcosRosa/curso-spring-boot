package com.github.antoniomarcosrosa.repository;

import com.github.antoniomarcosrosa.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    List<Cliente> findByNomeContains(String name);

    @Query(value = "SELECT c FROM Cliente c WHERE c.nome = :nome")
    List<Cliente> buscarPorNome(@Param("nome") String nome);

    boolean existsByNome(String nome);

    @Modifying
    @Query("DELETE FROM Cliente c WHERE c.nome = :nome")
    void deletePeloNome(@Param("nome") String nome);

}
