package com.ZenZaiko.ZenZaiko.repository;

import com.ZenZaiko.ZenZaiko.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
