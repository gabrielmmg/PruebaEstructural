package pruebaestructural;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;

/**
 *
 * @author Ivan
 */
public class CaminoBasicoTest {

    static CaminoBasico cb;

    public CaminoBasicoTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        cb = new CaminoBasico();
    }
    
    @Test
    public void test1CBNumeroMayor() {
        System.out.println("Caso Prueba 1. Metodo numeroMayor. Camino a>b=TRUE, a>c=TRUE. I-1-2-3-7-F");
        int a = 12;
        int b = 6;
        int c = 8;
        int expResult = a;
        int result = cb.numeroMayor(a, b, c);
        assertEquals("Error resultado", expResult, result);
    }
    
    /* @Test
    public void test2CBNumeroMayor() {
        System.out.println("Caso Prueba 2. Metodo numeroMayor. Camino a>b=FALSE, a>c=FALSE, c>b=FALSE. I-1-2-4-6-7-F");
        int a = 12;
        int b = 18;
        int c = 16;
        int expResult = b;
        int result = cb.numeroMayor(a, b, c);
        assertEquals("Error resultado", expResult, result);
    } */
    
    @Test
    public void test2CBNumeroMayor() {
        System.out.println("Caso Prueba 2. Metodo numeroMayor. Camino a>b=TRUE, a>c=FALSE, c>b=TRUE. I-1-2-4-5-7-F");
        int a = 20;
        int b = 18;
        int c = 24;
        int expResult = c;
        int result = cb.numeroMayor(a, b, c);
        assertEquals("Error resultado", expResult, result);
    }
    
    
    @Test
    public void test3CBNumeroMayor() {
        System.out.println("Caso Prueba 3. Metodo numeroMayor. Camino a>b=FALSE, c>b=TRUE. I-1-4-5-7-F");
        int a = 8;
        int b = 12;
        int c = 21;
        int expResult = c;
        int result = cb.numeroMayor(a, b, c);
        assertEquals("Error resultado", expResult, result);
    }
    
     @Test
    public void test4CBNumeroMayor() {
        System.out.println("Caso Prueba 4. Metodo numeroMayor. Camino a>b=FALSE, c>b=FALSO. I-1-4-6-7-F");
        int a = 3;
        int b = 14;
        int c = 10;
        int expResult = b;
        int result = cb.numeroMayor(a, b, c);
        assertEquals("Error resultado", expResult, result);
    } 
    
    @Test
    public void test5CBNumeroMayor() {
        System.out.println("Caso Prueba 3. Metodo numeroMayor. Camino a>b=FALSE, a>c=TRUE. I-1-4-5-7-F");
        int a = 3;
        int b = 12;
        int c = 21;
        int expResult = c;
        int result = cb.numeroMayor(a, b, c);
        assertEquals("Error resultado", expResult, result);
    }
    

    @Test
    public void test1CBCalculoMedia1() {
        System.out.println("Caso Prueba 1. Metodo calculoMedia1. Camino x<0=TRUE. I-1-4-5-F");
        int x = -5;
        int y = 0;
        int expResult = 0;
        int result = cb.calculoMedia1(x, y);
        assertEquals("Error resultado", expResult, result);
    }
    
    @Test
    public void test2CBCalculoMedia1() {
        System.out.println("Caso Prueba 2. Metodo calculoMedia1. Camino x<0=FALSE, y < 0. I-1-2-4-5-F");
        int x = 8;
        int y = -3;
        int expResult = 0;
        int result = cb.calculoMedia1(x, y);
        assertEquals("Error resultado", expResult, result);
    }
    
    @Test
    public void test3CBCalculoMedia1() {
        System.out.println("Caso Prueba 3. Metodo calculoMedia1. Camino x>=0, y >= 0. I-1-2-3-4-5-F");
        int x = 8;
        int y = 6;
        int expResult = 7;
        int result = cb.calculoMedia1(x, y);
        assertEquals("Error resultado", expResult, result);
    }

}
