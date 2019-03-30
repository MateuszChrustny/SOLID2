package pl.androidcoder.solid.lsp.first;

public class DigitalAirConditioner extends AirConditioner {

    public static final float MAX_TEMP = 26;
    public static final float MIN_TEMP = 15;

    private float temperature;

    @Override
    public void setLevel(int level) {
        super.setLevel(level);
        temperature = calculateTemperatureFromLevel();
    }

    public void setTemperature(float temperature) {
        if (temperature > MAX_TEMP) {
            this.temperature = MAX_TEMP;
        } else if (temperature < MIN_TEMP) {
            this.temperature = MIN_TEMP;
        } else {
            this.temperature = temperature;
        }
        setLevel(calculateLevelFromTemperature());
    }

    private float calculateTemperatureFromLevel() {
        float percent = levelToPercent();
        float tempRange = MAX_TEMP - MIN_TEMP;
        return tempRange * percent;
    }

    private float levelToPercent() {
        int relativeLevel = getCurrentLevel() - MIN_LEVEL;
        int range = MAX_LEVEL - MIN_LEVEL;
        return relativeLevel * 1.0f / range;
    }

    private int calculateLevelFromTemperature() {
        float percent = temperatureToPercent();
        int levelRange = MAX_LEVEL - MIN_LEVEL;
        return Math.round(levelRange * percent);
    }

    private float temperatureToPercent() {
        float relativeTemp = temperature - MIN_TEMP;
        float range = MAX_TEMP - MIN_TEMP;
        return relativeTemp / range;
    }
}
