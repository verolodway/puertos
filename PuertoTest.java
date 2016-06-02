

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class PuertoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class PuertoTest
{
    /**
     * Default constructor for test class PuertoTest
     */
    public PuertoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void test003()
    {
        Puerto puerto1 = new Puerto();
        Velero velero1 = new Velero(2, "AAA", 3.5F, 2190);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(344, "BBB", 3.6F, 2194);
        Yate yate1 = new Yate(543, 324893, "HHH", 3.4F, 1234);
        Yate yate2 = new Yate(43284, 21, "VVV", 4.3F, 2090);
        Cliente cliente1 = new Cliente("Mitchy", "66666");
        Cliente cliente2 = new Cliente("Devil", "54389");
        Cliente cliente3 = new Cliente("Suicidal", "548392");
        Cliente cliente4 = new Cliente("Neko", "90909");
        assertEquals(0, puerto1.addAlquiler(4, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(6, cliente2, embarcac1));
        assertEquals(2, puerto1.addAlquiler(7, cliente3, yate1));
        assertEquals(3, puerto1.addAlquiler(45, cliente4, yate2));
        assertEquals(1.2993435E7, puerto1.liquidarAlquiler(3), 0.1);
        assertEquals(-1.0, puerto1.liquidarAlquiler(50), 0.1);
        assertEquals(9.763104E7, puerto1.liquidarAlquiler(2), 0.1);
        assertEquals(103416.0, puerto1.liquidarAlquiler(1), 0.1);
        assertEquals(740, puerto1.liquidarAlquiler(0), 0.1);
    }
    
       @Test
    public void test1()
    {
        Puerto puerto1 = new Puerto();
        Cliente cliente1 = new Cliente("batman", "qwert");
        Cliente cliente2 = new Cliente("joker", "asdf");
        Cliente cliente3 = new Cliente("pinguino", "zxcv");
        Cliente cliente4 = new Cliente("doscaras", "poipu");
        Velero velero1 = new Velero(1, "ivypoison", 10, 666);
        EmbarcacionDeportiva embarcac1 = new EmbarcacionDeportiva(100, "murder", 10, 666);
        Yate yate1 = new Yate(5, 100, "harlequin", 100, 666);
        Velero velero2 = new Velero(1, "solomonKane", 100, 666);
        assertEquals(0, puerto1.addAlquiler(5, cliente1, velero1));
        assertEquals(1, puerto1.addAlquiler(5, cliente2, embarcac1));
        assertEquals(2, puerto1.addAlquiler(5, cliente3, yate1));
        assertEquals(800.0, puerto1.liquidarAlquiler(0), 0.1);
        assertEquals(-1.0, puerto1.liquidarAlquiler(0), 0.1);
        assertEquals(0, puerto1.addAlquiler(3, cliente4, velero2));
    }
}



