package com.gaurav.usingretrofit.rest;

/**
 * Created by gaurav on 11/10/16.
 */

import com.google.gson.JsonObject;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Path;
import retrofit2.http.Query;


public interface ApiInterface {

    @GET("hello")
    Call<JsonObject> getGreet();

    @GET("json")
    Call<JsonObject> getPlaceInfo(@Query("location") String location, @Query("radius") int radius, @Query("type") String type,@Query("key") String apiKey);

   /* @GET("users/{name}")
    Call<User> getUser(@Path("name") String name);

    @GET("users")
    Call<Users> getAllUsers();

    @GET("hello")
    Call<JsonObject> getGreet();

    @POST("users")
    Call<JsonObject> CreateUser(@Body User user);

    @Multipart
    @POST("user/pic")
    Call<JsonObject> uploadImage(@Part("desc") String desc, @Part("photo") RequestBody photo);


    @GET("movies/top_rated")
    Call<Data> getData(@Query("api_key") String apiKey);
*/
}