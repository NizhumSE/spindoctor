package com.client.newsBlog.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "role_permission")
public class RolePermission {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_permission_id")
    private Long rolePermissionId;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "permission_id")
    private Permissions permissions;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "role_id")
    private Role role;
}
