package com.example.gaurav.starwar.rest;

import com.google.gson.JsonObject;
import com.example.gaurav.starwar.*;


import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Created by gaurav on 17/10/16.
 */

public interface ApiInterface {
    @GET("starships")
    Call<JsonObject> getShipInfo();

}