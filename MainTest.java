/*
 * Rhett Brink - RBrin0551
 * CIT 4423 01
 * Sep 23, 2022
 * Windows 10
 */

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import javax.swing.JFrame;
import org.junit.Test;

public class MainTest {

    @Test
    public void MainTest1() throws Exception {
        JFrame testWindow = new JFrame();
        ArrayList<Double> testArrList = new ArrayList<Double>(0);
        testArrList.add(100.0);
        testArrList.add(100.0);
        testArrList.add(100.0);
        assertEquals(100.0, Main.fillAvg(testArrList, testWindow), 0.01);
    }

    @Test
    public void MainTest2() throws Exception {
        JFrame testWindow = new JFrame();
        ArrayList<Double> testArrList = new ArrayList<Double>(0);
        testArrList.add(50.0);
        testArrList.add(60.0);
        testArrList.add(100.0);
        assertEquals(70.00, Main.fillAvg(testArrList, testWindow), 0.01);
    }

    @Test
    public void MainTest3() throws Exception {
        JFrame testWindow = new JFrame();
        ArrayList<Double> testArrList = new ArrayList<Double>(0);
        testArrList.add(70000.0);
        testArrList.add(60000.0);
        testArrList.add(100000.0);
        assertEquals(76666.67, Main.fillAvg(testArrList, testWindow), 0.01);
    }
}