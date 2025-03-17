package br.com.consultarcep;

public class Cep {
    private String cep;
    private String  bairro;
    private String  logradouro;
    private String  estado;

    public Cep(BuscaCep cepInfo) {
        this.cep = String.valueOf(cepInfo.cep());
        this.bairro = String.valueOf(cepInfo.bairro());
        this.logradouro = String.valueOf(cepInfo.logradouro());
        this.estado = String.valueOf(cepInfo.estado());
    }


    @Override
    public String toString() {
        return "Cep = " + cep +
                ", Bairro = " + bairro +
                ", Logradouro = " + logradouro +
                ", Estado = " + estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
