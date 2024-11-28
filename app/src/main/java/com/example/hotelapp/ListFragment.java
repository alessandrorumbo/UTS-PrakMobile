package com.example.hotelapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class ListFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_list, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Hotel> hotelList = new ArrayList<>();
        hotelList.add(new Hotel(
                "Aston Palu Hotel & Conference Center",
                "Jl. W.Monginsidi 60, Lolu Selatan, Palu",
                "Hotel bintang 4 dengan fasilitas kolam renang dan pusat kebugaran.",
                "IDR 600,000 / night",
                R.drawable.aston_palu

        ));
        hotelList.add(new Hotel(
                "Best Western Plus Coco Palu",
                "Jl. Basuki Rahmat 127, Palu Selatan, Palu",
                "Best Western Plus Coco Palu adalah tempat bermalam yang tepat bagi Anda yang berlibur bersama keluarga. Nikmati segala fasilitas hiburan untuk Anda dan keluarga.",
                "IDR 700,000 / night",
                R.drawable.bwhotel
        ));
        hotelList.add(new Hotel(
                "Sutan Raja Hotel & Convention Centre Palu",
                "Jl. Abd. Rahman Saleh 45, Palu Selatan, Palu",
                "Sutan Raja Hotel & Convention Centre Palu adalah hotel dekat bandara Bandar Udara Mutiara SIS Al-Jufrie (PLW) dan merupakan pilihan tepat untuk bermalam sambil menunggu jadwal penerbangan berikutnya. Dapatkan tempat untuk istirahat yang nyaman di tengah persinggahan sementara Anda.",
                "IDR 680,000 / night",
                R.drawable.sutanrajahotel
        ));
        hotelList.add(new Hotel(
                "Hotel Helsinki Palu",
                "Jl. Moh. Hatta , Palu Timur, Palu",
                "Hotel Santika Palu merupakan hotel bintang tiga yang cocok baik untuk perjalanan bisnis maupun liburan. Beberapa fasilitas dari hotel ini meliputi pusat kebugaran, kolam renang dan area bermain anak. Koneksi WiFi gratis dapat diakses di area publik hotel dan beberapa tipe kamar.",
                "IDR 680,000 / night",
                R.drawable.helsinkihotel
        ));
        hotelList.add(new Hotel(
                "Hotel Santika Palu",
                "Jl. Batavia 7 Palu Selatan, Palu",
                "Berlokasi di Palu Timur, Hotel Helsinki Palu merupakan akomodasi yang menawarkan penginapan nyaman dilengkapi dengan layanan resepsionis 24 jam..",
                "IDR 350,000 / night",
                R.drawable.santika
        ));
        hotelList.add(new Hotel(
                "Hotel Jazz Palu",
                "Jl.  Zebra II No 11 Palu Selatan, Palu",
                "Berjarak 5 menit berkendara dari Jembatan Palu II, Jazz Hotel Palu adalah akomodasi bintang 3 yang dilengkapi dengan kolam renang, restoran dan bar. Para tamu menikmati parkir umum gratis di tempat dan WiFi tersedia di semua area properti.",
                "IDR 300,000 / night",
                R.drawable.jazzhotel
        ));
        hotelList.add(new Hotel(
                "Swiss-Belhotel Silae Palu",
                "Jl.Malonda No.12, Kota Palu, Sulawesi Tengah",
                "Swiss-Belhotel Silae Palu adalah hotel bintang empat pertama di Palu, Sulawesi Tengah. Dikelola oleh Swiss-Belhotel International, hotel ini memiliki 115 kamar serta vila yang menawarkan panorama elok Teluk Palu. Akomodasi mewah ini cocok untuk staycation ataupun tempat menginap saat Anda melakukan kunjungan bisnis di Palu.",
                "IDR 800,000 / night",
                R.drawable.swissbelhotel
        ));
        hotelList.add(new Hotel(
                "Palu Golden Hotel & Resort",
                "Jl.Raden Saleh No.1 Palu Timur, Palu",
                "Palu Golden Hotel & Resort sebuah hunian penginapan yang berlokasi di Palu. Dengan view nya yang cantik, hotel ini bisa dijadikan lokasi menginap saat bulan madu. Suasana ruangan yang bersih dan nyaman, cocok bagi Kamu yang akan berlibur atau mengadakan kunjungan bisnis. Lokasi yang strategis sehingga mudah untuk diakses, dan harga yang terjangkau bisa menjadi pilihan akomodasi perjalanan Kamu.",
                "IDR 350,000 / night",
                R.drawable.pghhotel
        ));
        hotelList.add(new Hotel(
                "Bukit Indah Doda Hotel & Resort",
                "Jl.Totosi 15, Ulujadi ,Palu",
                "Bukit Indah Doda Hotel & Resorts merupakan akomodasi yang menawarkan tempat liburan keluarga yang menyenangkan di Palu dan memiliki infinity pool dengan lanskap perbukitan dan kota Palu yang menawan. WiFi gratis tersedia di area publik dan semua kamar.",
                "IDR 550,000 / night",
                R.drawable.dodahotel
        ));
        hotelList.add(new Hotel(
                "d'Kalora Hotel & Resort",
                "jl Ulujadi no 8, Ulujadi ,Palu",
                "Akomodasi yang tak kalah nyaman dan terjangkau. D'Kalora Hotel & Resort sebuah penginapan yang luar biasa berlokasi strategis. Pilihan yang fantastis untuk mendapatkan pengalaman yang tidak terlupakan. Nikmati layanan professional, penuh perhatian, dan ramah demi kenyamanan Anda selama menginap",
                "IDR 300,000 / night",
                R.drawable.kalorahotel
        ));
        hotelList.add(new Hotel(
                "Hotel Kembang Joyo",
                "Jl. Emmy Saelan No.76, Tatura Sel, Palu",
                "Hotel Kembang Joyo menawarkan akomodasi di Palu dan berjarak sejauh 100 meter dari Grand Hero Swalayan. Properti ini memiliki WiFi gratis.",
                "IDR 400,000 / night",
                R.drawable.kembanghotel
        ));



        HotelAdapter adapter = new HotelAdapter(getContext(), hotelList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}
