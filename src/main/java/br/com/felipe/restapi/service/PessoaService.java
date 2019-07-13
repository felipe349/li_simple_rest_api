package br.com.felipe.restapi.service;

import br.com.felipe.restapi.model.Pessoa;
import br.com.felipe.restapi.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository repository;

    public Pessoa getPessoa(String cpf) {
        return repository.findByCpf(cpf);
    }

    public void storePessoa(Pessoa pessoa) {
        repository.save(pessoa);
    }
}
