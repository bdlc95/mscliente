package br.com.brunodelima.mscliente.service;

import br.com.brunodelima.mscliente.model.Cliente;
import br.com.brunodelima.mscliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Cadastrar
    public Cliente salvar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Alterar
    public Cliente atualizar(Long id, Cliente dadosAtualizados) {
        Cliente cliente = clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado com id: " + id));

        cliente.setNome(dadosAtualizados.getNome());
        cliente.setEmail(dadosAtualizados.getEmail());
        cliente.setTelefone(dadosAtualizados.getTelefone());

        return clienteRepository.save(cliente);
    }

    // Pesquisar todos
    public List<Cliente> listarTodos() {
        return clienteRepository.findAll();
    }

    // Pesquisar por ID
    public Optional<Cliente> buscarPorId(Long id) {
        return clienteRepository.findById(id);
    }

    // Pesquisar por nome
    public List<Cliente> buscarPorNome(String nome) {
        return clienteRepository.findByNomeContainingIgnoreCase(nome);
    }
}