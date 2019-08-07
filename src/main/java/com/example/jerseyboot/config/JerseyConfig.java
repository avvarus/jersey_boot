package com.example.jerseyboot.config;

import com.example.jerseyboot.controller.JerseyController;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(JerseyController.class);
    }
}
