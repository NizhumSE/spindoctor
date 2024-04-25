package com.client.newsBlog.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private String userImagePath;
    @OneToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name = "role_id")
    private Role role;
}
