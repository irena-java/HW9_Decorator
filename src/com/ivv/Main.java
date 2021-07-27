package com.ivv;

public class Main {

    public static void main(String[] args) {
        Trip trip1 = new PureTrip();
        System.out.println(trip1.service());

        Trip trip2 = new TripWithBedding(new PureTrip());
        System.out.println(trip2.service());

        Trip trip3 = new TripWithTea(new TripWithBedding(new PureTrip()));
        System.out.println(trip3.service());

        Trip trip4 = new TripWithConditioner(new TripWithTea(new PureTrip()));
        System.out.println(trip4.service());

        Trip trip5 = new TripWithConditioner(new TripWithTea(new TripWithBedding(new PureTrip())));
        System.out.println(trip5.service());

        Trip trip6 = new TripWithConditioner(new TripWithTea(new TripWithWifi(new PureTrip())));
        System.out.println(trip6.service());
    }
}