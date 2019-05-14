import Stalls.CandyFlossStand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStandTest {

    CandyFlossStand candyFlossStand;

    @Before
    public void before(){
        candyFlossStand = new CandyFlossStand("So Fluffy", "John Comb", 2, 6);
    }

    @Test
    public void hasName(){
        assertEquals("So Fluffy", candyFlossStand.getName());
    }
}
