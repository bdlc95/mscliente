package br.com.brunodelima.mscliente.repository;

import br.com.brunodelima.mscliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    // Pesquisa por nome (contém, ignora maiúsculas/minúsculas)
    List<Cliente> findByNomeContainingIgnoreCase(String nome);

    // Pesquisa por e-mail
    Optional<Cliente> findByEmail(String email);
}