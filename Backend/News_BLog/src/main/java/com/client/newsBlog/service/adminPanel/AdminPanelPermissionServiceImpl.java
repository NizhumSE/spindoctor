package com.client.newsBlog.service.adminPanel;

import com.client.newsBlog.dto.adminPanel.request.PermissionRequestDTO;
import com.client.newsBlog.mapper.adminPanel.EntityToDTO.PermissionDTOGetterMapper;
import com.client.newsBlog.mapper.adminPanel.createMapperDTOtoEntity.PermissionRequestDTOSetterMapper;
import com.client.newsBlog.model.Permissions;
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
    private final PermissionRequestDTOSetterMapper permissionRequestDTOSetterMapper;
    public List<PermissionRequestDTO> getAllPermissions() {
        return permissionsRepository.findAll().stream().map(permissionDTOGetterMapper).toList();
    }

    @Override
    public String addPermission(PermissionRequestDTO permissionRequestDTO) {
        String param = "";
        Permissions permissions = permissionsRepository.findPermissionsByPermissionName(permissionRequestDTO.getPermissionName());
        if (permissions != null) {
            param = "permissionAlreadyExist";
        }
        permissions = null;
        permissions = permissionsRepository.findPermissionsByURL(permissionRequestDTO.getUrl());
        if (permissions != null) {
            param = "PermissionUrlAlreadyExist";
        }
        permissions = null;
        try {
            permissions = permissionRequestDTOSetterMapper.apply(permissionRequestDTO);
            permissionsRepository.save(permissions);
            param = "PermissionAdded";
        }catch (Exception e) {
            System.out.println(e);
            param = "SomethingWentWrong";
        }

        return param;
    }
}
