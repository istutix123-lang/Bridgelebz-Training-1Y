class RestCheckpoint extends Checkpoint {
    public RestCheckpoint(String id, String name, double dist, double exp, double act) {
        super(id, name, dist, exp, act);
    }

    @Override
    public boolean isCritical() { return false; }

    @Override
    public double calculatePenalty() {
        double delay = actualDuration - expectedDuration;
        return (delay > 30) ? (delay * 0.5) : 0.0;
    }
}