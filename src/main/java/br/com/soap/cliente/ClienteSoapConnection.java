package br.com.soap.cliente;

import br.com.correios.bsb.sigep.master.bean.cliente.AtendeCliente;

import javax.enterprise.context.ApplicationScoped;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;


@ApplicationScoped
public class ClienteSoapConnection {

    static final QName Q_NAME = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClienteService");


    static final URL WSDLURL;

    static {
        {
            try {
                WSDLURL = new URL("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl");
            } catch (MalformedURLException e) {
                throw new RuntimeException(e);
            }
        }


    }



    public AtendeCliente connectClient(){
        Service serviceCorreio = Service.create(WSDLURL, Q_NAME);
        AtendeCliente correios = serviceCorreio.getPort(AtendeCliente.class);
        return correios;
    }



}
