package pl.androidcoder.solid.isp;

public class FluorescentLight implements Light{

    boolean state;

    @Override
    public void turnOn() {
        state = true;
    }

    @Override
    public void turnOff() {
        state = false;
    }

    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void setDim(float dim) {
        throw new IllegalStateException();
    }
}
