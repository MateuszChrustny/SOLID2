package pl.androidcoder.solid.lsp.airconditioners.second;

public class AirConditionerFactory {
    public AirConditioner createAirConditioner(DigitalAirConditioner digitalAirConditioner){
        return new DigitalAirConditionerAdapter(digitalAirConditioner);
    }
}
