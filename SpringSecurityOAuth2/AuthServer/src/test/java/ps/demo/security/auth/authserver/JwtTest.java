package ps.demo.security.auth.authserver;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.impl.Base64Codec;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class JwtTest {

    @Test
    public void testJwtToken(){

        JwtBuilder builder = Jwts.builder()
                .setId("12345")
                .setSubject("admin")
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, "you_server_private_key")
                .setExpiration(new Date(System.currentTimeMillis() + 1000L * 60 * 60));

        String token = builder.compact();
        String[] parts = token.split("\\.");
        System.out.println(Base64Codec.BASE64.decodeToString(parts[0]));
        System.out.println(Base64Codec.BASE64.decodeToString(parts[1]));
    }
}
