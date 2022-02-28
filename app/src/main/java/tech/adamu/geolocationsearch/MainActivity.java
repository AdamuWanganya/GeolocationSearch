package tech.adamu.geolocationsearch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import tech.adamu.geolocationsearch.adapters.LocationRecycler;
import tech.adamu.geolocationsearch.models.GeolocationSearchResponse;
import tech.adamu.geolocationsearch.network.GeolocationApi;
import tech.adamu.geolocationsearch.network.GeolocationClient;

public class MainActivity extends AppCompatActivity {
    public MainActivity() {

    }

//    GeolocationClient geolocationClient;
    @BindView(R.id.recyclerview) RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);

        GeolocationApi geolocationApi = GeolocationClient.getClient();
        Call<List<GeolocationSearchResponse>> call = geolocationApi.getLocation();
        call.enqueue(new Callback<List<GeolocationSearchResponse>>() {
            @Override
            public void onResponse(Call<List<GeolocationSearchResponse>> call, Response<List<GeolocationSearchResponse>> response) {
                if (response.isSuccessful()){
                    List<GeolocationSearchResponse> allData = response.body();
                    Toast.makeText(MainActivity.this, "location successful", Toast.LENGTH_SHORT).show();
                    recyclerView.setAdapter(new LocationRecycler(allData,MainActivity.this));
                }
                else {
                    Toast.makeText(MainActivity.this, "Location not success", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<GeolocationSearchResponse>> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failure", Toast.LENGTH_SHORT).show();

            }
        });
        return view;
    }
}