package com.gaurav.usingretrofit.rest;

/**
 * Created by gaurav on 11/10/16.
 */


import com.gaurav.usingretrofit.constant.ProjectConstant;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String BASE_URL= ProjectConstant.Base_Url;
    private static Retrofit retrofit = null;

   /* public static Retrofit getClient(){
        retrofit = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();
        return retrofit;
    }*/
    public static Retrofit getClient(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(Google_Place_Url).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

}
