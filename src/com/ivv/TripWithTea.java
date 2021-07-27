package com.ivv;

public class TripWithTea extends TripDecorator {
    public TripWithTea(Trip trip) {
        super(trip);
    }

    public String addTea() {
        return " + чай ";
    }

    @Override
    public String service() {
        return super.service() + addTea();
    }
}