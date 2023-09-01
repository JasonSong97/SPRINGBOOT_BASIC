package me.songjaegeun.springbootdeveloper.service;

import lombok.RequiredArgsConstructor;
import me.songjaegeun.springbootdeveloper.config.jwt.TokenProvider;
import me.songjaegeun.springbootdeveloper.domain.User;
import me.songjaegeun.springbootdeveloper.repository.RefreshTokenRepository;
import org.springframework.stereotype.Service;

import java.time.Duration;

@Service
@RequiredArgsConstructor
public class TokenService {

    private final TokenProvider tokenProvider;
    private final RefreshTokenService refreshTokenService;
    private final UserService userService;

    public String createNewAccessToken(String refreshToken) {
        if (!tokenProvider.validToken(refreshToken)) {
            throw new IllegalArgumentException("Unexpected token");
        }

        Long userId = refreshTokenService.findByRefreshToken(refreshToken).getUserId();
        User user = userService.findById(userId);
        return tokenProvider.generateToken(user, Duration.ofHours(2)); // access 토큰 짧게
    }
}
