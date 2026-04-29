package org.example;




class DeliveryCheckpoint extends Checkpoint {
    public DeliveryCheckpoint(String id, String name, double d, int e, int a) { super(id, name, d, e, a); }
    @Override public String getType() { return "Delivery"; }
    @Override public boolean isCritical() { return true; }
    @Override public double calculatePenalty() { return isDelayed() ? (actualDuration - expectedDuration) * 2.0 : 0.0; }
}
