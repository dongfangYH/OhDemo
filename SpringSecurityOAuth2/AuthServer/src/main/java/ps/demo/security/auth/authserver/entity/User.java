package ps.demo.security.auth.authserver.entity;

import lombok.Data;

@Data
public class User {

    private Long id;
    private String username;
    private String password;
    private Long cTime;
    private Long uTime;
}
