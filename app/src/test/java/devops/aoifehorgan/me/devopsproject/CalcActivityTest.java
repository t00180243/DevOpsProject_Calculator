package devops.aoifehorgan.me.devopsproject;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalcActivityTest {
    @Test
    public void onCreate() throws Exception {
    }

    @Test
    public void addC() throws Exception {
        assertEquals(4,2+2);
    }

    @Test
    public void subtract() throws Exception {
        assertEquals(2,4-2);
    }

    @Test
    public void divide() throws Exception {
        assertEquals(2,4/2);
    }

    @Test
    public void multiply() throws Exception {
        assertEquals(4,2*2);
    }

}