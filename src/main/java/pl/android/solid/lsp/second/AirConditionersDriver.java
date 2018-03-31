package pl.android.solid.lsp.second;

import pl.android.solid.lsp.first.AirConditioner;

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
