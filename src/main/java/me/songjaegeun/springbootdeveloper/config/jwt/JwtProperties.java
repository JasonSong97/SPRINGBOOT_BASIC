package me.songjaegeun.springbootdeveloper.config.jwt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@ConfigurationProperties("jwt") // Java 에서 Properties 값을 가져옴
public class JwtProperties {

    private String issuer;
    private String secretKey;
}
