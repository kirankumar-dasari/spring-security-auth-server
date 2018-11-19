package co.edureka.assignment.springsecurityauthserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/oauth")
public class PrincipalController {

    @GetMapping("/principal")
    public Principal user(Principal principal) {
        return principal;
    }

}
