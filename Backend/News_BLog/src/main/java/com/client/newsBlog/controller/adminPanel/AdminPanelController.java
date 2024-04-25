package com.client.newsBlog.controller.adminPanel;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("auth/dashboard")
@RequiredArgsConstructor
public class AdminPanelController {
    @GetMapping()
    public String getAdminPanel() {
        return "AdminPanel/admin-dashboard";
    }
}
