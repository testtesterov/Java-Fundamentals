package WorkingWithAbstraction.trafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] initialTrafficLightStates = scanner.nextLine().split("\\s+");
        int n=Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String initialTrafficLightState : initialTrafficLightStates) {
            TrafficLight trafficLight = new TrafficLight(TrafficLightState.valueOf(initialTrafficLightState));
            trafficLights.add(trafficLight);
        }

        for(int i=0;i<n;i++){
            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.update();
                System.out.print(trafficLight+" ");
            }
            System.out.println();
        }
    }
}
