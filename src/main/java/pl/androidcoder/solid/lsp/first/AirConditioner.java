package pl.androidcoder.solid.lsp.first;

public class AirConditioner {

    public static final int MAX_LEVEL = 10;
    public static final int MIN_LEVEL = -10;

    private int level;

    private boolean working = false;

    void turnOn() {
        working = true;
    }

    void turnOff() {
        working = false;
    }

    boolean isWorking() {
        return working;
    }


    public int getCurrentLevel()
    {
        return level;
    }

    public void setLevel(int level) {
        if (level < MIN_LEVEL) {
            this.level = MIN_LEVEL;
        } else if (level > MAX_LEVEL) {
            this.level = MAX_LEVEL;
        } else {
            this.level = level;
        }
    }
}
