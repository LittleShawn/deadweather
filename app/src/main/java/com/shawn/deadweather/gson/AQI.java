package com.shawn.deadweather.gson;

/**
 * Created by Shawn on 2016/12/28.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
