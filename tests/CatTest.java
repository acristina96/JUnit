import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Test
    public void getName() {
        Cat cat = new Cat("Mita");
        assertEquals("Mita", cat.getName());
    }

    @Test
    public void testIfHungry() throws Exception{
        Cat cat = new Cat("Mita");
        assertFalse(cat.isHungry());
    }

}