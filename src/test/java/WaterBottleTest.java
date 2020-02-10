import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class WaterBottleTest {
    private WaterBottle waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle("Andrews Water Bottle");
    }

    @Test
    public void can_get_water_bottle_name(){
        assertEquals("Andrews Water Bottle", waterBottle.getName());
    }

    @Test
    public void check_water_bottle_starts_at_100(){
        assertEquals(100, waterBottle.getVolume().intValue());
    }

    @Test
    public void check_drink_function_reduces_volume_by_10(){
        waterBottle.drink();
        waterBottle.drink();
        assertEquals(80, waterBottle.getVolume().intValue());
    }
}
