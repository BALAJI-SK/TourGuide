package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class AdventureFragment extends Fragment {


    public AdventureFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_adventure, container, false);
        final ArrayList<TourInfo> tourInfoArrayList = new ArrayList<>();

        TourAdapter tourAdapter = new TourAdapter(getActivity(), tourInfoArrayList);

        tourInfoArrayList.add(new TourInfo(R.string.atv_biking, R.string.atv_desc,R.drawable.atv_biking,"15.6711"," 73.7101","https://youtu.be/EzfmHPWA5qs"));
        tourInfoArrayList.add(new TourInfo(R.string.wind_surfing, R.string.wind_desc, R.drawable.windsurfing,"15.4519","73.8030","https://youtu.be/LDjJh3Pp_do"));
        tourInfoArrayList.add(new TourInfo(R.string.boat_cruise, R.string.boat_desc, R.drawable.boat_cruise,"15.5959","74.0594","https://youtu.be/ZaDJTAtnH8A"));
        tourInfoArrayList.add(new TourInfo(R.string.knee_boarding, R.string.knee_desc, R.drawable.kneeboarding,"14.9850","74.0385","https://youtu.be/pKMgVeQKGak"));
        tourInfoArrayList.add(new TourInfo(R.string.parasailing, R.string.parasailing_desc, R.drawable.parasailing,"15.5553 ","73.7517","https://youtu.be/9wqQmEFZuRU"));
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(tourAdapter);
        return rootView;
    }
}