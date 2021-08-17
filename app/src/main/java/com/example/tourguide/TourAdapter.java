package com.example.tourguide;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public  class TourAdapter extends ArrayAdapter<TourInfo> {

Context context;
    public TourAdapter( Context context,  ArrayList<TourInfo> objects) {
        super(context,0, objects);
     this.context= context;
    }
static  class ViewHolderItem{
        TextView title,description;
        ImageView imageView,youtube,map,webLink;
}

    @Override
    public View getView(int position, View listview, ViewGroup parent) {

        ViewHolderItem viewHolder;
        // this we use to change or inflate so it looks like a reusing ListView
        if (listview == null) {
            listview = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
            viewHolder = new ViewHolderItem();
            viewHolder.imageView = listview.findViewById(R.id.image_view);
            viewHolder.title = listview.findViewById(R.id.title);
            viewHolder.description=listview.findViewById(R.id.description);
            viewHolder.youtube=listview.findViewById(R.id.youtube);
            viewHolder.map=listview.findViewById(R.id.maps);
            viewHolder.webLink = listview.findViewById(R.id.web);
            listview.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolderItem) listview.getTag();
        }
        //Here we get class object location in the list
      TourInfo pos = getItem(position);



        viewHolder.description.setText(pos.getDescription());
       viewHolder.imageView.setImageResource(pos.getImageId());
       viewHolder.title.setText(pos.getTitle());

        viewHolder.youtube.setOnClickListener(v -> {
            Intent youtubeIntend = new Intent(Intent.ACTION_VIEW,Uri.parse(pos.getYoutubeLink()));

                context.startActivity(youtubeIntend);

        });

         viewHolder.map.setOnClickListener(v -> {
             Uri gmmIntentUri = Uri.parse("geo:"+pos.getLatitude()+", "+pos.getLongitude()+"?z=35");
             Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
             mapIntent.setPackage("com.google.android.apps.maps");


                     context.startActivity(mapIntent);


         });

       viewHolder.webLink.setOnClickListener(v -> {
            Intent webIntend = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.holidify.com/places/goa/sightseeing-and-things-to-do.html"));
            context.startActivity(webIntend);
        });

      return listview;
    }
}
