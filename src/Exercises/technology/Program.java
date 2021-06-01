package Exercises.technology;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Program {
    @Test
    public void testLaptop(){
        Laptop data = new Laptop(500,8,true,2020);
        assertEquals(500,data.getStorage());

    }
    public void testSmartPhone(){
        SmartPhone data = new SmartPhone(512,4,false,"iphone",11);
        assertEquals(11,data.getBrand());
    }
}
