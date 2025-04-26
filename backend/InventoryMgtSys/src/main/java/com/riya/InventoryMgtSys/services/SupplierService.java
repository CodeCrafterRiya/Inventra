package com.riya.InventoryMgtSys.services;

import com.riya.InventoryMgtSys.dtos.Response;
import com.riya.InventoryMgtSys.dtos.SupplierDTO;

public interface SupplierService {

    Response addSupplier(SupplierDTO supplierDTO);

    Response updateSupplier(Long id, SupplierDTO supplierDTO);

    Response getAllSupplier();

    Response getSupplierById(Long id);

    Response deleteSupplier(Long id);

}
