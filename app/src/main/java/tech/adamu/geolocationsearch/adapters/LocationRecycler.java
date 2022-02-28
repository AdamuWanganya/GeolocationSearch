package tech.adamu.geolocationsearch.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import tech.adamu.geolocationsearch.R;
import tech.adamu.geolocationsearch.models.GeolocationSearchResponse;

public class LocationRecycler extends RecyclerView.Adapter<LocationRecycler.ViewHolder> {
    List<GeolocationSearchResponse> responseList;
    Context context;

    public LocationRecycler(List<GeolocationSearchResponse> responseList, Context context) {
        this.responseList = responseList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View  view = inflater.inflate(R.layout.location_strip_view,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LocationRecycler.ViewHolder holder, int position) {
        holder.country.setText(responseList.get(position).getCountry().toString());
        holder.city.setText(responseList.get(position).getCity().toString());
        holder.currency.setText(responseList.get(position).getCurrency().toString());


    }

    @Override
    public int getItemCount() {
        return responseList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView country;
        TextView city;
        TextView currency;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            country = itemView.findViewById(R.id.country);
            city = itemView.findViewById(R.id.city);
            currency = itemView.findViewById(R.id.currency);

        }
    }
}
