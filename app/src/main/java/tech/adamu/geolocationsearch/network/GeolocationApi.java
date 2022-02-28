package tech.adamu.geolocationsearch.network;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import tech.adamu.geolocationsearch.models.GeolocationSearchResponse;

public interface GeolocationApi {
    @GET("ip/check")
    Call<List<GeolocationSearchResponse>> getLocation();

}
