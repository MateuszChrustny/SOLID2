package pl.androidcoder.solid.isp;

public interface Light {
    void turnOn();

    void turnOff();

    boolean isOn();

    void setDim(float dim);

    float getDim();
}
