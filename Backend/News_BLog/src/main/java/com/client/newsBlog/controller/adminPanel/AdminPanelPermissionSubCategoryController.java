package com.client.newsBlog.controller.adminPanel;

import com.client.newsBlog.dto.adminPanel.request.PermissionSubCategoryRequestDTO;
import com.client.newsBlog.mapper.adminPanel.EntityToDTO.PermissionSubCategoryDTOGetterMapper;
import com.client.newsBlog.repository.PermissionSubCategoryRepository;
import com.client.newsBlog.service.adminPanel.adminPanelInterfaces.AdminPanelPermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/auth/permissionsSubCategory")
@RequiredArgsConstructor
public class AdminPanelPermissionSubCategoryController {
    private final PermissionSubCategoryRepository permissionSubCategoryRepository;
    private final PermissionSubCategoryDTOGetterMapper permissionSubCategoryDTOGetterMapper;
    private final AdminPanelPermissionService adminPanelPermissionService;
    @GetMapping("/{permissionName}")
    public String PermissionSubCategory(Model model, @PathVariable("permissionName") String permissionName, @ModelAttribute("permissionSubCategoryDTO") PermissionSubCategoryRequestDTO permissionSubCategoryDTO) {
        List<PermissionSubCategoryRequestDTO> permissionSubCategoryDTOList = permissionSubCategoryDTOGetterMapper.apply(permissionSubCategoryRepository.findByPermissions_permissionName(permissionName));
        model.addAttribute("permissionSubCategoryDTOList", permissionSubCategoryDTOList);

        model.addAttribute("permissionNameListDTO", adminPanelPermissionService.getAllPermissionName());
        model.addAttribute("selectedPermissionName", permissionName);
        return "AdminPanel/Permission/permissions-subCategory";
    }
}
