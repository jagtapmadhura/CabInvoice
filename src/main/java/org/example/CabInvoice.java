package org.example;


import java.util.List;

public class CabInvoice {
    static final double COST_PER_KM = 10.0;
    static final double COST_PER_MIN = 1.0;
    static final double MIN_FARE = 5;

    public double calculateFare(double distance, int time) {
        double totalFare = (distance*COST_PER_KM) + (time*COST_PER_MIN);
        if(totalFare<MIN_FARE) {
            return MIN_FARE;
        }
        return totalFare;
    }

    public double calculateMultipleFares(List<Ride> rides) {
        double totalFares = 0;
        for(Ride ride: rides) {
            totalFares += calculateFare(ride.getDistance(), ride.getTime());
        }
        if(totalFares < MIN_FARE) {
            return MIN_FARE;
        }
        return totalFares;
    }

    public EnhancedInvoice enhancedInvoice(List<Ride> rides) {
        int totalNumberOfRides = rides.size();
        double totalFare = calculateMultipleFares(rides);
        double averageTotalFare = totalFare/totalNumberOfRides;
        return new EnhancedInvoice(totalNumberOfRides, averageTotalFare, averageTotalFare);
    }
}
