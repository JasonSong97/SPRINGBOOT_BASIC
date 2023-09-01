package me.songjaegeun.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.songjaegeun.springbootdeveloper.domain.User;
import me.songjaegeun.springbootdeveloper.dto.AddUserRequest;
import me.songjaegeun.springbootdeveloper.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public Long save(AddUserRequest dto) {
        return userRepository.save(User.builder()
                .email(dto.getEmail())
                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                .build()).getId();
    }
}
