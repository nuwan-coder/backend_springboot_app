package com.icbt.weddingplanner.welcomeController;

import com.icbt.weddingplanner.appuser.AppUser;
import com.icbt.weddingplanner.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class WelcomeController {

    private final AppUserService appUserService;

    @GetMapping()
    public List<AppUser> getAllUser(){
        return appUserService.getAppUser();
    }

}
