package com.csc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestLinks {
    Links<String> links;

    @BeforeEach
    void setUp() {
        links = new Links<>();
    }

    @Test
    void testAppendAndGet() {
        links.append("red");
        assertEquals("red", links.get(0));
    }

    @Test
    void testPrepend() {
        links.prepend("blue");
        links.prepend("red");
        assertEquals("red", links.get(0));
        assertEquals("blue", links.get(1));
    }

    @Test
    void testSizeMethod() {
        links.append("red");
        links.append("blue");
        links.append("green");
        assertEquals(2, links.size(links.getHead().getNext()));
    }

    @Test
    void testGenericType() {
        Links<Integer> intLinks = new Links<>();
        intLinks.append(1);
        intLinks.append(2);
        intLinks.append(3);

        assertEquals(1, intLinks.get(0));
        assertEquals(3, intLinks.size(intLinks.getHead()));
    }
}
