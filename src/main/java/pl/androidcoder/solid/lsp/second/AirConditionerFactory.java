package pl.androidcoder.solid.lsp.second;

public class AirConditionerFactory {
    public AirConditioner createAirConditioner(DigitalAirConditioner digitalAirConditioner){
        return new DigitalAirConditionerAdapter(digitalAirConditioner);
    }
}
