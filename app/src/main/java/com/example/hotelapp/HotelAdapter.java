package com.example.hotelapp;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.HotelViewHolder> {

    private List<Hotel> hotelList;
    private Context context;

    public HotelAdapter(Context context, List<Hotel> hotelList) {
        this.context = context;
        this.hotelList = hotelList;
    }

    @NonNull
    @Override
    public HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_hotel, parent, false);
        return new HotelViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelViewHolder holder, int position) {
        Hotel hotel = hotelList.get(position);

        // Set data ke tampilan
        holder.hotelNameTextView.setText(hotel.getName());
        holder.hotelLocationTextView.setText(hotel.getLocation());
        holder.hotelDescriptionTextView.setText(hotel.getDescription());
        holder.hotelPriceTextView.setText(hotel.getPrice());
        holder.hotelImageView.setImageResource(hotel.getImageResourceId()); // Set gambar hotel

        // Klik untuk membuka detail
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, HotelDetailActivity.class);
            intent.putExtra("HOTEL_NAME", hotel.getName());
            intent.putExtra("HOTEL_LOCATION", hotel.getLocation());
            intent.putExtra("HOTEL_DESCRIPTION", hotel.getDescription());
            intent.putExtra("HOTEL_PRICE", hotel.getPrice());
            intent.putExtra("HOTEL_IMAGE", hotel.getImageResourceId());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return hotelList.size();
    }

    public static class HotelViewHolder extends RecyclerView.ViewHolder {
        TextView hotelNameTextView, hotelLocationTextView, hotelDescriptionTextView, hotelPriceTextView;
        ImageView hotelImageView;

        public HotelViewHolder(@NonNull View itemView) {
            super(itemView);
            hotelNameTextView = itemView.findViewById(R.id.hotel_name);
            hotelLocationTextView = itemView.findViewById(R.id.hotel_location);
            hotelDescriptionTextView = itemView.findViewById(R.id.hotel_description);
            hotelPriceTextView = itemView.findViewById(R.id.hotel_price);
            hotelImageView = itemView.findViewById(R.id.hotel_image); // Gambar hotel
        }
    }
}
