import Attractions.Playground;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void before(){
        playground = new Playground("Woodland Area", 8);
    }

    @Test
    public void hasName(){
        assertEquals("Woodland Area", playground.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(8, playground.getRating());
    }
}
