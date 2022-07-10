package br.com.soap.controller;


import br.com.soap.services.ClienteSoapService;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/consultarcep/{cep}")
public class CorreioController {

    @Inject
    ClienteSoapService clienteSoapService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response consultarCep(String cep){
    return Response.ok().entity(clienteSoapService.buscaCEP(cep)).build();
    }


}
