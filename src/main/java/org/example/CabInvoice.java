package org.example;

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

    public double calculateMultipleFares(double[] distances, int[] times) {
        double totalFares = 0;
        for(int i=0; i<distances.length; i++) {
            totalFares += calculateFare(distances[i], times[i]);
        }
        if(totalFares < MIN_FARE) {
            return MIN_FARE;
        }
        return totalFares;
    }
}
