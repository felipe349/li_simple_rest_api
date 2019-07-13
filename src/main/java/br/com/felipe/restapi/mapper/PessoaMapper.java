package br.com.felipe.restapi.mapper;

import br.com.felipe.restapi.entity.PessoaEntity;
import br.com.felipe.restapi.model.Pessoa;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface PessoaMapper {

    PessoaMapper INSTANCE = Mappers.getMapper(PessoaMapper.class);

    Pessoa toSource(PessoaEntity pessoaEntity);
    PessoaEntity toDestination(Pessoa pessoa);
}
