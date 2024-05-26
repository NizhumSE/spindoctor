package com.client.newsBlog.dto.adminPanel.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class PermissionSubCategoryRequestDTO {
    private String permissionSubCategoryId;
    private String permissionName;
    private String subCategoryName;
    private String subCategoryURL;
    private String menuIconPath;
}
