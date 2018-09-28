package com.newera.frequenncyproject.interfacs;

import com.newera.frequenncyproject.model.Model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface api {

    //https://api.coinmarketcap.com/v2/ticker/
    //https://api.coinmarketcap.com/v2/ticker/?structure=array&convert=INR&limit=10&sort=id
    @GET("/v2/ticker/?structure=array&convert=INR")
    Call<Model> MODEL_CALL (@Query("limit")int limit,@Query("rank") String id );
}
