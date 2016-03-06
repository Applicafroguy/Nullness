package co.za.applicafro.sivuyile;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    @Test
    public void testNull(){
        Assert.assertNull(new App().setName());
    }
}
