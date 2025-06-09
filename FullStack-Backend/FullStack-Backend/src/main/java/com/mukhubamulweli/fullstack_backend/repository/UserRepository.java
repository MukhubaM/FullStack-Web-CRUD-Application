package com.mukhubamulweli.fullstack_backend.repository;

import com.mukhubamulweli.fullstack_backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
