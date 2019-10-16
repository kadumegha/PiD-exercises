package exercises;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TestLinkedList {
    @Test
    public void testGetOnEmptyList() {
        LinkedList list = new LinkedList();
        boolean success = false;
        try {
            list.get(0);
            fail("should have thrown an exception");
        } catch (IndexOutOfBoundsException e) {
            success = true;
        }
        assertEquals(true, success);
    }

    @Test
    public void testGetOnListWithNode() {
        LinkedList list = new LinkedList();
        list.add(2);
        list.add(8);
        list.add(1);
        // first
        assertEquals(2, list.get(0));
        // last
        assertEquals(1, list.get(2));
        // middle
        assertEquals(8, list.get(1));
    }
}
