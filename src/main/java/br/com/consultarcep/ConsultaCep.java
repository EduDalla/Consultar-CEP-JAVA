package br.com.consultarcep;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    public BuscaCep buscaEndereco (String cep) {
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep.replace(" ", "") + "/json/");

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), BuscaCep.class);

        } catch (Exception e) {
            throw new RuntimeException("Não foi possível obter o endereço a partir desse CEP");
        }
    }


}
