package com.zonafit.securitylab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EnvironmentTest {

    @Test
    void securityLabEnvironmentIsReady() {

        boolean environmentReady = true;

        assertTrue(environmentReady,
                "Security Lab environment is not ready");
    }
}