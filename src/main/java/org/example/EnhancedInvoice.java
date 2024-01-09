package org.example;

public class EnhancedInvoice {
    private int totalNumberOfRides;
    private double totalFare;
    private double averageFarePerRide;

    public EnhancedInvoice(int totalNumberOfRides, double totalFare, double averageFarePerRide) {
        this.totalNumberOfRides = totalNumberOfRides;
        this.totalFare = totalFare;
        this.averageFarePerRide = averageFarePerRide;
    }

    @Override
    public String toString() {
        return "EnhancedInvoice{" +
                "totalNumberOfRides=" + totalNumberOfRides +
                ", totalFare=" + totalFare +
                ", averageFarePerRide=" + averageFarePerRide +
                '}';
    }
}
