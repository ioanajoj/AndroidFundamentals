package com.example.joj.discovercluj;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.List;

public class TheAdapter extends RecyclerView.Adapter<TheAdapter.MyViewHolder> {

    private List<Location> locations;
    // context for glide
    private Context mContext;

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView name;
        public TextView address;
        public ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.location_name);
            address = (TextView) itemView.findViewById(R.id.location_address);
            image = (ImageView) itemView.findViewById(R.id.location_imageview);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public TheAdapter(Context context, List<Location> locations) {
        this.mContext = context;
        this.locations = locations;
    }

    @Override
    public TheAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.location_layout_cardview, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int position) {
//        Log.d(TAG, "onBindViewHolder: called.");

        RequestOptions requestOptions = new RequestOptions()
                .placeholder(R.drawable.ic_launcher_background);

        Glide.with(mContext)
                .load(locations.get(viewHolder.getAdapterPosition()).getImage())
                .apply(requestOptions)
                .into(viewHolder.image);

        viewHolder.name.setText(locations.get(position).getName());
        viewHolder.address.setText(locations.get(position).getAddress());
    }

    @Override
    public int getItemCount() {
        return locations.size();
    }
}
