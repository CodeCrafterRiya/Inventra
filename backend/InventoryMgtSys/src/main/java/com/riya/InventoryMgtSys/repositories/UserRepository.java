package com.riya.InventoryMgtSys.repositories;

import com.riya.InventoryMgtSys.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}
