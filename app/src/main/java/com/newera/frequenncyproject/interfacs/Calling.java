package com.newera.frequenncyproject.interfacs;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public  class Calling {
    public  static api api(String Baseurl){
        Retrofit.Builder retrofit = new Retrofit.Builder().baseUrl(Baseurl).addConverterFactory(GsonConverterFactory.create());
        return retrofit.build().create(api.class);
    }
}
