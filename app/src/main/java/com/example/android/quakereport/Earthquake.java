package com.example.android.quakereport;

/**
 * Created by ashwin_10_3 on 28/12/17.
 */

public class Earthquake {
    private double magnitude;//magnitude of the earthquake
    private String place;//Location of the earthquake
    private long timeInMS;//Time Duration of the earthquake
    private String mUrl;//Url for the earthquake
    public Earthquake(double mag,String mPlace,long mTime,String url)//public constructor for initialising the object
    {
        magnitude = mag;
        place = mPlace;
        timeInMS = mTime;
        mUrl = url;
    }
    public double getMagnitude()//get Mangnitude of the earthquake
    {
        return magnitude;
    }

    public long getTime() {//get Time of the earthquake
        return timeInMS;
    }

    public String getPlace() {//get Location of the earthquake
        return place;
    }
    public String getUrl()//get Url of the earthquake
    {
        return mUrl;
    }
}
