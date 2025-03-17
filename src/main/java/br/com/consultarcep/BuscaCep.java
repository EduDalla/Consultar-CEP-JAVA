package br.com.consultarcep;

public record BuscaCep(String cep, String bairro, String logradouro, String estado) {
    // O record serve para filtrar os valores que vem da API
}
