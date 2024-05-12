package com.client.newsBlog.service.adminPanel;

import com.client.newsBlog.dto.adminPanel.request.PermissionRequestDTO;
import com.client.newsBlog.mapper.adminPanel.EntityToDTO.PermissionDTOGetterMapper;
import com.client.newsBlog.repository.PermissionsRepository;
import com.client.newsBlog.service.adminPanel.adminPanelInterfaces.AdminPanelPermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminPanelPermissionServiceImpl implements AdminPanelPermissionService {
    private final PermissionsRepository permissionsRepository;
    private final PermissionDTOGetterMapper permissionDTOGetterMapper;

    public List<PermissionRequestDTO> getAllPermissions() {
        return permissionsRepository.findAll().stream().map(permissionDTOGetterMapper).toList();
    }
}
