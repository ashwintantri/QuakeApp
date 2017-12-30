package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

import static com.example.android.quakereport.EarthQuakeUtils.fetchEarthquakeData;

/**
 * Created by ashwin_10_3 on 29/12/17.
 */

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    private String mUrl;
    public EarthquakeLoader(Context context,String url)
    {
        super(context);
        mUrl = url;
    }
    @Override
    protected void onStartLoading() {
        forceLoad();
    }
    @Override
    public List<Earthquake> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        List<Earthquake> earthquakes = fetchEarthquakeData(mUrl);
        return earthquakes;
    }
}
