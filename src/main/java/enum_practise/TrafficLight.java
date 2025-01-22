package enum_practise;

public enum TrafficLight {
    RED("Stop"),
    Yellow("Warning"),
    Green("Go");

    private String action;

    TrafficLight(String action){
        this.action=action;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
}
