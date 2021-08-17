package com.example.tourguide;

public class TourInfo {
    private final int titleId;
    private final int  descriptionId;
    private final String latitude;
    private final String longitude;
     private final String youtubeLink;
    private final int imageId;


    public TourInfo(int title,int description,int imageId,String latitude,String Longitude,String youtubeLink){
        this.descriptionId=description;
        this.imageId=imageId;
        this.titleId=title;
        this.latitude= latitude;
        this.longitude=Longitude;
        this.youtubeLink= youtubeLink;

    }

    public int getImageId() {
        return imageId;
    }

    public int getDescription() {
        return descriptionId;
    }

    public int getTitle() {
        return titleId;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getYoutubeLink() {
        return youtubeLink;
    }


}
