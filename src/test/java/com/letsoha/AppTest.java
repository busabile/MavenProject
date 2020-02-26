package com.letsoha;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

//import static org.junit.*;
/**
 * Unit test for simple App.
 */
public class AppTest 
{
    // Instanciate the object of type App class
    private App b1;
    private App b2;
    private App b3 = b1;

    @Before
    public void beforeTest()
    {
        b1 = new App(2, "Lebusa");
        b2 = new App(2, "Lebusa");
    }
    @Test
    public void equalsEqualityTest() throws Exception
    {
        assertEquals(b1, b2);
        assertEquals(b1, b3);
        assertEquals(b1, b3);
    }
    @Test
    public void equalsIdentityTest()
    {
        assertSame(b1,b2);
        assertSame(b1,b3);
        assertSame(b2,b3);
    }
    @Ignore
    @Test
    public void equalsDisableTest()
    {
        assertSame(b1,b2);
        assertSame(b1,b3);
        assertSame(b2,b3);
    }

    @Test(timeout = 1000)
    public void infinity() {
        while (true);
    }

}
