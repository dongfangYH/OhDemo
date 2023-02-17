package ps.demo.security.auth.authserver.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

/**
 * spring security oauth2 整合 jwt
 */
@Configuration
public class JwtTokenStoreConfig {

    @Value("${jwt.secretKey}")
    private String secretKey;

    @Bean
    JwtAccessTokenConverter jwtAccessTokenConverter(){
        JwtAccessTokenConverter accessTokenConverter = new JwtAccessTokenConverter();
        accessTokenConverter.setSigningKey(secretKey);
        return accessTokenConverter;
    }

    @Bean
    JwtTokenEnhancer jwtTokenEnhancer(){
        return new JwtTokenEnhancer();
    }

    @Bean("jwtTokenStore")
    TokenStore jwtTokenStore(){
        return new JwtTokenStore(jwtAccessTokenConverter());
    }
}
