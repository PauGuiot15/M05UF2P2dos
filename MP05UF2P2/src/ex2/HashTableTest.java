package ex2;

import ex2.HashTable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class HashTableTest {

    @Test
    public void testPutAndGet() {
        HashTable hashTable = new HashTable();
        hashTable.put("key1", "value1");
        hashTable.put("key2", "value2");
        assertEquals("value1", hashTable.get("key1"));
        assertEquals("value2", hashTable.get("key2"));
    }
    @Test
    public void testDrop() {
        HashTable hashTable = new HashTable();
        hashTable.put("key1", "value1");
        hashTable.drop("key1");
        assertNull(hashTable.get("key1"));
    }

    @Test
    public void testCountAndSize() {
        HashTable hashTable = new HashTable();
        assertEquals(0, hashTable.count());
        assertEquals(16, hashTable.size());
        hashTable.put("key1", "value1");
        assertEquals(1, hashTable.count());
        hashTable.put("key2", "value2");
        assertEquals(2, hashTable.count());
    }
}
