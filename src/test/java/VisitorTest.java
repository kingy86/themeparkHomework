import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(16, 175, 20.00);
    }

    @Test
    public void hasAge(){
        assertEquals(16, visitor.getAge());
    }

    @Test
    public void hasHeight(){
        assertEquals(175, visitor.getHeight());
    }
}
