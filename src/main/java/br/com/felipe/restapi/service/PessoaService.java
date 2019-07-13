package br.com.felipe.restapi.service;

import br.com.felipe.restapi.entity.PessoaEntity;
import br.com.felipe.restapi.repository.PessoaRepository;
import org.springframework.stereotype.Service;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public PessoaEntity getPessoa(String cpf) {
        return repository.findByCpf(cpf);
    }

    public void storePessoa(PessoaEntity pessoaEntity) {
        repository.save(pessoaEntity);
    }
}
