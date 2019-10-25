package pl.androidcoder.solid.lsp.airconditioners.second;

public class DigitalAirConditioner {

    public static final float MAX_TEMP = 26;
    public static final float MIN_TEMP = 15;

    private float temperature;

    private boolean working = false;

    void turnOn() {
        working = true;
    }

    void turnOff() {
        working = false;
    }

    boolean isWorking() {
        return working;
    }

    public void setTemperature(float temperature) {
        if (temperature > MAX_TEMP) {
            this.temperature = MAX_TEMP;
        } else if (temperature < MIN_TEMP) {
            this.temperature = MIN_TEMP;
        } else {
            this.temperature = temperature;
        }
    }

    public float getCurrentTemperature()
    {
        return this.temperature;
    }
}
