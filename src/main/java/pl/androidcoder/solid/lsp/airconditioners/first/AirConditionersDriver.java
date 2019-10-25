package pl.androidcoder.solid.lsp.airconditioners.first;

import java.util.List;

public class AirConditionersDriver {

    private List<AirConditioner> airConditioners;

    public AirConditionersDriver(List<AirConditioner> airConditioners) {
        this.airConditioners = airConditioners;
    }

    public void setLevelForAll(int level) {
        airConditioners.forEach(ac -> ac.setLevel(level));

        AirConditioner airConditioner = null;

        if(airConditioner instanceof DigitalAirConditioner) {
            ((DigitalAirConditioner) airConditioner).setTemperature(23);
        }

    }
}
