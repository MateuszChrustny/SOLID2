package pl.android.solid.lsp.first;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class AirConditionerTest {

    AirConditioner airConditioner;

    @Before
    public void setUp() throws Exception {
        airConditioner = new AirConditioner();
    }

    @Test
    public void isWorkingShouldReturnTrueWhenAirConditionWorking() throws Exception {
        airConditioner.turnOn();
        assertTrue(airConditioner.isWorking());
    }

    @Test
    public void isWorkingShouldReturnFalseWhenAirConditionIsTurnedOff() throws Exception {
        airConditioner.turnOff();
        assertFalse(airConditioner.isWorking());
    }

    @Test
    public void levelCannotBeHigherThanMaxValue() throws Exception {
        airConditioner.setLevel(AirConditioner.MAX_LEVEL + 10);
        assertEquals(airConditioner.getCurrentLevel(), AirConditioner.MAX_LEVEL);
    }

    @Test
    public void levelCannotBeLowerThanMaxValue() throws Exception {
        airConditioner.setLevel(AirConditioner.MIN_LEVEL - 10);
        assertEquals(airConditioner.getCurrentLevel(), AirConditioner.MIN_LEVEL);
    }

    @Test
    public void setLevelShouldSetTheLevelOfACBetweenMinLevelAndMaxLevel() throws Exception {
        for (int i = AirConditioner.MIN_LEVEL; i < AirConditioner.MAX_LEVEL; i++) {
            airConditioner.setLevel(i);
            assertEquals(i, airConditioner.getCurrentLevel());
        }
    }
}