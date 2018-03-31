package pl.android.solid.lsp.first;

import org.junit.Before;

public class DigitalAirConditionerTest extends AirConditionerTest {

    @Override
    @Before
    public void setUp() throws Exception {
        airConditioner = new DigitalAirConditioner();
    }
}