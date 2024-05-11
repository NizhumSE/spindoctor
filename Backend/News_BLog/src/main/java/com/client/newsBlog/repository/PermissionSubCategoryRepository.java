package com.client.newsBlog.repository;

import com.client.newsBlog.model.PermissionSubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PermissionSubCategoryRepository extends JpaRepository<PermissionSubCategory, Long> {

}
