package br.com.felipe.restapi.controller;

import br.com.felipe.restapi.entity.PessoaEntity;
import br.com.felipe.restapi.model.Pessoa;
import br.com.felipe.restapi.mapper.PessoaMapper;
import br.com.felipe.restapi.service.PessoaService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    private final PessoaService service;

    public PessoaController(PessoaService service) {
        this.service = service;
    }

    @GetMapping
    public Pessoa getPessoa(@RequestParam("cpf") String cpf) {
        PessoaEntity pessoaEntity = service.getPessoa(cpf);
        return PessoaMapper.INSTANCE.toSource(pessoaEntity);
    }

    @PostMapping
    public void storePessoa(@RequestBody Pessoa pessoa) {
        PessoaEntity pessoaEntity = PessoaMapper.INSTANCE.toDestination(pessoa);
        service.storePessoa(pessoaEntity);
    }
}
