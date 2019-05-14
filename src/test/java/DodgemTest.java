import Attractions.Dodgem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemTest {


    Dodgem dodgem;

    @Before
    public void before(){
        dodgem = new Dodgem("Bumper Cars", 6);
    }

    @Test
    public void hasName(){
        assertEquals("Bumper Cars", dodgem.getName());
    }

    @Test
    public void hasRating(){
        assertEquals(6, dodgem.getRating());
    }
}
