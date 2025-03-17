package br.com.consultarcep;

import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Consultas CEP JAVA - Conte sempre com a gente!");
        System.out.print("Digite seu nome: ");
        String nome = leitura.nextLine();
        System.out.println();

        System.out.print("Olá, " + nome + "! Bem vindo ao Consultas CEP JAVA!");
        System.out.println();

        System.out.print("Digite o CEP que deseja encontrar: ");
        String cep = leitura.nextLine();


        try {
            ConsultaCep consultaCep = new ConsultaCep();
            BuscaCep novoEndereco = consultaCep.buscaEndereco(cep);
            Cep cepOriginal = new Cep(novoEndereco);
            GeradorDeArquivo gerador = new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
            System.out.println(cepOriginal);
        } catch (RuntimeException | IOException e) {
            throw new RuntimeException("Ocorreu um erro");
        }
    }
}