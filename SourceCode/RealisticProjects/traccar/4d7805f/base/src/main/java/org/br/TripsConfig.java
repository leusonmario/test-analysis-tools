package org.br;

public class TripsConfig {

    public TripsConfig() {
    }

    public TripsConfig(double minimalTripDistance, long minimalTripDuration,
                       long minimalParkingDuration, boolean greedyParking, long minimalNoDataDuration) {
        this.minimalTripDistance = minimalTripDistance;
        this.minimalTripDuration = minimalTripDuration;
        this.minimalParkingDuration = minimalParkingDuration;
        this.greedyParking = greedyParking;
        this.minimalNoDataDuration = minimalNoDataDuration;
    }

    private double minimalTripDistance;

    public double getMinimalTripDistance() {
        return minimalTripDistance;
    }

    public void setMinimalTripDistance(double minimalTripDistance) {
        this.minimalTripDistance = minimalTripDistance;
    }

    private long minimalTripDuration;

    public long getMinimalTripDuration() {
        return minimalTripDuration;
    }

    public void setMinimalTripDuration(long minimalTripDuration) {
        this.minimalTripDuration = minimalTripDuration;
    }

    private long minimalParkingDuration;

    public long getMinimalParkingDuration() {
        return minimalParkingDuration;
    }

    public void setMinimalParkingDuration(long minimalParkingDuration) {
        this.minimalParkingDuration = minimalParkingDuration;
    }

    private boolean greedyParking;

    public boolean getGreedyParking() {
        return greedyParking;
    }

    public void setGreedyParking(boolean greedyParking) {
        this.greedyParking = greedyParking;
    }

    private long minimalNoDataDuration;

    public long getMinimalNoDataDuration() {
        return minimalNoDataDuration;
    }

    public void setMinimalNoDataDuration(long minimalNoDataDuration) {
        this.minimalNoDataDuration = minimalNoDataDuration;
    }
}
