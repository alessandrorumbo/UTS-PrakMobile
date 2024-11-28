package com.example.hotelapp;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HotelDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotel_detail);

        // Get the passed hotel name
        String hotelName = getIntent().getStringExtra("HOTEL_NAME");

        // Set the hotel name to TextView
        TextView hotelNameTextView = findViewById(R.id.hotel_name_detail);
        hotelNameTextView.setText(hotelName);
    }
}