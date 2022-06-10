package com.smtlabs.mvparchitecture.network;


import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitService {

    public static final String baseUrl = "http://3.111.128.169:9999/swiggy/";
    public static final Retrofit.Builder builder =  new Retrofit.Builder().baseUrl(baseUrl);

    public static <S> S createService(Class<S> serviceClass) {
        Retrofit retrofit = builder.addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit.create(serviceClass);
    }


}
