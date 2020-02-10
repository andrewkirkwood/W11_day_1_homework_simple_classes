import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator("Super Calculator");
    }
    @Test
    public void check_calculator_has_name(){
        assertEquals("Super Calculator", calculator.getName());
    }

    @Test
    public void check_calculator_can_add_two_numbers_together(){
        assertEquals(3, calculator.add(1,2));
    }

    @Test
    public void check_calculator_can_subtract_second_number_from_first_number(){
        assertEquals(8, calculator.subtract(10,2));
    }

    @Test
    public void check_calculator_can_multiply_two_numbers_together(){
        assertEquals(15, calculator.multiply(5,3));
    }

}
