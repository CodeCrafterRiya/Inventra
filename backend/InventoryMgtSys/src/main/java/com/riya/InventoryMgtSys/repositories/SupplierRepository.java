package com.riya.InventoryMgtSys.repositories;

import com.riya.InventoryMgtSys.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
