package org.example;


class RestCheckpoint extends Checkpoint {
    public RestCheckpoint(String id, String name, double d, int e, int a) { super(id, name, d, e, a); }
    @Override public String getType() { return "Rest"; }
    @Override public boolean isCritical() { return false; }
    @Override public double calculatePenalty() {
        int delay = actualDuration - expectedDuration;
        return (isDelayed() && delay > 30) ? delay * 0.5 : 0.0;
    }
}





