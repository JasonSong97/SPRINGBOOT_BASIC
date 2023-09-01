package me.songjaegeun.springbootdeveloper.repository;

import me.songjaegeun.springbootdeveloper.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email); // 네임드 쿼리
}

