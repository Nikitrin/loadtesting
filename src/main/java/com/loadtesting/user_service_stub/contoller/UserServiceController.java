package com.loadtesting.user_service_stub.contoller;

import com.loadtesting.user_service_stub.model.Request;
import com.loadtesting.user_service_stub.model.Response;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-service")
public class UserServiceController {

    @PostMapping("/check-id")
    public Response checkId(@RequestBody Request body) {
        return new Response(body.getId(), true);
    }

}
