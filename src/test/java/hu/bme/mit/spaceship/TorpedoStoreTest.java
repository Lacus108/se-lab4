package hu.bme.mit.spaceship;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TorpedoStoreTest {

    @Test
    void fire_Success() {
        TorpedoStore store = new TorpedoStore(3, 0.0);

        assertTrue(store.fire(2));
        assertEquals(1, store.getTorpedoCount());
        assertFalse(store.isEmpty());
    }

    @Test
    void fire_Failure() {
        TorpedoStore store = new TorpedoStore(2, 100.0);

        assertFalse(store.fire(1));
        assertEquals(2, store.getTorpedoCount());
    }

    @Test
    void emptyStore() {
        TorpedoStore store = new TorpedoStore(1, 0.0);

        assertTrue(store.fire(1));
        assertTrue(store.isEmpty());
        assertEquals(0, store.getTorpedoCount());
    }
}
