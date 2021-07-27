package com.ivv;

public class TripWithConditioner extends TripDecorator {
    public TripWithConditioner(Trip trip) {
        super(trip);
    }

    public String addConditioner() {
        return " + кондиционер";
    }

    @Override
    public String service() {
        return super.service() + addConditioner();
    }
}