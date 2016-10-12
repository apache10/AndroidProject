package com.gaurav.usingretrofit;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.gaurav.usingretrofit.constant.ProjectConstant;
import com.gaurav.usingretrofit.model.PlaceInfo;
import com.gaurav.usingretrofit.rest.ApiClient;
import com.gaurav.usingretrofit.rest.ApiInterface;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.Polyline;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private GoogleMap mMap;
    private static String TAG = "DUDE";
    private List<Marker> originMarkers = new ArrayList<>();
    private List<Marker> destinationMarkers = new ArrayList<>();
    private List<Polyline> polylinePaths = new ArrayList<>();
    private ProgressDialog progressDialog;
    private final PlaceInfo placeInfo=new PlaceInfo();
    int color = 0;
    int ch=0;
    public static List<Marker> CurrentMarker = new ArrayList<>();
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
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
    public void PlaceApi(LatLng l, int radius, String type){
        final String s=type;
        ApiInterface apiService = ApiClient.getClient().create(ApiInterface.class);
        Call<JsonObject> call= apiService.getPlaceInfo(""+l.latitude+"," + l.longitude,  radius , type , ProjectConstant.GoogleApiKey);
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                Log.d("Response size "," " + response.body().get("results").getAsJsonArray().size());
                Log.d("Response " , response.body().get("results").toString());

                placeInfo.Print();
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Log.d("Response", "Error");
            }
        });
    }
}
