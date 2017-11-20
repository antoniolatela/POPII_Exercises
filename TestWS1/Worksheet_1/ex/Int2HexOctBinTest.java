package Worksheet_1.ex;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Int2HexOctBinTest {
    private Int2HexOctBin one;


    @Before
    public void setUp() throws Exception {
        one = new Int2HexOctBin();
    }

    @Test
    public void int2Boh() throws Exception {
        assertEquals(one.int2Boh(11).get("0d"), "11");
    }

    @Test
    public void getOct() throws Exception {
        assertEquals(one.int2Boh(77).get("0o"), "115");
    }
}
