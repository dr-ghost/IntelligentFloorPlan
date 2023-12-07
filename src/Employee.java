public class Employee {
    private String employeeName;
    private String department;
    private FloorPlan floorPlan;

    public Employee(String employeeName, String department, FloorPlan floorPlan) {
        this.employeeName = employeeName;
        this.department = department;
        this.floorPlan = floorPlan;
    }

    public void raiseFloorPlanRequest(String roomName, int newCapacity) {
        System.out.println(employeeName + " from " + department + " department raised a request:");
        System.out.println("Request for room: " + roomName + " to change capacity to " + newCapacity);
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public FloorPlan getFloorPlan() {
        return floorPlan;
    }

    public void setFloorPlan(FloorPlan floorPlan) {
        this.floorPlan = floorPlan;
    }
}
