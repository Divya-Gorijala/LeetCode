package enum_practise;

public class TrafficLightExample {
    public static void main(String[] args) {
        TrafficLight signal= TrafficLight.RED;
        System.out.println(signal+" : "+signal.getAction());
    }
}
