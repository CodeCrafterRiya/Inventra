package com.riya.InventoryMgtSys.repositories;

import com.riya.InventoryMgtSys.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
