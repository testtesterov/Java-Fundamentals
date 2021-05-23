package WorkingWithAbstraction.trafficLights;

public class TrafficLight {
//red green yellow
    private TrafficLightState state;

    TrafficLight(TrafficLightState state) {
        this.state = state;
    }

    public void update(){
        switch (this.state){
            case RED:
                this.state=TrafficLightState.GREEN;
                break;

            case GREEN:
                this.state=TrafficLightState.YELLOW;
                break;

            case YELLOW:
                this.state=TrafficLightState.RED;
                break;
        }
    }

    @Override
    public String toString() {
        return this.state.toString();
    }
}
