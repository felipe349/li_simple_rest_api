package br.com.felipe.restapi.controller;

import br.com.felipe.restapi.model.Pessoa;
import br.com.felipe.restapi.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController("/pessoa")
@RequiredArgsConstructor
public class PessoaController {

    private final PessoaService service;

    @GetMapping
    public Pessoa getPessoa(@RequestParam("cpf") String cpf) {
        return service.getPessoa(cpf);
    }

    @PostMapping
    public void storePessoa(@RequestBody Pessoa pessoa) {
        service.storePessoa(pessoa);
    }
}
