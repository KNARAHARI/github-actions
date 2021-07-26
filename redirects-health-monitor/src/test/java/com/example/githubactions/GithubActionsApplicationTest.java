package com.example.githubactions;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

@SpringBootTest
class GithubActionsApplicationTest {

    GithubActionsApplication app;

    @BeforeEach
    public void init() {
        app = new GithubActionsApplication();
    }

    @Test
    public void testAppSuccess() {
        String result = app.getStatus();
        assertEquals("OK", result);
    }

    @Test
    public void testAppFail() {
        String result = app.getStatus();
        assertNotEquals("NOTOK", result);
    }
}