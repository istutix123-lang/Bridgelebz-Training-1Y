abstract class Checkpoint {
    String checkpointId;
    String locationName;
    double distanceFromLast;
    double expectedDuration;
    double actualDuration;
    public Checkpoint(String id, String name, double dist, double expected, double actual) {
        this.checkpointId =id;
        this.locationName =name;
        this.distanceFromLast =dist;
        this.expectedDuration = expected;
        this.actualDuration =actual;
    }
    public abstract boolean isCritical();
    public abstract double calculatePenalty();
    public boolean isDelayed() {
        return actualDuration > expectedDuration;
    }
}












