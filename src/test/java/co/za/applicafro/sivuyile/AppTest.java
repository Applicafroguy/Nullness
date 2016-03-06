package co.za.applicafro.sivuyile;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    App app = new App();

    @Test
    public void testNull(){
        //app.setName("s");
        Assert.assertNull(app.getName());
    }
}
