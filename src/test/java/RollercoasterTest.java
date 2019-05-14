import Attractions.Rollercoaster;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;

    @Before
    public void before(){
        rollercoaster = new Rollercoaster("Purple Gaze", 8);
    }

    @Test
    public void hasName(){
        assertEquals("Purple Gaze", rollercoaster.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(8, rollercoaster.getRating());
    }
}
