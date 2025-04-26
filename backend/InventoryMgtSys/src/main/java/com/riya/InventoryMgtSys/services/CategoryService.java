package com.riya.InventoryMgtSys.services;

import com.riya.InventoryMgtSys.dtos.CategoryDTO;
import com.riya.InventoryMgtSys.dtos.Response;

public interface CategoryService {

    Response createCategory(CategoryDTO categoryDTO);

    Response getAllCategories();

    Response getCategoryById(Long id);

    Response updateCategory(Long id, CategoryDTO categoryDTO);

    Response deleteCategory(Long id);
}
