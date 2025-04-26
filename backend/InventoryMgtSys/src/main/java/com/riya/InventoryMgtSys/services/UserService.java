package com.riya.InventoryMgtSys.services;

import com.riya.InventoryMgtSys.dtos.LoginRequest;
import com.riya.InventoryMgtSys.dtos.RegisterRequest;
import com.riya.InventoryMgtSys.dtos.Response;
import com.riya.InventoryMgtSys.dtos.UserDTO;
import com.riya.InventoryMgtSys.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}
