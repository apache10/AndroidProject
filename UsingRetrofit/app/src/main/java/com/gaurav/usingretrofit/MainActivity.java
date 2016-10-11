package com.gaurav.usingretrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.gaurav.usingretrofit.rest.ApiClient;
import com.gaurav.usingretrofit.rest.ApiInterface;
import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiCalls();
    }
    public void apiCalls(){
        ApiInterface apiservice = ApiClient.getClient().create(ApiInterface.class);
        Call<JsonObject> callGreet = apiservice.getGreet();
        callGreet.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                Log.d("Data", response.body().toString());
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Log.d("Data", "Error");
            }
        });
    }
}
