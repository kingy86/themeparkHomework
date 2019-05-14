import Stalls.TobaccoStand;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStandTest {

    TobaccoStand tobaccoStand;

    @Before
    public void before(){
        tobaccoStand = new TobaccoStand("Smokies", "Cheech", 3, 8);
    }

    @Test
    public void hasName(){
        assertEquals("Smokies", tobaccoStand.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(8, tobaccoStand.getRating());
    }
}
