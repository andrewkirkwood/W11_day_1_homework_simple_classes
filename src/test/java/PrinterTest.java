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

    @Test
    public void check_number_of_sheets_of_paper(){
        assertEquals(100,printer.getNumberOfSheets().intValue());
    }

    @Test
    public void check_printer_prints_when_total_number_of_pages_to_print_is_below_number_of_sheets_avaialable(){
        printer.print(5, 3);
        assertEquals(85, printer.getNumberOfSheets().intValue());
    }
    @Test
    public void check_printer_cannot_print_if_there_are_not_enough_sheets_available_in_the_printer(){
        printer.print(6, 20);
        assertEquals(100, printer.getNumberOfSheets().intValue());
    }
    @Test
    public void check_printer_still_prints_if_to_print_quantity_equals_available_sheets(){
        printer.print(5, 20);
        assertEquals(0, printer.getNumberOfSheets().intValue());
    }


}
