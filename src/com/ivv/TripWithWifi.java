package com.ivv;

public class TripWithWifi extends TripDecorator {
    public TripWithWifi(Trip trip) {
        super(trip);
    }

    public String addWiFi() {
        return " + Wi-Fi ";
    }

    @Override
    public String service() {
        return super.service() + addWiFi();
    }
}