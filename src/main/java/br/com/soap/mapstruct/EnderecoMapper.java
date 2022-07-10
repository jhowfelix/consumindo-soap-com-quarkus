package br.com.soap.mapstruct;

import br.com.correios.bsb.sigep.master.bean.cliente.EnderecoERP;

import br.com.soap.dtos.EnderecoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface EnderecoMapper {


    EnderecoDTO toDTO(EnderecoERP enderecoERP);



}
