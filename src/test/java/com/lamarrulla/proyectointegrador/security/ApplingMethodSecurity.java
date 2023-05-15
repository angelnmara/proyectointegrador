package com.lamarrulla.proyectointegrador.security;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ApplingMethodSecurity {
    @Test
    @Secured("ROLE_VIEWER")
    public void getUsername() {
        SecurityContext securityContext = SecurityContextHolder.getContext();
        System.console().printf(securityContext.getAuthentication().getName());
    }
}
