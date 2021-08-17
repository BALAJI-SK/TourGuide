package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelsFragment extends Fragment {


    public HotelsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View rootView = inflater.inflate(R.layout.fragment_hotels, container, false);

        final ArrayList<TourInfo> tourInfoArrayList = new ArrayList<>();

       tourInfoArrayList.add(new TourInfo(R.string.Hosteller,R.string.Hosteller_dsec, R.drawable.hosteller,"15.5696"," 73.7447","https://youtu.be/Ja3PbDUVo6Q"));
       tourInfoArrayList.add(new TourInfo(R.string.Tag_Resort,R.string.Tag_Resort_dsec, R.drawable.tag_resort,"15.4573"," 73.8117","https://youtu.be/6s_-LcOny_Y"));
       tourInfoArrayList.add(new TourInfo(R.string.resort_hermitage,R.string.resort_hermitage_desc,R.drawable.riviera_hermitage,"15.533414 ","73.764954","https://youtu.be/yg8Ivu7YG1I"));
       tourInfoArrayList.add(new TourInfo(R.string.Resort_prime,R.string.Resort_prime_dsec,R.drawable.resort_prime_bom_terra_verde,"15.556816","73.760799","https://youtu.be/1G8uC8v8UrE"));
        tourInfoArrayList.add(new TourInfo(R.string.Casio_pride,R.string.Casio_pride_desc,R.drawable.casino_pride,"15.5015","73.8277","https://youtu.be/ElI_FdmejcM"));
        TourAdapter tourAdapter = new TourAdapter(getActivity(), tourInfoArrayList);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(tourAdapter);
        return rootView;
    }
}