import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {
    private Printer printer;

    @Before
    public void before(){
        printer = new Printer("Andrews Printer", 100);
    }

    @Test
    public void check_name_of_printer(){
        assertEquals("Andrews Printer", printer.getName());
    }

}