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

    public int getTotalNumberOfRides() {
        return totalNumberOfRides;
    }

    public void setTotalNumberOfRides(int totalNumberOfRides) {
        this.totalNumberOfRides = totalNumberOfRides;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public double getAverageFarePerRide() {
        return averageFarePerRide;
    }

    public void setAverageFarePerRide(double averageFarePerRide) {
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
