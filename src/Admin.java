public class Admin {
    private String adminName;
    private FloorPlan floorPlan;

    public Admin(String adminName, FloorPlan floorPlan) {
        this.adminName = adminName;
        this.floorPlan = floorPlan;
    }

    public void uploadFloorPlan(String floorPlanName, int totalRooms, int totalSeats) {
        floorPlan = new FloorPlan(floorPlanName, totalRooms, totalSeats);
        System.out.println(adminName + " uploaded a new floor plan: " + floorPlanName);
    }

    public void addRoom(String roomName, int capacity) {
        floorPlan.addRoom(roomName, capacity);
        System.out.println(adminName + " added a room: " + roomName + " with capacity: " + capacity);
    }

    public void modifyRoomCapacity(String roomName, int newCapacity) {
        if (floorPlan.roomCapacityMap.containsKey(roomName)) {
            floorPlan.roomCapacityMap.put(roomName, newCapacity);
            System.out.println(adminName + " modified capacity for room: " + roomName + " to " + newCapacity);
        } else {
            System.out.println("Room " + roomName + " does not exist in the floor plan.");
        }
    }

    // Simulating an admin making changes and resolving conflicts
    public void simulateUpdateConflict(FloorPlan newFloorPlan) {
        System.out.println(adminName + " is updating the floor plan...");
        //floorPlan.resolveConflicts(newFloorPlan);
        System.out.println("Conflicts resolved by " + adminName);
    }
}
