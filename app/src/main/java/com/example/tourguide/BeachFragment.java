package com.example.tourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class BeachFragment extends Fragment {


    public BeachFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView= inflater.inflate(R.layout.fragment_beach, container, false);
        final ArrayList<TourInfo> tourInfoArrayList = new ArrayList<>();

        TourAdapter tourAdapter = new TourAdapter(getActivity(), tourInfoArrayList);
        tourInfoArrayList.add(new TourInfo(R.string.paliem_sweet_water, R.string.paliem_sweet_water_desc, R.drawable.paliem_sweet_water, "15.6979", "73.6980", "https://youtu.be/QzqqYz8C2qg"));
        tourInfoArrayList.add(new TourInfo(R.string.Calanguta, R.string.Calanguta_dsec, R.drawable.beach_calangute,"15.533414","73.764954","https://youtu.be/ZTu_4noeFiI"));
        tourInfoArrayList.add(new TourInfo(R.string.Anjuna,R.string.anjuna_decs,R.drawable.anjuna,"15.5733","73.7410","https://youtu.be/mdRfbYVtGJ8"));
        tourInfoArrayList.add(new TourInfo(R.string.baga, R.string.baga_desc,R.drawable.baga_beach,"15.5553","73.7517","https://youtu.be/bED2aKHPmg0"));
        tourInfoArrayList.add(new TourInfo(R.string.Palolem, R.string.Palolem_dsec, R.drawable.palolem_beach,"15.0100","74.0232","https://youtu.be/sdD-pAK8nBM"));
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(tourAdapter);

        return  rootView;
    }
}