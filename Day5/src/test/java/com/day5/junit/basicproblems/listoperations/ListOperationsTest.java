package com.day5.junit.basicproblems.listoperations;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
public class ListOperationsTest {

        private final ListOperations listManager = new ListOperations();
        private final List<Integer> list = new ArrayList<>();

        @Test
        public void testAddElement() {
            listManager.addElement(list, 5);
            assertEquals(1, list.size());
            assertTrue(list.contains(5));
        }

        @Test
        public void testRemoveElement() {
            listManager.addElement(list, 10);
            listManager.removeElement(list, 10);
            assertFalse(list.contains(10));
        }

        @Test
        public void testGetSize() {
            listManager.addElement(list, 1);
            listManager.addElement(list, 2);
            assertEquals(2, listManager.getSize(list));
        }
    }