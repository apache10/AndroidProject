package com.example.gaurav.starwar;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import com.example.gaurav.starwar.model.ShipInfo;
import com.example.gaurav.starwar.rest.ApiClient;
import com.example.gaurav.starwar.rest.ApiInterface;
import com.google.gson.JsonObject;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {
    List<ShipInfo> shipInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            SpaceApi();
            FilmsApi();
        }
    public void FilmsApi(){
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<JsonObject> call= apiService.getFilmsInfo();//type of api
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                Log.d("Response size "," " + response.body().get("results").getAsJsonArray().size());
                Log.d("ResponseFilm " , response.body().get("results").toString());
                Log.d("Response1Next " , response.body().get("next").toString());
                String nextUrl =response.body().get("next").toString();
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Log.d("Response", "Error");
            }
        });
    }
    public void SpaceApi(){
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<ShipInfo> call= apiService.getShipInfo();//type of api
        call.enqueue(new Callback<ShipInfo>() {
            @Override
            public void onResponse(Call<ShipInfo> call, Response<ShipInfo> response) {
                Log.d("Response size ship"," " + response.body().toString());
            }

            @Override
            public void onFailure(Call<ShipInfo> call, Throwable t) {
                Log.d("Response ship", "Error");
            }
        });
    }
}
