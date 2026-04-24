class DeliveryCheckpoint extends Checkpoint {
    public DeliveryCheckpoint(String id, String name, double dist, double exp, double act) {
        super(id, name, dist, exp, act);
    }

    @Override
    public boolean isCritical() { return true; }

    @Override
    public double calculatePenalty() {
        if (!isDelayed()) return 0;
        return (actualDuration - expectedDuration) * 2;
        public double calculatePenalty() {
            return isDelayed() ? 10.0 : 0.0;
    }
}