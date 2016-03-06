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
    public void testNonNullness(){

        App app = new App();
        app.setName("sup");

        Assert.assertNotNull(app.getName());
    }
}
