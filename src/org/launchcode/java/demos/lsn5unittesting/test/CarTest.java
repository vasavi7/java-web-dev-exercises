package org.launchcode.java.demos.lsn5unittesting.test;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CarTest {
    @Test
    public void emplyTest() {
        assertEquals(10,10,.001);
    }


    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    //TODO: constructor sets gasTankLevel properly
    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception

}
