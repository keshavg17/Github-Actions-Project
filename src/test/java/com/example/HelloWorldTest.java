package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloWorldTest {

    @Test
    public void testGetMessage() {
        assertEquals("Hello, GitHub Actions!", HelloWorld.getMessage());
    }
}