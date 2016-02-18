package p1;

import static org.junit.Assert.*;
import org.junit.Test;
/**
 * Created by carguell on 2/16/2016.
 */
public class balloonTest {

    @Test
    public void testDefaultSize() throws Exception {
        // create a default balloon
        balloon b = new balloon();


        // check its size
        assertEquals(10, b.getSize());

        //check color
        assertEquals("moab", b.getColor());
    }
}