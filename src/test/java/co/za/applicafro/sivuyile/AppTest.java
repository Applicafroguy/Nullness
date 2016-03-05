package co.za.applicafro.sivuyile;


import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    App app = new App();
    app.setName("Super");
    
    @Test
    public void testNull(){
        Assert.assertNull(new App().getName());
    }
}
