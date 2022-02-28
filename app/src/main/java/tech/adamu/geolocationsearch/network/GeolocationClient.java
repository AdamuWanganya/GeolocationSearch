package tech.adamu.geolocationsearch.network;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class GeolocationClient {
    public GeolocationClient() {
    }

    private static Retrofit retrofit = null;

    public static GeolocationApi getClient() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new Interceptor() {
                    @Override
                    public Response intercept(Chain chain) throws IOException {
                        Request newRequest = chain.request().newBuilder()
                        .addHeader("x-rapidapi-host", "ip-geo-location.p.rapidapi.com")
                        .addHeader("x-rapidapi-key", "398fbaa2bamshf80e47bb081352fp17fa1djsn2f95ffa286b2")
                                .build();
                        return chain.proceed(newRequest);
                    }
                })
                .build();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://ip-geo-location.p.rapidapi.com")
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        return retrofit.create(GeolocationApi.class);

    }
}
