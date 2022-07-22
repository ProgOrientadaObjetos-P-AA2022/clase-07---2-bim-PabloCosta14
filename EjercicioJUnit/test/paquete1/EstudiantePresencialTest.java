/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package paquete1;

import java.lang.reflect.Field;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author UTPL
 */
public class EstudiantePresencialTest {

    private EstudiantePresencial instance;

    public EstudiantePresencialTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {

        instance = new EstudiantePresencial();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of establecerNumeroCreditos method, of class EstudiantePresencial.
     *
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testEstablecerNumeroCreditos() throws
            NoSuchFieldException,
            IllegalArgumentException,
            IllegalAccessException {
        System.out.println("establecerNumeroCreditos");
        int numero = 25;

        instance.establecerNumeroCreditos(numero);

        Field field = instance.getClass().getDeclaredField("numeroCreditos");
        field.setAccessible(true);
        assertEquals(field.get(instance), 25);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of establecerCostoCredito method, of class EstudiantePresencial.
     *
     * @throws java.lang.NoSuchFieldException
     * @throws java.lang.IllegalAccessException
     */
    @Test
    public void testEstablecerCostoCredito() throws
            NoSuchFieldException,
            IllegalArgumentException,
            IllegalAccessException {
        
        System.out.println("establecerCostoCredito");
        double valor = 2.0;

        instance.establecerCostoCredito(valor);

        Field field = instance.getClass().getDeclaredField("costoCreditos");
        field.setAccessible(true);
        assertEquals(field.get(instance), 2.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of calcularMatriculaPresencial method, of class
     * EstudiantePresencial.
     */
    @Test
    public void testCalcularMatriculaPresencial() {
        System.out.println("calcularMatriculaPresencial");

        instance.calcularMatriculaPresencial();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerNumeroCreditos method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerNumeroCreditos() {
        System.out.println("obtenerNumeroCreditos");

        int expResult = 0;
        int result = instance.obtenerNumeroCreditos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerCostoCredito method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerCostoCredito() {
        System.out.println("obtenerCostoCredito");
        double expResult = 0.0;
        double result = instance.obtenerCostoCredito();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerMatriculaPresencial method, of class EstudiantePresencial.
     */
    @Test
    public void testObtenerMatriculaPresencial() {
        System.out.println("obtenerMatriculaPresencial");

        double expResult = 0.0;
        double result = instance.obtenerMatriculaPresencial();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

}
