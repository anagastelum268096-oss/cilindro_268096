/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package implementaciones;

import excepciones.BolsaException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.function.Executable;

public class BolsaTest {

    @Test
    public void testConstructorExcepcion() {
        assertThrows(BolsaException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
            }
        });
    }

    @Test
    public void testAgregaYRemueve() {
        Bolsa b = new Bolsa(5);
        b.agrega(10);
        b.agrega(20);
        assertEquals(2, b.obtenNumObjetos());
        assertTrue(b.contiene(10));

        Integer elim = b.remueve(10);
        assertEquals(10, elim);
        assertFalse(b.contiene(10));
    }

    @Test
    public void testRemueveAleatorioYLimpia() {
        Bolsa b = new Bolsa(3);
        b.agrega(1);
        b.agrega(2);
        b.agrega(3);
        Integer eliminado = b.remueve();
        assertNotNull(eliminado);
        b.limpia();
        assertTrue(b.vacia());
    }
}
