import Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Mr Whip", "James Brown", 1, 6);
    }

    @Test
    public void hasName(){
        assertEquals("Mr Whip", iceCreamStall.getName());
    }
}
