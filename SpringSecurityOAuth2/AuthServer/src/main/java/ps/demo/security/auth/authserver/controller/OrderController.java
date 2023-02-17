package ps.demo.security.auth.authserver.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import ps.demo.commons.ApiResponse;

@Slf4j
@RestController
public class OrderController {

    @GetMapping("/orders")
    public ApiResponse<String> orders(){
        return ApiResponse.ok("order list");
    }

    @GetMapping("/order/{oid}")
    public ApiResponse<String> order(@PathVariable String oid){
        return ApiResponse.ok("order info : oid = " + oid);
    }
}
