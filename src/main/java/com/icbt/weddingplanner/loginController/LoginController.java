package com.icbt.weddingplanner.loginController;

import com.icbt.weddingplanner.appuser.AppUser;
import com.icbt.weddingplanner.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/login")
@AllArgsConstructor
public class LoginController {

    private final AppUserService appUserService;

    @PostMapping
    public LoginResponse login(@RequestBody LoginRequest loginRequest){
        return appUserService.login(loginRequest);
    }

}
