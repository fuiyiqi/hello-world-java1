package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testGetGreeting() {
        assertEquals("Hello, World!", HelloWorld.getGreeting()); // ✅ static call
    }
}
