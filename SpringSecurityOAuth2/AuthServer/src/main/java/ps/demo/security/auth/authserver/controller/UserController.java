package ps.demo.security.auth.authserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ps.demo.commons.ApiResponse;

@Slf4j
@RestController
public class UserController {

    @GetMapping("/user")
    public ApiResponse<String> user(){
        return ApiResponse.ok("user info page");
    }

    @Secured("ROLE_admin")
    @GetMapping("users")
    public ApiResponse<String> users(){
        return ApiResponse.ok("user list");
    }
}
