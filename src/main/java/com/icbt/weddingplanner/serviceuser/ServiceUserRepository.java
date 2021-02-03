package com.icbt.weddingplanner.serviceuser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ServiceUserRepository extends JpaRepository<ServiceUser,Long> {
    Optional<ServiceUser> findByEmail(String email);
}
