package com.smtlabs.mvparchitecture.network;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiInterface {
    @FormUrlEncoded
    @POST("authJWT")
    Call<ResponseModel> getAuthResult(@Field("username") String username, @Field("password") String password);
    }
