package br.com.soap.dtos;

public class EnderecoDTO {

    private String bairro;
    private String cep;
    private String cidade;
    private String complemento2;
    private String end;
    private String uf;

    public EnderecoDTO() {
    }

    public EnderecoDTO(String bairro, String cep, String cidade, String complemento2, String end, String uf) {
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.complemento2 = complemento2;
        this.end = end;
        this.uf = uf;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getComplemento2() {
        return complemento2;
    }

    public void setComplemento2(String complemento2) {
        this.complemento2 = complemento2;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
