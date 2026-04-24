class  RouteLinkedList{
    public static void main(String[] args) {
        String driverName = "istuti";
        String driverId = "xyz";
        RouteLinkedList<Checkpoint> route = new RouteLinkedList<>();
        route.addCheckpoint(new DeliveryCheckpoint("C1", "Warehouse A", 40.0, 60, 70));
        route.addCheckpoint(new FuelCheckpoint("C2", "Pump 12", 20.0, 15, 10));
        route.addCheckpoint(new RestCheckpoint("C3", "Motel X", 30.0, 30, 65));
        route.addCheckpoint(new DeliveryCheckpoint("C4", "Client Hub", 30.0, 45, 60));
        double totalDist = route.computeTotalDistance();
        double totalPenalty = route.computeTotalPenalty();
        double routeScore = totalDist - totalPenalty;
        System.out.println("Driver: " + driverId + " – " + driverName);
        System.out.println("Route Summary:");
        route.printRoute();
        System.out.println("------------------------------------");
        System.out.println("Total Distance: " + totalDist + " km");
        System.out.println("Total Penalty: " + totalPenalty);
        System.out.println("Route Score: " + routeScore);
        boolean isConsistent = route.consistencyCheck();
        System.out.println("Critical Route Check: " +
                (isConsistent ? "All required checkpoints present" : "Missing critical stops!"));
    }
