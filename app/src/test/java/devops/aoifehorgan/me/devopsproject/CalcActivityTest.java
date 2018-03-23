package devops.aoifehorgan.me.devopsproject;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalcActivityTest {
    @Test
    public void onCreate() throws Exception {
    }

    @Test
    public void addC() throws Exception {
        float actual = CalcActivity.addC(2,2);
        float expected = 4;

        assertEquals("Correct",expected,actual,0.001);
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