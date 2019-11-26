package br.com.etechoracio.avaliacao.service;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ProjetoAPIService {

    @GET("Quadrado")
    Call<String> executar(String s, @Path("valor") String value);



}
