/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entornos2711.InicioApp;
import entornos2711.contar;
import entornos2711.mostrar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class contarTest {

    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
 @Test
    public void Cuentas() {
        char[] letras={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C',
        'D','E','F','G','H','I','J','K','L','M','N','Ñ','O','P','Q','R','S','T','U','V','W','X','Y','Z',',','.',':','?','¿','<','>','!','¡'};
        int [] contador= new int[letras.length];
    InicioApp ob3= new InicioApp("hola");
    mostrar ob2= new mostrar();
    
    assertTrue("hola".equals(ob3.getFrase()));
    ob3.setFrase("adios");
    assertTrue(ob3.contarCaracteresTotal() == 5);
    assertTrue(ob3.contarNumeroPalabras() == 1);
    assertNotNull(ob3.contarTodosCaracteres(letras,contador));
    assertNotNull(ob2.textoCaracteresTotal(5));
    assertNotNull(ob2.textoNumeroPalabras(1));
    assertNotNull(ob2.textoTodosCaracteres(letras,contador));
    
    
    }
}
