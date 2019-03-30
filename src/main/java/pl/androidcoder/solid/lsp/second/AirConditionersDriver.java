package pl.androidcoder.solid.lsp.second;

import pl.androidcoder.solid.lsp.first.AirConditioner;

import java.util.List;

public class AirConditionersDriver {

    private List<AirConditioner> airConditioners;

    public AirConditionersDriver(List<AirConditioner> airConditioners) {
        this.airConditioners = airConditioners;
    }

    public void setLevelForAll(int level) {
        airConditioners.forEach(ac -> ac.setLevel(level));
    }
}
