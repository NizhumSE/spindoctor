package com.client.newsBlog.service.adminPanel.adminPanelInterfaces;

import com.client.newsBlog.dto.adminPanel.request.PermissionRequestDTO;

import java.util.List;

public interface AdminPanelPermissionService {
    List<PermissionRequestDTO> getAllPermissions();
}
