package br.com.soap.services;


import br.com.soap.cliente.ClienteSoapConnection;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class ClienteSoapService {



    @Inject
    ClienteSoapConnection clienteSoapConnection;





}
