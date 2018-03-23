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
        float actual = CalcActivity.subtractC(3,1);
        float expected = 2;
        assertEquals("Correct",expected,actual,0.001);
    }

    @Test
    public void divide() throws Exception {
        float actual = CalcActivity.divideC(4,2);
        float expected = 2;
        assertEquals("Correct",expected,actual,0.001);
    }

    @Test
    public void multiply() throws Exception {
        float actual = CalcActivity.multiplyC(5,2);
        float expected = 10;
        assertEquals("Correct",expected,actual,0.001);
    }

}