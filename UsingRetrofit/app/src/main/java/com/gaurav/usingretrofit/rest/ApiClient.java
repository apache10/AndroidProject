package com.gaurav.usingretrofit.rest;

/**
 * Created by gaurav on 11/10/16.
 */


import com.gaurav.usingretrofit.constant.ProjectConstant;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String Google_Place_Url= ProjectConstant.GetPlaceApiUrl;
    private static Retrofit retrofit = null;
    public static Retrofit getClient(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(Google_Place_Url).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

}
