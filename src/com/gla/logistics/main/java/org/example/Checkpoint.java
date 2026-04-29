package org.example;


abstract class Checkpoint {
    String checkpointId, locationName;
    double distanceFromLast;
    int expectedDuration, actualDuration;

    public Checkpoint(String id, String name, double dist, int exp, int act) {
        this.checkpointId = id; this.locationName = name;
        this.distanceFromLast = dist; this.expectedDuration = exp; this.actualDuration = act;
    }

    public abstract String getType();
    public abstract boolean isCritical();
    public abstract double calculatePenalty();
    public boolean isDelayed() { return actualDuration > expectedDuration; }
}