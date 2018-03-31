package pl.androidcoder.solid.isp;

public class ClassicLight implements Light {

    private float dim;

    @Override
    public void turnOn() {
        if (dim == 0) {
            dim = 100;
        }
    }

    @Override
    public void turnOff() {
        dim = 0;
    }

    @Override
    public boolean isOn() {
        return dim > 0;
    }

    @Override
    public void setDim(float dim) {
        if (dim > 100) {
            this.dim = 100;
        } else if (dim < 0) {
            this.dim = 0;
        } else {
            this.dim = dim;
        }
    }
}
