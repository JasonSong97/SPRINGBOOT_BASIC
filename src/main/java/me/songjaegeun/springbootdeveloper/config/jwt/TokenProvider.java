package me.songjaegeun.springbootdeveloper.config.jwt;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Header;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.RequiredArgsConstructor;
import me.songjaegeun.springbootdeveloper.domain.User;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class TokenProvider {

    private final JwtProperties jwtProperties;

    public String generateToken(User user, Duration expiredAt) {
        Date now = new Date();
        return makeToken(new Date(now.getTime() + expiredAt.toMillis()), user);
    }

    // 1. JWT 토큰 생성
    private String makeToken(Date expiry, User user) {
        Date now = new Date();

        return Jwts.builder()
                // HEADER: typ
                .setHeaderParam(Header.TYPE, Header.JWT_TYPE) // 헤더 type : JWT
                // PAYLOAD: iss, iat, exp, sub, claim
                .setIssuer(jwtProperties.getIssuer()) // 내용 iss : jaegeunsong97@gmail.com(propertise 파일에서 설정한 값)
                .setIssuedAt(now) // 내용 iat : 현재시간
                .setExpiration(expiry) // 내용 exp : expiry 멤버 변수값
                .setSubject(user.getEmail()) // 내용 sub : 유저의 이메일
                .claim("id", user.getId()) // 클레임 id : 유저 ID
                // SIGN
                .signWith(SignatureAlgorithm.HS256, jwtProperties.getSecretKey()) // 서명 : 비밀값과 함께 해시값을 HS256 방식으로 암호화
                .compact();
    }

    // 2. JWT 토큰 유효성 검증 메소드
    public boolean validToken(String token) {
        try {
            Jwts.parser()
                    .setSigningKey(jwtProperties.getSecretKey()) // 복호화
                    .parseClaimsJws(token);
            return true;
        } catch (Exception e) {
            return false; // 에러 발생 = 유효하지 않은 토큰
        }
    }

    // 3. 토큰 기반으로 인증 정보를 가져오는 메소드, 즉 인증 정보를 담은 객체 Authentication 반환
    public Authentication getAuthentication(String token) {
        Claims claims = getClaims(token); // getClaims : 복호화 -> Claim 가져옴
        Set<SimpleGrantedAuthority> authorities = Collections.singleton(new SimpleGrantedAuthority("ROLE_USER"));

        return new UsernamePasswordAuthenticationToken(
                new org.springframework.security.core.userdetails.User(
                        claims.getSubject(), "", authorities), token, authorities);
    }

    // 4. 토큰 기반으로 유저 ID를 가져오는 메소드
    public Long getUserId(String token) {
        Claims claims = getClaims(token);
        return claims.get("id", Long.class);
    }

    private Claims getClaims(String token) {
        return Jwts.parser()
                .setSigningKey(jwtProperties.getSecretKey()) // 복호화
                .parseClaimsJws(token)
                .getBody(); // 내용 sub : 유저의 이메일 꺼내기
    }
}
