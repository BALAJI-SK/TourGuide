package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class PlacesFragment extends Fragment {


    public PlacesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_places, container, false);
        final ArrayList<TourInfo> tourInfoArrayList = new ArrayList<>();

        tourInfoArrayList.add(new TourInfo(R.string.Dudhsagar_Falls, R.string.Dudhsagar_Falls_Decs, R.drawable.dudhsagar, "15.3144", "74.3143", "https://youtu.be/Yy-dFD0hQ6M"));
        tourInfoArrayList.add(new TourInfo(R.string.Shree_Mangesh, R.string.Shree_Mangesh_Dsec, R.drawable.shree_mangesh, "15.4449", "73.9664", "https://youtu.be/Bf7NebD73K8"));
        tourInfoArrayList.add(new TourInfo(R.string.shree_Shantadurga, R.string.shree_Shatadurga_Dsec, R.drawable.shree_shantadurga, "15.3961", "73.9856", "https://youtu.be/za0qIDKRdc4"));
        tourInfoArrayList.add(new TourInfo(R.string.Viceryos, R.string.Viceryos_Dsec, R.drawable.viceroys_arch, "15.5058", "73.9137", "https://youtu.be/1tV5rzjZF34"));
        tourInfoArrayList.add(new TourInfo(R.string.Swayambhu, R.string.Swayambhu_Dsec, R.drawable.swayambhu_shree_mahadev, "15.4390", "74.2526", "https://youtu.be/riSn9Oq29EU"));
        tourInfoArrayList.add(new TourInfo(R.string.Ashiyana, R.string.Ashiyana_Dsec, R.drawable.yoga_retreat_centre, "15.6622", "73.7146", "https://youtu.be/lZ_kIV6e3Ww"));

        tourInfoArrayList.add(new TourInfo(R.string.Alex, R.string.Alex_Dsec, R.drawable.st_alex_church, "15.5416°", "73.7677", "https://youtu.be/mH2cUffPuvs"));
        tourInfoArrayList.add(new TourInfo(R.string.Chapel, R.string.Chapel_Dsec, R.drawable.chapel_of_catherine, "15.5034", "73.9104", "https://youtu.be/d3YAIrR1nx4"));
        TourAdapter tourAdapter = new TourAdapter(getActivity(), tourInfoArrayList);
        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(tourAdapter);
        return rootView;
    }
}