package com.example.android.quakereport;

/**
 * Created by pratik on 25/2/17.
 */

public class Earthquake {

    private double mMagnitude;

    private String mUrl;

    private String mLocation;

    private long mTimeInMilliseconds;

    private String mDate;

    public Earthquake(double mag, String loc, long date, String url) {
        this.mTimeInMilliseconds = date;
        this.mLocation = loc;
        this.mMagnitude = mag;
        mUrl = url;
    }

    public String getUrl() {
        return mUrl;
    }
    public double getMagnitude() {
        return mMagnitude;
    }

    public String getLocation() {
        return mLocation;
    }

    public long getDate() {
        return mTimeInMilliseconds;
    }
}
