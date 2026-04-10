public double calculatePenalty() {
    return isDelayed() ? 10.0 : 0.0;
}
}class FuelCheckpoint extends Checkpoint {
    public FuelCheckpoint(String id, String name, double dist, double exp, double act) {
        super(id, name, dist, exp, act);
    }
    @Override
    public boolean isCritical() {
        return true;
    }

    @Override
    public double calculatePenalty() {
        double delay = actualDuration - expectedDuration;
        return (delay > 30) ? (delay * 0.5) : 0.0;
    }
}