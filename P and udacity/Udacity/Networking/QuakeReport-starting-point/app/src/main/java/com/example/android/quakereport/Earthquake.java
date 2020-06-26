package com.example.android.quakereport;

public class Earthquake {

    private double mRange;
    private String mLocation;
    private Long mTimeInMilliseconds;
    private String mUrl;

    Earthquake(double range, String location, Long date, String url){
        mRange = range;
        mLocation = location;
        mTimeInMilliseconds = date;
        mUrl = url;
    }

    public double getMagnitude() {
        return mRange;
    }

    public String getLocation() {
        return mLocation;
    }

    public Long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl(){
        return mUrl;
    }
}
