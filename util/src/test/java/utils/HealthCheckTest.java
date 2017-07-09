package utils;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HealthCheckTest {
    @Test
    public void status() throws Exception {
        HealthCheck healthCheck = new HealthCheck();
        assertEquals("ok", healthCheck.status());
    }
}