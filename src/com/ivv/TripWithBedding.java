package com.ivv;

public class TripWithBedding extends TripDecorator {
    public TripWithBedding(Trip trip) {
        super(trip);
    }

    public String addBedding() {
        return " + постельное белье ";
    }

    @Override
    public String service() {
        return super.service() + addBedding();
    }
}