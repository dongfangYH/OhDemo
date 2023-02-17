package ps.demo.security.auth.authserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ps.demo.commons.ApiResponse;

@Slf4j
@RestController
public class AppController {

    @GetMapping
    public ApiResponse<String> index(){
        return ApiResponse.ok("ok");
    }
}
