package com.example.gaurav.starwar.rest;

import com.example.gaurav.starwar.constant.ProjectConstant;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
/**
 * Created by gaurav on 17/10/16.
 */

public class ApiClient {
    public static final String Star_War_Url= ProjectConstant.GetStarWarApiUrl;
    private static Retrofit retrofit = null;
    public static Retrofit getClient(){
        if(retrofit==null){
            retrofit = new Retrofit.Builder().baseUrl(Star_War_Url).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }
}
