package com.client.newsBlog.controller.adminPanel;

import com.client.newsBlog.dto.adminPanel.request.PermissionRequestDTO;
import com.client.newsBlog.service.adminPanel.adminPanelInterfaces.AdminPanelPermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth/permissoins")
@RequiredArgsConstructor
public class AdminPanelPermissionController {
    private final AdminPanelPermissionService adminPanelPermissionService;

    @GetMapping("")
    public String showAllPermissions(Model model) {
        model.addAttribute("permissionDTOList", adminPanelPermissionService.getAllPermissions());
        return "AdminPanel/Permission/permissions-list";
    }

    @GetMapping("/add")
    public String addPermission(Model model, @ModelAttribute("permissionDTO") PermissionRequestDTO permissionDTO) {
        return "AdminPanel/Permission/add-permission";
    }
}
