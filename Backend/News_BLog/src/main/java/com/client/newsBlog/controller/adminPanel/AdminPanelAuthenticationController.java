package com.client.newsBlog.controller.adminPanel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AdminPanelAuthenticationController {
    @GetMapping("/login")
    public String login() {
        return "AdminPanel/mise/login_admin";
    }
}
