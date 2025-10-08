package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InternalError, InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um filme:");
        var busca = scan.nextLine();
        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=b06def85";
        try {


            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());
            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();
            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);

            //try {
            Titulo meutitulo = new Titulo(meuTituloOmdb);
            System.out.println("Título já convertido");
            System.out.println(meutitulo);
        } catch (NumberFormatException e) {
            System.out.println("Aconteceu um erro: " + e.getMessage());
        }catch (IllegalArgumentException e){
            System.out.println("Algum erro de arumento na busca, verifique o endereço");
        }catch (Exception e){
            System.out.println("Aconteceu algo, não sei o que");
        }
        System.out.println("O programa finalizou corretamente!");
    }
}






