package com.example.android.quakereport;

/**
 * Created by ashwin_10_3 on 28/12/17.
 */

public class Earthquake {
    private double magnitude;
    private String place;
    private long timeInMS;
    private String mUrl;
    public Earthquake(double mag,String mPlace,long mTime,String url)
    {
        magnitude = mag;
        place = mPlace;
        timeInMS = mTime;
        mUrl = url;
    }
    public double getMagnitude()
    {
        return magnitude;
    }

    public long getTime() {
        return timeInMS;
    }

    public String getPlace() {
        return place;
    }
    public String getUrl()
    {
        return mUrl;
    }
}
