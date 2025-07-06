package org.example.hooks;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import org.example.SpringContextHolder;

public class SpringHooks {

    @BeforeAll
    public static void beforeAll() {
        // Force context initialization before any scenario
        System.out.println("[SpringHooks] @BeforeAll called");
        SpringContextHolder.getContext();
    }

    @AfterAll
    public static void afterAll() {
        // Optionally clean up resources
        System.out.println("[SpringHooks] @AfterAll called");
        SpringContextHolder.closeContext();
    }
}