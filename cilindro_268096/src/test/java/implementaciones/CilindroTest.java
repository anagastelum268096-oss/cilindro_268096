package implementaciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CilindroTest {

    @Test
    public void testConstructorExcepcion() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Cilindro(-2, 3);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Cilindro(2, -3);
        });
    }

    @Test
    public void testAreaYVolumen() {
        Cilindro c = new Cilindro(2, 5);
        assertEquals(87.9646, c.area(), 0.0001);
        assertEquals(62.8318, c.volumen(), 0.0001);
    }

    @Test
    public void testToString() {
        Cilindro c = new Cilindro(3, 4);
        assertEquals("Cilindro(3.0, 4.0)", c.toString());
    }
}
