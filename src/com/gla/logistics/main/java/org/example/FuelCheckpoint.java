package org.example;



class FuelCheckpoint extends Checkpoint {
    public FuelCheckpoint(String id, String name, double d, int e, int a) { super(id, name, d, e, a); }
    @Override public String getType() { return "Fuel"; }
    @Override public boolean isCritical() { return true; }
    @Override public double calculatePenalty() { return isDelayed() ? 10.0 : 0.0; }
}