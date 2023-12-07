import java.util.HashMap;
import java.util.Map;

public class FloorPlan {
    private String floorPlanName;
    private int totalRooms;
    private int totalSeats;
    public Map<String, Integer> roomCapacityMap;
    public Map<String, Integer> roomSeatsMap;

    public FloorPlan(String floorPlanName, int totalRooms, int totalSeats) {
        this.floorPlanName = floorPlanName;
        this.totalRooms = totalRooms;
        this.totalSeats = totalSeats;
        this.roomCapacityMap = new HashMap<>();
        this.roomSeatsMap = new HashMap<>();
    }

    public void addRoom(String roomName, int capacity) {
        roomCapacityMap.put(roomName, capacity);
        roomSeatsMap.put(roomName, 0);
    }

    public int getTotalAvailableSeats() {
        int totalOccupiedSeats = roomSeatsMap.values().stream().mapToInt(Integer::intValue).sum();
        return totalSeats - totalOccupiedSeats;
    }

    public boolean bookSeat(String roomName) {
        if (roomCapacityMap.containsKey(roomName)) {
            int currentSeats = roomSeatsMap.get(roomName);
            int roomCapacity = roomCapacityMap.get(roomName);
            if (currentSeats < roomCapacity) {
                roomSeatsMap.put(roomName, currentSeats + 1);
                return true;
            }
        }
        return false;
    }

    public String getFloorPlanName() {
        return floorPlanName;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public int getTotalSeats() {
        return totalSeats;
    }
}
