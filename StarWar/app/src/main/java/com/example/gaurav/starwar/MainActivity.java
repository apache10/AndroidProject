package com.example.gaurav.starwar;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.gaurav.starwar.adapter.ShipAdapter;
import com.example.gaurav.starwar.model.ShipInfo;
import com.example.gaurav.starwar.model.ShipInfoResponse;
import com.example.gaurav.starwar.rest.ApiClient;
import com.example.gaurav.starwar.rest.ApiInterface;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static android.R.attr.name;

public class MainActivity extends AppCompatActivity {
    List<ShipInfoResponse> shipInfo;
    List<ShipInfo> shipRInfo = new ArrayList<>();
    private List<ShipInfo> AllResults =new ArrayList<>();
    ApiInterface apiService;
    String[] mobileArray = {"Android","IPhone","WindowsMobile","Blackberry","WebOS","Ubuntu","Blackberry","WebOS","Ubuntu","Windows7","Max OS X"};
    String shipArray;
    String[] result;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        apiService = ApiClient.getClient().create(ApiInterface.class);
        SpaceApi(1);
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

    public void SpaceApi(final int page){
        Call<ShipInfoResponse> call= apiService.getShipInfo(page);//type of api
        call.enqueue(new Callback<ShipInfoResponse>() {
            @Override
            public void onResponse(Call<ShipInfoResponse> call, Response<ShipInfoResponse> response) {
                Log.d("Response size ship"," " + response.body().getResults().toString());
                Log.d("Response "," " + response.body().getResults().get(0).getName());
                for(int i=0;i<response.body().getResults().size();i++){
                    AllResults.add(response.body().getResults().get(i));
                }
                if(page<4)
                    SpaceApi(page+1);
                else {
                    Log.d("Response Size", "" + AllResults.get(0).getName());
                    resultArray();
                    initRecycler();
                }
            }

            @Override
            public void onFailure(Call<ShipInfoResponse> call, Throwable t) {
                t.printStackTrace();

                Log.d("Response ship", "Error");
            }
        });

    }

    public void resultArray(){
        for(int num=1;num<37;num++){
            Log.d("Result"+num,AllResults.get(num).getName().toString());
            shipArray += AllResults.get(num).getName().toString()+",";
        }
        result = shipArray.split(",");
        for(int temp=1;temp<36;temp++){
            Log.d("Arrayresult",result[temp]);
        }
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_list, result);
        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }

    void initRecycler(){
        final RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ShipAdapter(AllResults));

    }


}
