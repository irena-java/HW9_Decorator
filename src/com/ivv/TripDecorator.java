package com.ivv;

public class TripDecorator implements Trip {
    Trip trip;

    public TripDecorator(Trip trip) {
        this.trip = trip;
    }

    @Override
    public String service() {
        return trip.service();
    }
}
