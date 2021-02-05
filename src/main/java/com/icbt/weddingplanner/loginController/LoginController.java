package com.icbt.weddingplanner.loginController;

import com.icbt.weddingplanner.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/login",consumes = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
@AllArgsConstructor
public class LoginController {

    private final AppUserService appUserService;

    @PostMapping(consumes = MediaType.ALL_VALUE)
    public LoginResponse login(LoginRequest loginRequest){
        return appUserService.login(loginRequest);
    }

}
