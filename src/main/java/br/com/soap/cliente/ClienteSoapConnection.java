package br.com.soap.cliente;

import javax.enterprise.context.ApplicationScoped;
import javax.xml.namespace.QName;
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

}
