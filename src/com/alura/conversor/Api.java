package com.alura.conversor;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Api {

    public float fetchApi(String moneda, String moneda2){
        float val =-1;
        String link = "https://v6.exchangerate-api.com/v6/7261ff06440170beec94e591/pair/"+moneda+"/"+moneda2;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(link))
                .build();
        try{
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();
            Gson gson = new Gson();

            //objeto que recibe los valores del json para manipular valores posteriormente.
            JsonObject jsonObject = gson.fromJson(json, JsonObject.class);
            val = jsonObject.get("conversion_rate").getAsFloat();

        } catch (Exception e) {
            System.out.println("ERROR: No se pudo consultar el tipo de cambio.");
        }

        return val;
    }
}
