package pl.androidcoder.solid.lsp.airconditioners.second;

import static pl.androidcoder.solid.lsp.airconditioners.second.DigitalAirConditioner.MAX_TEMP;
import static pl.androidcoder.solid.lsp.airconditioners.second.DigitalAirConditioner.MIN_TEMP;

public class DigitalAirConditionerAdapter extends AirConditioner {

    private DigitalAirConditioner airConditioner;

    public DigitalAirConditionerAdapter(DigitalAirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    @Override
    public void setLevel(int level) {
        super.setLevel(level);
        airConditioner.setTemperature(calculateTemperatureFromLevel());
    }

    @Override
    public int getCurrentLevel() {
        return calculateLevelFromTemperature();
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
        float relativeTemp = airConditioner.getCurrentTemperature() - MIN_TEMP;
        float range = MAX_TEMP - MIN_TEMP;
        return relativeTemp / range;
    }
}
