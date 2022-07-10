package br.com.soap.services;



import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;
import br.com.correios.bsb.sigep.master.bean.cliente.SQLException_Exception;
import br.com.correios.bsb.sigep.master.bean.cliente.SigepClienteException;
import br.com.soap.cliente.ClienteSoapConnection;
import br.com.soap.dtos.EnderecoDTO;
import br.com.soap.mapstruct.EnderecoMapperImpl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ClienteSoapService {


    @Inject
    EnderecoMapperImpl enderecoMapper;

    @Inject
    ClienteSoapConnection clienteSoapConnection;


    public EnderecoDTO buscaCEP(String cep){
        try{
            AtendeCliente cliente = clienteSoapConnection.connectClient();
            EnderecoDTO enderecoDTO = enderecoMapper.toDTO(cliente.consultaCEP(cep));
            return enderecoDTO;
        }catch(SQLException_Exception | SigepClienteException e){
            throw new RuntimeException(e.getMessage());
        }

    }



}
